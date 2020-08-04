package com.rku.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class contact_us extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(contact_us.this, AboutUs.class));
                finish();

                Log.d("MainActivity:", "onCreate: waiting 5 seconds for MainActivity... loading PrimaryActivity.class");
            }
        }, 10000 );
    }
}