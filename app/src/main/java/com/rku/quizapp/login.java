package com.rku.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import static com.rku.quizapp.R.anim.bounce;
import static com.rku.quizapp.R.anim.rotate;

public class login extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        btn = (Button) findViewById(R.id.btnLogin);
        //Animation
        Animation animation = AnimationUtils.loadAnimation(this,bounce);
        btn.startAnimation(animation);

       /*btn = (Button) findViewById(R.id.btnRegister);
        //Animation
        Animation anim = AnimationUtils.loadAnimation(this,bounce);
        btn.startAnimation(anim);*/
    }
}