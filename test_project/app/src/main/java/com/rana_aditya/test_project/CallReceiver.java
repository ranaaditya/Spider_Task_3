package com.rana_aditya.test_project;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class CallReceiver extends BroadcastReceiver {
    Context context;

    @Override
    public void onReceive(Context context, Intent intent) {
        this.context=context;
        String state=intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        if (state==null){
            //outgoing call...

        }


      if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {


         /* if(Build.VERSION.SDK_INT >= 26 && intent!=null && intent.getExtras() !=null
                  && TextUtils.isEmpty(intent.getExtras().getString("incoming_number"))){

              Log.d("##############","returning null ");
              return;
          }

            else{

                String incoming_number=intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Toast.makeText(context,incoming_number,Toast.LENGTH_SHORT).show();
            }*/
         if (intent.hasExtra("incoming_number")){
             Log.d("----------","vfiudhb.fel");
             String incoming_number=intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
             Toast.makeText(context,incoming_number,Toast.LENGTH_SHORT).show();

         }



        }
    }
}




