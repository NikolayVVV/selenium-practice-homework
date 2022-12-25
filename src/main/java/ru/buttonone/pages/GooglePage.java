package ru.buttonone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.buttonone.utills.Props;

public class GooglePage extends BasePage{

    public WebElement searchField;

    public GooglePage(WebDriver driver){
        super(driver);
        driver.navigate().to(Props.getProperty("url"));
        searchField = driver.findElement(By.name("q"));
    }

    public SearchingResultPage searchByPhraseAndClickEnter(String phrase){
        searchField.click();
        searchField.sendKeys(phrase);
        searchField.sendKeys(Keys.RETURN);
        return new SearchingResultPage(driver);
    }


}
