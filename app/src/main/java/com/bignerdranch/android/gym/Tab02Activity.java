package com.bignerdranch.android.gym;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Tab02Activity extends AppCompatActivity {
    private ImageButton mShouye;
    private ImageButton mDingdan;
    private ImageButton mWode;

   private static final String TAG="QuizActivity";
   private static final String KEY_INDEX="index";
    private static final int REQUEST_CODE_CHEAT=0;
    private Button mTrueButton;
    private Button mFalseButton;
    private  Button mNextButton;
    private Button mCheatButton;
    private TextView mQuestionTextView;
    private Question[] mQuestionBank=new Question[]{
            new Question(R.string.jgtj,true),
            new Question(R.string.ystj,false),
            new Question(R.string.pptj,true),
            new Question(R.string.xntj,false),
            new Question(R.string.lxtj,true),
    };
    private int mCurrentIndex=0;
    private boolean mIsCheater;
    private void updateQuestion(){
        int question=mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);
    }
    private void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue=mQuestionBank[mCurrentIndex].isAnswerTrue();
        int messageResId=0;
        if (mIsCheater){
            messageResId=R.string.judgment_toast;
        }else {


            if (userPressedTrue == answerIsTrue) {
                messageResId = R.string.correct_toast;
            } else {
                messageResId = R.string.incorrect_toast;
            }
        }
        Toast.makeText(this,messageResId,Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab02);


        mQuestionTextView=(TextView)findViewById(R.id.question_text_view);

        mTrueButton=(Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkAnswer(true);
            }
        });
        mFalseButton=(Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkAnswer(false);
            }
        });
        mNextButton=(Button)findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                updateQuestion();

            }
        });
        mCheatButton=(Button)findViewById(R.id.cheat_button);

        mCheatButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                boolean answerIsTrue=mQuestionBank[mCurrentIndex].isAnswerTrue();
                Intent i=CkdaActivity.newIntent(Tab02Activity.this,answerIsTrue);

                startActivityForResult(i,REQUEST_CODE_CHEAT);
            }
        });
        if (savedInstanceState !=null){
            mCurrentIndex=savedInstanceState.getInt(KEY_INDEX,0);
        }
        updateQuestion();



//        mShouye=(ImageButton)findViewById(R.id.shouye);
//        mShouye.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public  void onClick(View v){
//                Intent i=new Intent(Tab02Activity.this,MainActivity.class);
//                startActivity(i);
//            }
//        });
//        mDingdan=(ImageButton)findViewById(R.id.dingdan);
//        mDingdan.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public  void onClick(View v){
//                Intent i=new Intent(Tab02Activity.this,Tab03Activity.class);
//                startActivity(i);
//            }
//        });
        mWode=(ImageButton)findViewById(R.id.wode);
        mWode.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent i=new Intent(Tab02Activity.this,Tab04Activity.class);
                startActivity(i);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        if (resultCode!= Activity.RESULT_OK){
            return;
        }
        if (requestCode==REQUEST_CODE_CHEAT){
            if (data==null){
                return;
            }
            mIsCheater=CkdaActivity.wasAnswerShown(data);
        }
    }
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG,"onSaveInstanceState");
        savedInstanceState.putInt(KEY_INDEX,mCurrentIndex);
    }

}
