package com.bignerdranch.android.gym;
public class UserData {
    public int pwdresetFlag=0;
    private String userName;                  //用户名

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    private String userPwd;                   //用户密码

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private int userId;                       //用户ID号

    public UserData(String userName, String userPwd) {
        super();
        this.userName = userName;
        this.userPwd = userPwd;
    }

}
