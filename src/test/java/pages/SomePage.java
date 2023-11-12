package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.GefestAllure.TestElement;

public class SomePage extends BaseSelenidePage {
    TestElement searchField = findElement("������ ������", By.cssSelector("input#text"));

    public SomePage openPage() {
        open("https://ya.ru/");
        return this;
    }

    @Step("����� �� ������ {value}")
    public SomePage search(String value) {
        searchField
                .click()
                .sendKeys(value)
                .sendKeys(Keys.ENTER);
        return this;
    }
}
