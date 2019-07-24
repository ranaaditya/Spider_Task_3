package com.rana_aditya.test_project;

import android.Manifest;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class Service_background extends Service {
    CallReceiver receiver = new CallReceiver();

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CALL_LOG) == PackageManager.PERMISSION_GRANTED) {

            Log.d("______________", "inside");

            Toast.makeText(this, "insiddddddddddddddddde", Toast.LENGTH_SHORT).show();

            IntentFilter filter = new IntentFilter();
            filter.addAction(TelephonyManager.ACTION_PHONE_STATE_CHANGED);
            filter.addAction(TelephonyManager.EXTRA_STATE_RINGING);
            registerReceiver(receiver, filter);
        }



      /*  if (ContextCompat.checkSelfPermission(this,Manifest.permission.READ_SMS)==PackageManager.PERMISSION_GRANTED){
            Log.d("\\\\\\\\\\\\\\\\\\","djfvbhf bhuivf");
            Toast.makeText(this,"insiddddddddddddddddde",Toast.LENGTH_SHORT).show();
            messagereceiver msg=new messagereceiver();
            IntentFilter intentFilter=new IntentFilter();
            intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
            registerReceiver(msg,intentFilter);


        }*/
        return START_NOT_STICKY;

    }

    @Override
    public void onCreate() {
        super.onCreate();

        Notification notification = new Notification();
        this.startForeground(1, notification);

    }




    @Override
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
}
