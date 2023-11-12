package utils.GefestAllure;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Arrays;

import static io.qameta.allure.Allure.step;

public class TestElement {
    String name;
    SelenideElement element;

    public TestElement(String name, String locator) {
        this.name = name;
        this.element = Selenide.$(locator);
    }

    public TestElement(String name, By bySelector) {
        this.name = name;
        this.element = Selenide.$(bySelector);
    }

    public TestElement click() {
        step(
                String.format("Кликнуть по элементу %s", this.name),
                () -> {
                    this.element.click();
                });
        return this;
    }

    public TestElement sendKeys(CharSequence... keysToSend) {
        step(
                String.format("Ввести в поле %s текст %s", this.name, Arrays.toString(keysToSend)),
                () -> {
                    this.element.sendKeys(keysToSend);
                }
        );
        return this;
    }

    public TestElement should(GefestCondition condition){
        step(
                String.format("Проверить, что элемент '%s' %s", this.name, condition.getText()),
                () -> {
                    this.element.should(condition.getSelenideCondition());
                }
        );
        return this;
    }

    public TestElement shouldBe(GefestCondition condition){
        return this.should(condition);
    }
}
