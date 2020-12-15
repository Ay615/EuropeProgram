package com.unitedcoder.json;

import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VerifyJsonContent {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream=new FileInputStream("testdata/course.json");
        JsonPath js=new JsonPath(inputStream);
        int courseSize=js.getInt("courses.size()");
        System.out.println(courseSize);
        int purchaseAmount=js.getInt("dashboard.purchaseAmount");
        System.out.println(purchaseAmount);
        String firstCourseTitle=js.get("courses[0].title");
        System.out.println(firstCourseTitle);
        int sum=0;
        for(int i=0;i<courseSize;i++){
            int price=js.getInt("courses["+i+"].price");
            int copies=js.getInt("courses["+i+"].copies");
            int amount=price*copies;
            sum=sum+amount;
        }
        System.out.println(sum);
        if(sum==purchaseAmount){
            System.out.println("Correct calculation");
        }else{
            System.out.println("Incorrect calculation");
        }
    }
}
