package com.rana_aditya.test_project;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

import java.security.Permission;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=new Intent(getApplicationContext(),Service_background.class);
        //startForegroundService(intent);
        this.startForegroundService(intent);


      /* if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE)== PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this,Manifest.permission.READ_CALL_LOG)   ==PackageManager.PERMISSION_GRANTED) {

            Log.d("______________","inside");

            Toast.makeText(this,"insiddddddddddddddddde",Toast.LENGTH_SHORT).show();
            CallReceiver receiver = new CallReceiver();
            IntentFilter filter = new IntentFilter();
            filter.addAction(TelephonyManager.ACTION_PHONE_STATE_CHANGED);
            filter.addAction(TelephonyManager.EXTRA_STATE_RINGING);

            registerReceiver(receiver, filter);
        }

      if (ContextCompat.checkSelfPermission(this,Manifest.permission.READ_SMS)==PackageManager.PERMISSION_GRANTED){
          Log.d("\\\\\\\\\\\\\\\\\\","djfvbhf bhuivf");
          Toast.makeText(this,"insiddddddddddddddddde",Toast.LENGTH_SHORT).show();
          messagereceiver msg=new messagereceiver();
          IntentFilter intentFilter=new IntentFilter();
          intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
          registerReceiver(msg,intentFilter);

      }*/

    }


}
