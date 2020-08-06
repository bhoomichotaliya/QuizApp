package com.rku.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import static com.rku.quizapp.R.anim.mixed_anim;
import static com.rku.quizapp.R.anim.righttoleft;
import static com.rku.quizapp.R.anim.rotate;
import static com.rku.quizapp.R.anim.top_animation;
import static com.rku.quizapp.R.anim.zoomin;
import static com.rku.quizapp.R.anim.zoomout;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT=2000;
    //Animation
    //Variable
    Animation topAnim;
    ImageView IM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        IM = (ImageView)findViewById(R.id.ImgLogo);
        //Animation
        Animation animation = AnimationUtils.loadAnimation(this,rotate );
        IM.startAnimation(animation);

        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(MainActivity.this, login.class));
                finish();

                Log.d("MainActivity:", "onCreate: waiting 5 seconds for MainActivity... loading PrimaryActivity.class");
            }
        }, 5000 );


    }
}