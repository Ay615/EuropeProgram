package com.unitedcoder.classconcepts;

public class Car implements Comparable<Car> {
    //class level variables  encapsulation
    private String brand;
    private String made;
    private String color;
    private String mileAge;
    private long price;
    private int year;
    //default constructor
    public Car() {
    }
    //constructor with arguments
    public Car(String brand, String made, String color, String mileAge, long price, int year) {
        this.brand = brand;
        this.made = made;
        this.color = color;
        this.mileAge = mileAge;
        this.price = price;
        this.year = year;
    }
    //special method
    public Car(String brand, String made, String color, String mileAge){
        this.brand = brand;
        this.made = made;
        this.color = color;
        this.mileAge = mileAge;
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Car(String brand, String color, long price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

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


    public String toString() {
//        return "Car{" +
//                "brand='" + brand + '\'' +
//                ", made='" + made + '\'' +
//                ", color='" + color + '\'' +
//                ", mileAge='" + mileAge + '\'' +
//                ", price=" + price +
//                ", year=" + year +
//                '}';
        return brand+", "+made+", "+color+", "+mileAge+", "+price+", "+year;
    }

    public String carInfo(){
        return brand+", "+made+", "+color+", "+mileAge+", "+price+", "+year;
    }


    @Override
    public int compareTo(Car car) {
        if(price==car.price){
            return 0;
        }else if(price>car.price){
            return 1;
        }else
        return -1;
    }
}

