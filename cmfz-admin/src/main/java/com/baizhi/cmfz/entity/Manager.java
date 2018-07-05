package com.baizhi.cmfz.entity;

import java.io.Serializable;

/**
 * Created by yx on 2018/7/4.
 */
public class Manager implements Serializable{
    private int mgrId;
    private String mgrName;
    private String mgrPassword;
    private String salt ;
    private String mgrStatus;

    public Manager() {
    }

    public Manager(int mgrId, String mgrName, String mgrPassword, String salt, String mgrStatus) {
        this.mgrId = mgrId;
        this.mgrName = mgrName;
        this.mgrPassword = mgrPassword;
        this.salt = salt;
        this.mgrStatus = mgrStatus;
    }

    public int getMgrId() {
        return mgrId;
    }

    public void setMgrId(int mgrId) {
        this.mgrId = mgrId;
    }

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    public String getMgrPassword() {
        return mgrPassword;
    }

    public void setMgrPassword(String mgrPassword) {
        this.mgrPassword = mgrPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getMgrStatus() {
        return mgrStatus;
    }

    public void setMgrStatus(String mgrStatus) {
        this.mgrStatus = mgrStatus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mgrId=" + mgrId +
                ", mgrName='" + mgrName + '\'' +
                ", mgrPassword='" + mgrPassword + '\'' +
                ", salt='" + salt + '\'' +
                ", mgrStatus='" + mgrStatus + '\'' +
                '}';
    }
}
