package com.unitedcoder.csv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AmazonSearchWithCSV {
    public static void main(String[] args) {
        CSVFileUtility csvFileUtility=new CSVFileUtility();
      List<String>  searchWords=csvFileUtility.readCSVFile("test-Result","amazon-products.csv",
                "search words");
        System.out.println(searchWords.toString());
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.amazon.com");
        for (String keyWords : searchWords) {
            WebElement serachBox = driver.findElement(By.id("twotabsearchtextbox"));
            serachBox.sendKeys(keyWords+ Keys.ENTER);
            driver.navigate().back();
        }
        driver.close();
        driver.quit();
    }
}
