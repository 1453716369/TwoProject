package com.tjetc.domain;

public class Product {
    private int id;
    private String name;
    private int count;
    private double price;
    private String info;
    private String type;
    private String img_sub1;
    private String img_sub2;
    private String img_sub3;
    private String img_sub4;
    private String img_sub5;

    public Product() {
    }

    public Product(int id, String name, int count, double price, String info, String type, String img_sub1, String img_sub2, String img_sub3, String img_sub4, String img_sub5) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
        this.info = info;
        this.type = type;
        this.img_sub1 = img_sub1;
        this.img_sub2 = img_sub2;
        this.img_sub3 = img_sub3;
        this.img_sub4 = img_sub4;
        this.img_sub5 = img_sub5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg_sub1() {
        return img_sub1;
    }

    public void setImg_sub1(String img_sub1) {
        this.img_sub1 = img_sub1;
    }

    public String getImg_sub2() {
        return img_sub2;
    }

    public void setImg_sub2(String img_sub2) {
        this.img_sub2 = img_sub2;
    }

    public String getImg_sub3() {
        return img_sub3;
    }

    public void setImg_sub3(String img_sub3) {
        this.img_sub3 = img_sub3;
    }

    public String getImg_sub4() {
        return img_sub4;
    }

    public void setImg_sub4(String img_sub4) {
        this.img_sub4 = img_sub4;
    }

    public String getImg_sub5() {
        return img_sub5;
    }

    public void setImg_sub5(String img_sub5) {
        this.img_sub5 = img_sub5;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", info='" + info + '\'' +
                ", type='" + type + '\'' +
                ", img_sub1='" + img_sub1 + '\'' +
                ", img_sub2='" + img_sub2 + '\'' +
                ", img_sub3='" + img_sub3 + '\'' +
                ", img_sub4='" + img_sub4 + '\'' +
                ", img_sub5='" + img_sub5 + '\'' +
                '}';
    }
}
