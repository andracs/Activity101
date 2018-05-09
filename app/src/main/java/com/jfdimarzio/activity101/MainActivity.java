package com.jfdimarzio.activity101;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {

    ProgressDialog progressDialog;
    String tag = "Pølse";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "In the OnCreate() event");
    }

    @Override
    public void onStart()
    {
        super.onStart();
        /*progressDialog = ProgressDialog.show(this,"Please Wait", "Processing...",true);
        CountDownTimer timer = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                progressDialog.dismiss();
            }
        }.start();*/
        Log.d(tag, "In the OnStart() event");

    }

    public void onStop() {
        super.onStop();
        Log.d(tag, "Nu er onStop blevet eksekveret.");
    }
}


