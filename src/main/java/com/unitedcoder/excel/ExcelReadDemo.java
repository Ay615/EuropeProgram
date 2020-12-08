package com.unitedcoder.excel;

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
    }
}
