package com.unitedcoder.studentshomework.deletenewsletter;

import com.unitedcoder.classconcepts.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FunctionLibrary {
    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void openBrowser(String siteURL){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get(siteURL);
    }
    public void logIn(LoginUser user){

        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(user.getUserName());
        WebElement passWordField=driver.findElement(By.id("password"));
        passWordField.sendKeys(user.getPassWord());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
    }
    public boolean verifyLogin(){
        WebElement dashBoard=driver.findElement(By.xpath("//h3[contains(text(),'Dashboard')]"));
        //validation of login function
        if(dashBoard.getText().contains("Dashboard")){
            System.out.println("successfully login  ");
            return true;

        }else{
            System.out.println("failed");
            return false;
        }

    }
    public void newsLetterLink(){
        WebElement newsletterLink=driver.findElement(By.xpath("//a[contains(text(),'Newsletters')]"));
        newsletterLink.click();
    }
    public void createNewsletterLink(){
        WebElement createNewsLetterLink= driver.findElement(By.xpath("//a[contains(text(),'Create Newsletter')]"));
        createNewsLetterLink.click();
    }
    public void newsLetterSubjectField(String newsletterSubject){
        WebElement newsLetterSubjectField=driver.findElement(By.name("newsletter[subject]"));
        newsLetterSubjectField.sendKeys(newsletterSubject);
    }
    public void emailField(String senderEmail){
        WebElement emailField=driver.findElement(By.id("sender_email"));
        emailField.sendKeys(senderEmail);
    }
    public void sendersName(String sendersName){
        driver.findElement(By.xpath("//input[@id='sender_name']")).sendKeys(sendersName);
    }

    public void htmlContentLink(){
        WebElement htmlContentLink=driver.findElement(By.xpath("//a[contains(text(),'HTML Content')]"));
        htmlContentLink.click();
    }
    public void frameSwitchIn(){
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe")));

    }
    public void htmlContentFiled(String htmlContent){
        WebElement htmlContentField=driver.findElement(By.xpath("/html/body"));
        htmlContentField.sendKeys(htmlContent);
    }

    public void frameSwitchOut(){
        driver.switchTo().defaultContent();
    }
    public boolean verifyNewsLetterSaved(){
        WebElement newsletterSavedMesg=driver.findElement(By.xpath("//div[contains(text(),'Newsletter Saved.')]"));
        if(newsletterSavedMesg.isDisplayed()){
            System.out.println("NewsLetter Successfully saved");
            return true;
        }
        else{
            System.out.println("NewLetter Saving Failed ");
            return false;
        }

    }
    public boolean verifyNewsLetterDelete(){
        WebElement deleteNewsLetterMassage= driver.findElement(By.xpath("//div[contains(text(),'Newsletter deleted.')]"));
        if(deleteNewsLetterMassage.getText().equalsIgnoreCase("Newsletter deleted.")){
            System.out.println("NewsLetter successfully deleted");
            return true;
        }
        else{
            System.out.println("NewsLetter Deleting failed");
            return false;
        }
    }

    public void closeBrowser(){
        driver.close();
        driver.quit();
    }


}
