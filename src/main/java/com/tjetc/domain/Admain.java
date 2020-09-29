package com.tjetc.domain;

public class Admain {
    private int id;
    private String type;
    private String password;

    public Admain() {
    }

    public Admain(int id, String type, String password) {
        this.id = id;
        this.type = type;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admain{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
