package com.unitedcoder.excel;

import java.util.ArrayList;
import java.util.List;

public class ExcelWriteDemo2 {
    public static void main(String[] args) {
        ExcelUtility utility=new ExcelUtility();
        String fileName="testdata/userInfo.xlsx";
        List<String> loginUser=new ArrayList<>();
        loginUser.add("testautomation,automation123!");
        loginUser.add("testautomation1,automation123!");
        loginUser.add("testautomation2,automation123!");
        utility.writeToExcelMultipleCells(fileName,"user-info",loginUser);

    }
}
