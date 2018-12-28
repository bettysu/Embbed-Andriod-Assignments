package com.bignerdranch.android.gym;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public  ImageView imageView;
    private ImageButton mFlzs;
    private ImageButton mLmtc;
    private ImageButton mYhhd;
    private ImageButton mYjdc;
    private ImageButton mTkc;
    private ImageButton mNwms;
    private ImageButton mXfzdz;

    private ImageButton mXiangqing;
    private ImageButton mDingdan;
    private ImageButton mWode;
    public boolean juage = true;
    public int images[] = new int[]{R.drawable.a, R.drawable.b,R.drawable.c,
            R.drawable.d,R.drawable.e,R.drawable.f};
    public int count = 0;
    public Handler handler = new Handler();
    public Runnable runnable = new Runnable() {
        @Override
        public void run() {
            AnimationSet animationSet1 = new AnimationSet(true);
            TranslateAnimation ta = new TranslateAnimation(
                    Animation.RELATIVE_TO_SELF, 00, Animation.RELATIVE_TO_SELF,
                    00, Animation.RELATIVE_TO_SELF, 00,
                    Animation.RELATIVE_TO_SELF, 00);
            ta.setDuration(10000);
            animationSet1.addAnimation(ta);
            animationSet1.setFillAfter(true);
            imageView.startAnimation(animationSet1);
            imageView.setBackgroundResource(images[count % 6]);
            count++;
            if (juage)
                handler.postDelayed(runnable, 2600);
            Log.i("handler", "handler");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        handler.postDelayed(runnable, 1);




        mFlzs=(ImageButton)findViewById(R.id.flzs);
        mFlzs.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
//               Intent i=new Intent(MainActivity.this,DisplayActivity.class);
//               startActivity(i);
            }
        });

        mLmtc=(ImageButton)findViewById(R.id.lmtc);
        mLmtc.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
//                Intent i=new Intent(MainActivity.this,LmtcActivity.class);
//                startActivity(i);
            }
        });

        mYhhd=(ImageButton)findViewById(R.id.yhhd);
        mYhhd.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
//                Intent i=new Intent(MainActivity.this,YhhdActivity.class);
//                startActivity(i);
            }
        });

        mYjdc=(ImageButton)findViewById(R.id.yjdc);
        mYjdc.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
//                Intent i=new Intent(MainActivity.this,YjdcActivity.class);
//                startActivity(i);
            }
        });

        mTkc=(ImageButton)findViewById(R.id.tkc);
        mTkc.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
//                Intent p=new Intent(MainActivity.this,TkcActivity.class);
//                startActivity(p);
            }
        });
        mNwms=(ImageButton)findViewById(R.id.nwms);
        mNwms.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
//                Intent q=new Intent(MainActivity.this,NwmsActivity.class);
//                startActivity(q);
            }
        });
        mXfzdz=(ImageButton)findViewById(R.id.xfzdz);
        mXfzdz.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
//                Intent x=new Intent(MainActivity.this,XfzdzActivity.class);
//                startActivity(x);
            }
        });

        mXiangqing=(ImageButton)findViewById(R.id.xiangqing);
        mXiangqing.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
             Intent i=new Intent(MainActivity.this,Tab02Activity.class);
              startActivity(i);
            }
        });
        mDingdan=(ImageButton)findViewById(R.id.dingdan);
        mDingdan.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
//                Intent i=new Intent(MainActivity.this,Tab03Activity.class);
//               startActivity(i);
            }
        });

        mWode=(ImageButton)findViewById(R.id.wode);
        mWode.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
               Intent i=new Intent(MainActivity.this,Tab041Activity.class);
                startActivity(i);
            }
        });

    }




}



