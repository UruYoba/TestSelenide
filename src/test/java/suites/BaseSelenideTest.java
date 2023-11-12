package suites;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import utils.GefestAllure.GefestCondition;
import utils.GefestAllure.TestElement;

public class BaseSelenideTest implements PageObjectSupplier {

    public TestElement findElement(String name, String locator) {
        return new TestElement(name, locator);
    }

    public TestElement findElement(String name, By.ByCssSelector byCssSelector) {
        return new TestElement(name, byCssSelector);
    }

    public TestElement findElement(String name, By.ByXPath ByXPath) {
        return new TestElement(name, ByXPath);
    }

    @BeforeAll
    public static void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}

