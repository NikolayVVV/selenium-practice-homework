package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SberbankPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"main-page\"]/div[3]/div/div[3]/header/div/div[2]/div[2]/a[2]")
    private WebElement sberOffices;

    public SberbankPage(WebDriver driver) {
        super(driver);
    }

}
