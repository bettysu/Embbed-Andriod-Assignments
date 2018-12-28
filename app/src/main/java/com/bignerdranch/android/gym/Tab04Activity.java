package com.bignerdranch.android.gym;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Tab04Activity extends Activity {
    private ImageButton mShouye;
    private ImageButton mXiangqing;
    private ImageButton mDingdan;
    private EditText mAccount;                        //用户名编辑
    private EditText mPwd;                            //密码编辑
    private Button mRegisterButton;                   //注册按钮
    private Button mLoginButton;                      //登录按钮
    private SharedPreferences login_sp;
    private TextView mChangepwdText;
    private UserDataManager mUserDataManager;         //用户数据管理类
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab04);

//        mShouye=(ImageButton)findViewById(R.id.shouye);
//        mShouye.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public  void onClick(View v){
//                Intent i=new Intent(Tab04Activity.this,MainActivity.class);
//                startActivity(i);
//            }
//        });
//        mXiangqing=(ImageButton)findViewById(R.id.xiangqing);
//        mXiangqing.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public  void onClick(View v){
////                Intent i=new Intent(Tab04Activity.this,Tab02Activity.class);
////                startActivity(i);
//            }
//        });
//
//        mDingdan=(ImageButton)findViewById(R.id.dingdan);
//        mDingdan.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public  void onClick(View v){
////                Intent i=new Intent(Tab04Activity.this,Tab03Activity.class);
////                startActivity(i);
//            }
//        });
//        mAccount = (EditText) findViewById(R.id.login_edit_account);
//        mPwd = (EditText) findViewById(R.id.login_edit_pwd);
//        mRegisterButton = (Button) findViewById(R.id.login_btn_register);
//        mLoginButton = (Button) findViewById(R.id.login_btn_login);
//        mChangepwdText = (TextView) findViewById(R.id.login_text_change_pwd);
//        login_sp = getSharedPreferences("userInfo", 0);
//        mRegisterButton.setOnClickListener(mListener);                      //采用OnClickListener方法设置不同按钮按下之后的监听事件
//        mLoginButton.setOnClickListener(mListener);
//        mChangepwdText.setOnClickListener(mListener);
//        if (mUserDataManager == null) {
//            mUserDataManager = new UserDataManager(this);
//            mUserDataManager.openDataBase();                              //建立本地数据库
//        }
//    }
//    View.OnClickListener mListener = new View.OnClickListener() {                  //不同按钮按下的监听事件选择
//        public void onClick(View v) {
//            switch (v.getId()) {
//                case R.id.login_btn_register:                            //登录界面的注册按钮
//                    Intent intent = new Intent(Tab04Activity.this,RegisterActivity.class) ;    //切换Login Activity至User Activity
//                    startActivity(intent);
//                    finish();
//                    break;
//                case R.id.login_btn_login:                              //登录界面的登录按钮
//                    login();
//                    break;
//                case R.id.login_text_change_pwd:                             //登录界面的注销按钮
//                    Intent intent1 = new Intent(Tab04Activity.this,ResetpwdActivity.class) ;    //切换Login Activity至User Activity
//                    startActivity(intent1);
//                    finish();
//                    break;
//            }
//        }
//    };
//
//    public void login() {                                              //登录按钮监听事件
//        if (isUserNameAndPwdValid()) {
//            String userName = mAccount.getText().toString().trim();    //获取当前输入的用户名和密码信息
//            String userPwd = mPwd.getText().toString().trim();
//            SharedPreferences.Editor editor =login_sp.edit();
//            int result=mUserDataManager.findUserByNameAndPwd(userName, userPwd);
//            if(result==1){                                             //返回1说明用户名和密码均正确
//                editor.putString("USER_NAME", userName);
//                editor.putString("PASSWORD", userPwd);
//                editor.commit();
//                Intent intent = new Intent(Tab04Activity.this,MainActivity.class) ;
//                startActivity(intent);
//                finish();
//                Toast.makeText(this, getString(R.string.login_success),Toast.LENGTH_SHORT).show();//登录成功提示
//            }else if(result==0){
//                Toast.makeText(this, getString(R.string.login_fail),Toast.LENGTH_SHORT).show();  //登录失败提示
//            }
//        }
//    }
//    public boolean isUserNameAndPwdValid() {
//        if (mAccount.getText().toString().trim().equals("")) {
//            Toast.makeText(this, getString(R.string.account_empty),
//                    Toast.LENGTH_SHORT).show();
//            return false;
//        } else if (mPwd.getText().toString().trim().equals("")) {
//            Toast.makeText(this, getString(R.string.pwd_empty),
//                    Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    protected void onResume() {
//        if (mUserDataManager == null) {
//            mUserDataManager = new UserDataManager(this);
//            mUserDataManager.openDataBase();
//        }
//        super.onResume();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }
//
//    @Override
//    protected void onPause() {
//        if (mUserDataManager != null) {
//            mUserDataManager.closeDataBase();
//            mUserDataManager = null;
//        }
//        super.onPause();
//    }


    }
}
