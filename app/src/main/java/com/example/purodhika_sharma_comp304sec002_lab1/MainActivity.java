package com.example.purodhika_sharma_comp304sec002_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG="LIFECYCLE";
   //TextView logView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate Called");
        //logView=findViewById(R.id.log_name);
       // logView.setText("OnCreate is called");

    }

    private void setListener()
    {
        Button btn1 = findViewById(R.id.login_button);
        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Log.i(TAG, "Incorrect details");
                Toast.makeText(MainActivity.this, "Incorrect Login Credentials", Toast.LENGTH_LONG).show();
            }
        });
    }


    public void login(View view)
    {
        EditText nameEdittext = findViewById(R.id.user_name);
        String name= nameEdittext.getText().toString();
        EditText pwdEdittext = findViewById(R.id.pass_word);
        String pwd= pwdEdittext.getText().toString();
        if(name.equals("johncena")&&pwd.equals("YouCantSeeMe"))
        {
            
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            intent.putExtra("userName","JohnCena");
            startActivity(intent);
            
        }
        else if(name.equals("NarutoUzomaki")&&pwd.equals("Dattebayo"))
        {

            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            intent.putExtra("userName","NarutoUzomaki");
            startActivity(intent);

        }
        else if(name.equals("TommyVercetti")&&pwd.equals("ViceCity"))
        {

            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            intent.putExtra("userName","TommyVercetti");
            startActivity(intent);

        }

        else
        {
            setListener();
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart is Called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume is Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause is Called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop is Called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy is Called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart is Called");

    }

    public void lifecycles(View view) {
        Intent intent = new Intent(MainActivity.this, LifeCycleActivity.class);
        startActivity(intent);
        //onStart();
    }
 }