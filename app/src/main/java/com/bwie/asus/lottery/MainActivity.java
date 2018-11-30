package com.bwie.asus.lottery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CircleView circleView;
    private ZZView zzView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleView = findViewById(R.id.circleView);
        initView();
    }

    private void initView() {

        findViewById(R.id.zz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float degrrees=(float)(720+Math.random()*1000);

                RotateAnimation rotateAnimation=new RotateAnimation(0,-degrrees,350,350);
                rotateAnimation.setDuration(5000);
                rotateAnimation.setFillAfter(true);
                circleView.setAnimation(rotateAnimation);
                circleView.startAnimation(rotateAnimation);


            }
        });


    }
}
