package com.tjetc.domain;

public class User {
    private String account;
    private int phone;
    private String password;
    private String adress;

    public User() {
    }

    public User(String account, int phone, String password, String adress) {
        this.account = account;
        this.phone = phone;
        this.password = password;
        this.adress = adress;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", phone=" + phone +
                ", password='" + password + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
