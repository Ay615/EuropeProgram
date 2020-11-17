package com.unitedcoder.cubecartautomation;

import com.unitedcoder.classconcepts.LoginUser;

public class TestRunner extends TestBase {
    public static void main(String[] args) {
        initialzation();
        LoginPage loginPage=new LoginPage();
        LoginUser user=new LoginUser("testautomation","automation123!");
        loginPage.login(user);
        CategoryPage categoryPage=new CategoryPage();
        categoryPage.addCategory();
        sleep(3);
        ProductPage productPage=new ProductPage();
        productPage.addProduct();
        sleep(3);
        DashBoardPage dashBoardPage=new DashBoardPage();
        dashBoardPage.logOut();
        closeBrowser();

    }
}
