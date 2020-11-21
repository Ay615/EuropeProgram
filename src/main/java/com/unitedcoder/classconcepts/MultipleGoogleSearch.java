package com.unitedcoder.classconcepts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleGoogleSearch implements Runnable{
    private String searchWord;

    public MultipleGoogleSearch() {
    }

    public MultipleGoogleSearch(String searchWord){
        this.searchWord=searchWord;
    }
    @Override
    public void run() {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver(options);
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.google.com");
        //find search box element
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys(searchWord+ Keys.ENTER);//hard coded value

    }
}
