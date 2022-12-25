package ru.buttonone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import ru.buttonone.pages.*;

public class ClassTest extends BaseTest{

    @Test
    public void shouldHaveCorrectOpenJavaWiki() {
        GooglePage googlePage = new GooglePage(driver);
        SearchingResultPage searchingResultPage = googlePage.searchByPhraseAndClickEnter("java");
        searchingResultPage.getJavaWiki().click();
        JavaWikiPage javaWikiPage = new JavaWikiPage(driver);
        WebElement javaHeader = javaWikiPage.getJavaHeader();
        Assertions.assertEquals("Java", javaHeader.getText());
        System.out.println("javaHeader.getText() = " + javaHeader.getText());

    }

    @Test
    public void shouldHaveCorrectOpenSberbank() {
        System.out.println("1. Зайти на страницу гугл");
        GooglePage googlePage = new GooglePage(driver);

        System.out.println("2. В поиске найти сбербанк");
        SearchingResultPage searchingResultPage = googlePage.searchByPhraseAndClickEnter("сбербанк");

        System.out.println("3. Кликнуть по ссылке официального сайта Сбербанк");
        searchingResultPage.getSberbankForIndividuals().click();

        System.out.println("4. Кликнуть по вкладке 'Офисы' на сайте Сбербанк");
        SberbankPage sberbankPage = new SberbankPage(driver);
        sberbankPage.getSberOffices().click();

        System.out.println("5. Проверить что есть заголовок 'Офисы и банкоматы' на сайте Сбербанк");
        SberbankPrivateClientsPage sberbankPrivateClientsPage = new SberbankPrivateClientsPage(driver);
        WebElement officesAndATM = sberbankPrivateClientsPage.getOfficesAndATM();
        Assertions.assertEquals("Офисы и банкоматы", officesAndATM.getText());


    }

    @Test
    public void shouldHaveCorrectToOpenItsJava() {
        System.out.println("1. Зайти на страницу гугл");
        GooglePage googlePage = new GooglePage(driver);

        System.out.println("2. В поиске найти ITsJAVA");
        SearchingResultPage searchingResultPage = googlePage.searchByPhraseAndClickEnter("ITsJAVA");

        System.out.println("3. Кликнуть по ссылке официального сайта");
        searchingResultPage.getFirstSearchingResult().click();

        System.out.println("4. Проверить, что есть блок в названием \"Выпускники прошлого курса\"\n");
        ITsJavaPage iTsJavaPage = new ITsJavaPage(driver);
        WebElement graduateHeader = iTsJavaPage.getGraduateHeader();
        Assertions.assertEquals("Выпускники прошлого курса", graduateHeader.getText());
    }


}
