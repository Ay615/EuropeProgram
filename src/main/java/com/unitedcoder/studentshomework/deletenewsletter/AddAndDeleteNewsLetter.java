package com.unitedcoder.studentshomework.deletenewsletter;

import com.unitedcoder.classconcepts.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddAndDeleteNewsLetter {
    public static void main(String[] args) throws InterruptedException {
        FunctionLibrary library=new FunctionLibrary();
        library.openBrowser("");
        LoginUser user1=new LoginUser("testautomation","automation123!");
        library.logIn(user1);
        library.verifyLogin();
        library.newsLetterLink();
        library.createNewsletterLink();
        NewsLetter newsLetter=new NewsLetter("Cucumber","Apache207",
                "Apache207"+System.currentTimeMillis()+"@web.de",
                "Cucumber Framework");
        library.newsLetterSubjectField(newsLetter.getSubject());
        library.sendersName(newsLetter.getSenderName());
        library.emailField(newsLetter.getSenderEmail());
        library.htmlContentLink();
        Thread.sleep(3000);
        library.frameSwitchIn();
        library.htmlContentFiled(newsLetter.getHtmlContent());
        library.frameSwitchOut();
        WebElement saveButton=library.getDriver().findElement(By.xpath("//input[@value='Save']"));
        saveButton.click();
        library.verifyNewsLetterSaved();
        Thread.sleep(5000);
        WebElement newsLetterTable=library.getDriver().findElement(By.xpath("//*[@id='newsletter-list']/table/tbody"));
        List<WebElement> listOfRow=newsLetterTable.findElements(By.tagName("tr"));
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)library.getDriver();
        for(int i=0;i<listOfRow.size()-1;i++){
            if(listOfRow.get(i).getText().equalsIgnoreCase(newsLetter.getSubject())){
                WebElement deleteIcon=library.getDriver().findElement(By.xpath("//*[@id='newsletter-list']/table/tbody/tr["+i+"]/td[2]/span/a[@class='delete']/i[@class='fa fa-trash']"));
                javascriptExecutor.executeScript("arguments[0].scrollIntoView();", deleteIcon);
                Thread.sleep(3000);
                deleteIcon.click();
                library.getDriver().switchTo().alert().accept();
                break;
            }
        }
        library.verifyNewsLetterDelete();
        library.closeBrowser();
    }
}
