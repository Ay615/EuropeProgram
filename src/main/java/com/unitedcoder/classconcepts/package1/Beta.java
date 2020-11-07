package com.unitedcoder.classconcepts.package1;

public class Beta {
    public static void main(String[] args) {
        Alpha a1=new Alpha();
        a1.setInfo("Alpha");
        System.out.println(a1.getInfo());
        a1.alphaTest();
    }
    private String version;

    public Beta() {
    }

    public Beta(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
