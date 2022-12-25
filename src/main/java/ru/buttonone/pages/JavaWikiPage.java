package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class JavaWikiPage extends BasePage{
    @FindBy(xpath = "//span[text() = 'Java']")
    private WebElement javaHeader;

    public JavaWikiPage(WebDriver driver) {
        super(driver);
    }

}
