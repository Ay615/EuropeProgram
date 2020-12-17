package com.unitedcoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"instructor","courses","services","expertise","url","linkedIn"})
public class CourseInfo {
    @JsonProperty("services")
    private String services;
    @JsonProperty("expertise")
    private String expertise;
    @JsonProperty("Instructor")
    private String instructor;
    @JsonProperty("linkedIn")
    private String linkedIn;
    @JsonProperty("url")
    private String url;
    @JsonProperty("courses")
    private Courses courses;

    public CourseInfo() {
    }

    public CourseInfo(String services, String expertise, String instructor, String linkedIn, String url, Courses courses) {
        this.services = services;
        this.expertise = expertise;
        this.instructor = instructor;
        this.linkedIn = linkedIn;
        this.url = url;
        this.courses = courses;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }
}
