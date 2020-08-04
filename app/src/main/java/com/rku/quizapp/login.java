package com.rku.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.rku.quizapp.R.anim.bounce;
import static com.rku.quizapp.R.anim.rotate;

public class login extends AppCompatActivity {
    Button btn;
    TextView txt,txtr1,txtr2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        btn = (Button) findViewById(R.id.btnLogin);
        //Animation
        Animation animation = AnimationUtils.loadAnimation(this,bounce);
        btn.startAnimation(animation);

        txt = (TextView) findViewById(R.id.txtLogin);
        //Animation
        Animation anim1 = AnimationUtils.loadAnimation(this,bounce);
        btn.startAnimation(anim1);

        txtr1 = (TextView) findViewById(R.id.txtRegisterLink);
        //Animation
        Animation anim2 = AnimationUtils.loadAnimation(this,bounce);
        btn.startAnimation(anim2);

        txtr2 = (TextView) findViewById(R.id.txtLinkRegister);
        //Animation
        Animation anim3 = AnimationUtils.loadAnimation(this,bounce);
        btn.startAnimation(anim3);



    }
}