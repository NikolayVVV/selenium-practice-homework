package ru.buttonone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {
    protected WebDriver driver;
    static  {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
