package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SearchingResultPage extends BasePage{

    @FindBy(xpath = "//h3[text()='Школа программирования на Java ITsJava']")
    private WebElement firstSearchingResult;

    @FindBy(xpath ="//h3[text() = 'Java - Википедия']")
    private WebElement javaWiki;

    @FindBy(xpath = "//h3[text() = 'СберБанк для физических лиц — банковские услуги ...']")
    private WebElement sberbankForIndividuals;

    public SearchingResultPage(WebDriver driver) {
        super(driver);
    }
}
