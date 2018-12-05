package com.jinx.projos;

public class User {
    public User(){

    }
    private Integer user_id;
    private String userName;
    private String passWord;
    private String eMail;
    private String phone;

    public User(Integer user_id, String userName, String passWord, String eMail, String phone) {
        this.user_id = user_id;
        this.userName = userName;
        this.passWord = passWord;
        this.eMail = eMail;
        this.phone = phone;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
