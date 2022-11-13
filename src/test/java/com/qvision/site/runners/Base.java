package com.qvision.site.runners;

import com.qvision.site.pages.PageLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Base
{
    private WebDriver driver;

    @BeforeTest
    public void setup()
    {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

    }

    @Test(priority=1)
    public void login()
    {

        //**** Loguearse dentro de la pagina  ****

        PageLogin pageslogin=new PageLogin(driver);

        pageslogin.Login("marodriguez","Qvision2510");



    }

}
