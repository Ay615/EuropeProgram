package com.unitedcoder.classconcepts;

public class Car {
    //class level variables  encapsulation
    private String brand;
    private String made;
    private String color;
    private String mileAge;
    private long price;
    private int year;
    //define getter and setter method
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {//local variable
        this.brand = brand;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMileAge() {
        return mileAge;
    }

    public void setMileAge(String mileAge) {
        this.mileAge = mileAge;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

