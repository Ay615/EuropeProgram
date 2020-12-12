package com.unitedcoder.excel;

import java.util.ArrayList;
import java.util.List;

public class ExcelWriteDemo1 {
    public static void main(String[] args) {
        ExcelUtility utility=new ExcelUtility();
        String fileName="testdata/testReport1.xlsx";
        List<String> testReport=new ArrayList<>();
        testReport.add("testName,testModule,testStaus,executesAt,executedBy");
        testReport.add("Login,Login,Passed,2020-12-12,Aynigar");
        testReport.add("Add Product,Inventory,Passed,2020-12-10,Aynigar");
        testReport.add("LogOut,login-logout,Passed,2020-12-12,Aynigar");
        utility.writeToExcelMultipleCells(fileName,"Regression-Test",
                testReport);

    }
}
