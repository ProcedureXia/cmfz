package com.baizhi.cmfz.entity;

import java.io.Serializable;

/**
 * Created by yx on 2018/7/4.
 */
public class User implements Serializable {
    private int userId;
    private String userName;
    private String userBuddhishName;
    private String userPassword;
    private String userHeadPic;
    private String userAddress;
    private String userPhone;
    private String userSingature;
    private String userStatus;
    private String masterId;

    public User() {
    }

    public User(int userId, String userName, String userBuddhishName, String userPassword, String userHeadPic, String userAddress, String userPhone, String userSingature, String userStatus, String masterId) {

        this.userId = userId;
        this.userName = userName;
        this.userBuddhishName = userBuddhishName;
        this.userPassword = userPassword;
        this.userHeadPic = userHeadPic;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.userSingature = userSingature;
        this.userStatus = userStatus;
        this.masterId = masterId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBuddhishName() {
        return userBuddhishName;
    }

    public void setUserBuddhishName(String userBuddhishName) {
        this.userBuddhishName = userBuddhishName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserHeadPic() {
        return userHeadPic;
    }

    public void setUserHeadPic(String userHeadPic) {
        this.userHeadPic = userHeadPic;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserSingature() {
        return userSingature;
    }

    public void setUserSingature(String userSingature) {
        this.userSingature = userSingature;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userBuddhishName='" + userBuddhishName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userHeadPic='" + userHeadPic + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userSingature='" + userSingature + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", masterId='" + masterId + '\'' +
                '}';
    }
}
