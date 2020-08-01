package com.rku.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static com.rku.quizapp.R.anim.top_animation;

public class MainActivity extends AppCompatActivity {

    //Animation
    //Variable
    Animation topAnim;
    ImageView IM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        IM = (ImageView)findViewById(R.id.ImgLogo);
        //Animation
        Animation animation = AnimationUtils.loadAnimation(this, top_animation);
        IM.startAnimation(animation);
    }
}