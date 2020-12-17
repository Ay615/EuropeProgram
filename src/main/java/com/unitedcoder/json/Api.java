package com.unitedcoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Api {
    @JsonProperty("course title")
    private String courseTitle;
    @JsonProperty("price")
    private int price;

    public Api() {
    }

    public Api(String courseTitle, int price) {
        this.courseTitle = courseTitle;
        this.price = price;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
