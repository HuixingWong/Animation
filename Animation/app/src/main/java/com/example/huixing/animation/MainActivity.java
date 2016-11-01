package com.example.huixing.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button scaleBtn,alpha,set_btn,pingyi_btn;
    Animation scaleAnimation,rotateAnimation,set,pingyi;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.alpha);
        set = AnimationUtils.loadAnimation(this,R.anim.set);
        pingyi = AnimationUtils.loadAnimation(this,R.anim.translation);


        scaleBtn = (Button)findViewById(R.id.btn_animation);
        set_btn = (Button) findViewById(R.id.set);
        set_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.startAnimation(set);
//                set_btn.setAnimation(set);

            }
        });
        alpha = (Button) findViewById(R.id.alpha);
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.startAnimation(rotateAnimation);
//                alpha.setAnimation(rotateAnimation);
            }
        });
        tv =(TextView)findViewById(R.id.tv);

        scaleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tv.startAnimation(scaleAnimation);
//                scaleBtn.setAnimation(scaleAnimation);
            }
        });

        pingyi_btn = (Button) findViewById(R.id.pingyi);
        pingyi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.startAnimation(pingyi);
            }
        });
    }
}
