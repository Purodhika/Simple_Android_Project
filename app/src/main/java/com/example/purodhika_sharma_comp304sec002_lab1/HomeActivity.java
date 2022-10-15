package com.example.purodhika_sharma_comp304sec002_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        Intent intent= getIntent();
        String content = intent.getStringExtra("userName");
        TextView tv_name= findViewById(R.id.welcome_name);
        tv_name.setText(content);
    }
}