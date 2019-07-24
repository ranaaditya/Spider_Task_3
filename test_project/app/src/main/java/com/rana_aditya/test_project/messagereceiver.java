package com.rana_aditya.test_project;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class messagereceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

/*
        if(("android.provider.Telephony.SMS_RECEIVED").equals(intent.getAction())){
            Vibrator vibrator= (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(VibrationEffect.createOneShot(5000,VibrationEffect.DEFAULT_AMPLITUDE));



        }*/


        if (("android.provider.Telephony.SMS_RECEIVED").equals(intent.getAction())) {
            String smsSender = "";
            String smsBody = "";
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                for (SmsMessage smsMessage : Telephony.Sms.Intents.getMessagesFromIntent(intent)) {
                    smsSender = smsMessage.getDisplayOriginatingAddress();
                    smsBody += smsMessage.getMessageBody();
                }
                String final_string = "from : " + smsSender + "\n content : " + smsBody;
                if (final_string != null) {
                    Toast.makeText(context, final_string, Toast.LENGTH_SHORT).show();
                }
            } else {


                Bundle smsBundle = intent.getExtras();
                String format = smsBundle.getString("format");
                if (smsBundle != null) {
                    Object[] pdus = (Object[]) smsBundle.get("pdus");
                    if (pdus == null) {

                        return;
                    }
                    SmsMessage[] messages = new SmsMessage[pdus.length];

                    for (int i = 0; i < messages.length; i++) {
                        messages[i] = SmsMessage.createFromPdu((byte[]) pdus[i], format);
                        smsBody += messages[i].getMessageBody();
                    }
                    smsSender = messages[0].getOriginatingAddress();
                }
                String final_string = "from : " + smsSender + "\n content : " + smsBody;
                if (final_string != null) {
                    Toast.makeText(context, final_string, Toast.LENGTH_SHORT).show();
                }
            }

        }
    }
}
