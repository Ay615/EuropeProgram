package com.unitedcoder.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestResultUtility {
    public static void main(String[] args) {
        TestResultObject resultObject=new TestResultObject("Customer","Add-Customer",
                "2020-12-19","11:41",true);
        TestResultObject resultObject1=new TestResultObject("Inventory",
                "Add-Product", "2020-12-19","11:43",true);
        List<TestResultObject> testResultObjectList=new ArrayList<>();
        testResultObjectList.add(resultObject);
        testResultObjectList.add(resultObject1);
        TestResult testResult=new TestResult(testResultObjectList,"11:43",
                "11:50","Aynigar");
        ObjectMapper mapper=new ObjectMapper();
        try {
            mapper.writeValue(new File("testdata\\testResult.json"),testResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
