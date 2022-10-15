package com.example.purodhika_sharma_comp304sec002_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class LifeCycleActivity extends AppCompatActivity {

    //TextView logView;
    private String TAG="LIFECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        TextView logView = findViewById(R.id.log_name);
        logView.setText("onCreate is called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart is Called");
        TextView logView1 = findViewById(R.id.log_name2);
        logView1.setText("onStart is called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume is Called");
        TextView logView2 = findViewById(R.id.log_name3);
        logView2.setText("onResume is called");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause is Called");
        TextView logView3 = findViewById(R.id.log_name4);
        logView3.setText("onPause is called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop is Called");
        TextView logView4 = findViewById(R.id.log_name5);
        logView4.setText("onStop is called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy is Called");
        TextView logView5 = findViewById(R.id.log_name6);
        logView5.setText("onDestroy is called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart is Called");
        TextView logView6 = findViewById(R.id.log_name7);
        logView6.setText("onRestart is called");

    }
}