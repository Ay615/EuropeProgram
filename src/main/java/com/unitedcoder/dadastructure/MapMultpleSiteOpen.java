package com.unitedcoder.dadastructure;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MapMultpleSiteOpen {
    public static void main(String[] args) throws InterruptedException {
        Map<String,String> sites=new HashMap<>();
        sites.put("Google","https://www.google.com");
        sites.put("Amazon","https://www.amazon.com");
        sites.put("YouTube","https://www.youtube.com");
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver();
        Set<String> set=sites.keySet();
        for(String site:set) {
            StopWatch watch=new StopWatch();
            watch.start();
            driver.get(sites.get(site));
            if(driver.getTitle().contains(site)){
                System.out.println(site+"Opened successfully test pass");
                watch.stop();
                System.out.println(site+"opened whithin  "+watch.getTime(TimeUnit.MILLISECONDS));
            }
            Thread.sleep(4000);
        }
        driver.close();
        driver.quit();

    }
}
