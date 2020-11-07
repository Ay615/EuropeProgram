package com.unitedcoder.classconcepts.package2;

import com.unitedcoder.classconcepts.package1.Alpha;

public class Gamma {
    public static void main(String[] args) {
        Alpha a2=new Alpha();

    }
    private String name;

    public Gamma() {
    }

    public Gamma(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


