package com.qvision.site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin
{
    private WebDriver driver;



    By userField;
    By passwordField;
    By loguinButton;


    public PageLogin(WebDriver driver)
    {
        this.driver=driver;
        userField=By.name("userName");
        passwordField=By.name("password");
        loguinButton=By.name("submit");

    }

    public void Login(String user,String pass)
    {

        driver.findElement(userField).sendKeys(user);
        driver.findElement(passwordField).sendKeys(pass);
        driver.findElement(loguinButton).click();



    }
}
