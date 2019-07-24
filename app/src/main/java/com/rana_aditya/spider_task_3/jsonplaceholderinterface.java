package com.rana_aditya.spider_task_3;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface jsonplaceholderinterface {

    @Headers({"Accept: application/json",
             "app_id: cb765819" ,
              "app_key: 90cef12f549b784ba388fef90b017ee5"
            })
@GET("lemmas/en/{word}")
    Call<Rootword> getrootword(@Path("word") String word);

    @Headers({"Accept: application/json",
            "app_id: cb765819" ,
            "app_key: 90cef12f549b784ba388fef90b017ee5"
    })
    @GET("entries/en/{word_id}?fields=etymologies&strictMatch=true")
    Call<Myword> getetymology(@Path("word_id") String word_id );


}
