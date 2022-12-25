package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SberbankPrivateClientsPage extends BasePage {
    @FindBy(xpath = "//h1[text() = 'Офисы и банкоматы']")
    private WebElement officesAndATM;

    public SberbankPrivateClientsPage(WebDriver driver) {
        super(driver);
    }

}
