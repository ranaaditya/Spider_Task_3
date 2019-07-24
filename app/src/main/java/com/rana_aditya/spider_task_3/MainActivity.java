package com.rana_aditya.spider_task_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static final String BASE_URL = "https://od-api.oxforddictionaries.com/api/v2/";
    private Button button;
    private EditText editText;
    private TextView textView,temptextreq;
   public  String word;
   public String root_word;
    private jsonplaceholderinterface api;
    int m;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        api = retrofit.create(jsonplaceholderinterface.class);
        button = findViewById(R.id.button);
        temptextreq=findViewById(R.id.aditya);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textnested);
        word = editText.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                if (!editText.getText().toString().isEmpty()){
                    textView.setText("");

           getroot_word(editText.getText().toString().toLowerCase());

           //getetymology(temptextreq.getText().toString().toLowerCase());


                }
                else{
                    Toast.makeText(MainActivity.this, "word must not be null", Toast.LENGTH_SHORT).show();
            }
            }
        });


    }



    public void getroot_word(final String string) {

        Call<Rootword> call = api.getrootword(string);
        call.enqueue(new Callback<Rootword>() {
            String str1;
            @Override
            public void onResponse(Call<Rootword> call, Response<Rootword> response) {
                if (!response.isSuccessful()) {
                    textView.setText("not sucessfull operation");
                }
                String str;
                int i, j, k;
                Rootword root = (Rootword) response.body();
try{
                for (i = 0; i < root.getResults().size(); i++) {
                    for (j = 0; j < root.getResults().get(i).getLexicalEntries().size(); j++) {
                        for (k = 0; k < root.getResults().get(i).getLexicalEntries().get(j).getInflectionOf().size(); k++) {
                            str = root.getResults().get(i).getLexicalEntries().get(j).getInflectionOf().get(k).getText().toLowerCase();
                            if (str != string && str != null) {
                                str1 = str;
                                getetymology(str1);
                                textView.setText(str);

                                Toast.makeText(MainActivity.this, "toast", Toast.LENGTH_SHORT).show();

                                return;


                            }
                        }
                    }
                }
            }catch (NullPointerException e){
    textView.setText("this is not a correct word ...");
            }

                    }




            @Override
            public void onFailure(Call<Rootword> call, Throwable t) {
textView.setText("failure");
            }
        });

    }
    public void getetymology(String actword){
        Call<Myword>call=api.getetymology(actword);
        call.enqueue(new Callback<Myword>() {
            @Override
            public void onResponse(Call<Myword> call, Response<Myword> response) {
                if (!response.isSuccessful()) {
                    textView.setText("not a successful operation , check the word given ");
                } else {


                    Myword myword = response.body();
                   // for (i = 0; i < myword.getResults().size(); i++) {
                     //   for (j = 0; j < myword.getResults().get(i).getLexicalEntries().size(); j++) {
                       //     for (k = 0; k < myword.getResults().get(i).getLexicalEntries().get(j).getEntries().size(); k++) {


try {
    textView.append("\n" + myword.getResults().get(0).getLexicalEntries().get(0).getEntries().get(0).getEtymologies().get(0));
}catch (NullPointerException e){
    textView.setText("unable the parse given word , try again later ... ");
    editText.setText("");
}

                            }





            }


            @Override
            public void onFailure(Call<Myword> call, Throwable t) {
                textView.setText("no internet connection ...");

            }
        });
    }
}
