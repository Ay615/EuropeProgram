package com.unitedcoder.classconcepts;

public class LoginTest {
    public static void main(String[] args) {
        FunctionLibrary library=new FunctionLibrary();
        library.openBrowser("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php");
        LoginUser user1=new LoginUser("testautomation","automation123!");
        library.logIn(user1);
        library.verifyLogin();
        library.closeBrowser();
    }
}
