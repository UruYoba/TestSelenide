package pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.GefestAllure.GefestCondition.*;
import utils.GefestAllure.TestElement;

import static io.qameta.allure.Allure.step;

public class BaseSelenidePage {

    public static void main(String[] args) {

    }

    @Step("Открыть страницу {url}")
    protected void open(String url) {
        Selenide.open(url);
    }

    protected TestElement findElement(String name, String locator) {
        return new TestElement(name, locator);
    }

    public TestElement findElement(String name, By bySelector) {
        return new TestElement(name, bySelector);
//        AllureResultsWriter
    }
}
