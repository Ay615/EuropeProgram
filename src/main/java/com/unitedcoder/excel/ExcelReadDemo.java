package com.unitedcoder.excel;

import java.util.List;

public class ExcelReadDemo {
    public static void main(String[] args) {
        ExcelUtility excelUtility=new ExcelUtility();
        excelUtility.readExcellCell("C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\testdata\\login.xlsx",
                "Sayfa1",0,0);
        excelUtility.readExcellCell("C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\testdata\\login.xlsx",
                "Sayfa1",0,1);
        excelUtility.readExcellCell("C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\testdata\\login.xlsx",
                "Sayfa1",1,0);
        excelUtility.readExcellCell("C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\testdata\\login.xlsx",
                "Sayfa1",1,1);
        List<LoginInfo> loginUser=excelUtility.readMultipleCellValue("C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\testdata\\login.xlsx",
                "Sayfa1",1);
        for(LoginInfo users:loginUser){
            System.out.println(String.format("username=%s password=%s",users.getUsername(),
                    users.getPassword()));
        }


    }
}
