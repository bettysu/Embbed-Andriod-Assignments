package com.bignerdranch.android.gym;

/**
 * Created by 屹强 on 2016/9/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;


    public Question(int textResId, boolean answerTrue){


        mTextResId=textResId;
        mAnswerTrue=answerTrue;
    }
    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
