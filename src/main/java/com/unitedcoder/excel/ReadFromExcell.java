package com.unitedcoder.excel;

import com.unitedcoder.classconcepts.FunctionLibrary;
import com.unitedcoder.configutility.ApplicationConfig;
import org.openqa.selenium.WebDriver;

public class ReadFromExcell {
    public static void main(String[] args) {
        WebDriver driver;
        FunctionLibrary functionLibrary=new FunctionLibrary();
        String url=ApplicationConfig.readConfigProperties("config.properties",
                "qaurl");
        functionLibrary.openBrowser(url);
        ExcelUtility utility=new ExcelUtility();
        String username=utility.readExcellCell("C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\testdata\\login.xlsx",
                "Sayfa1",1,0);
        String password=utility.readExcellCell("C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\testdata\\login.xlsx",
                "Sayfa1",1,1);
        functionLibrary.logIn(username,password);

        functionLibrary.closeBrowser();
    }
}
