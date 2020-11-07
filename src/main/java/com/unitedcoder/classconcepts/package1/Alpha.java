package com.unitedcoder.classconcepts.package1;

public class Alpha {
    public static void main(String[] args) {
    Alpha a = new Alpha();
    a.info = "Alpha class";
    System.out.println(a.info);
}

    private String info;

    public Alpha() {
    }

    public Alpha(String info) {
        this.info = info;
    }

    protected String getInfo() {
        return info;
    }

    protected void setInfo(String info) {
        this.info = info;
    }

    void alphaTest() {
        System.out.println("Alpha test access");

    }
}
