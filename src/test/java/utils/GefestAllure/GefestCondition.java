package utils.GefestAllure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebElementCondition;
import com.codeborne.selenide.conditions.Href;
import com.codeborne.selenide.conditions.MatchAttributeWithValue;

public class GefestCondition {
    WebElementCondition condition;
    String text;

    public GefestCondition(WebElementCondition condition, String text) {
        this.condition = condition;
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public WebElementCondition getSelenideCondition() {
        return this.condition;
    }

    public static GefestCondition visible = new GefestCondition(Condition.visible, "видимый");
    public static GefestCondition exist = new GefestCondition(Condition.exist, "существует");
    public static GefestCondition hidden = new GefestCondition(Condition.hidden, "скрыт");
    public static GefestCondition appear = new GefestCondition(Condition.appear, "по€вилс€");
    public static GefestCondition disappear = new GefestCondition(Condition.disappear, "исчез");
    public static GefestCondition interactable = new GefestCondition(Condition.interactable, "интерактивен");
    public static GefestCondition readonly = new GefestCondition(Condition.readonly, "только дл€ чтени€");
    public static GefestCondition editable = new GefestCondition(Condition.editable, "редактируемый");

    public static final GefestCondition enabled = new GefestCondition(Condition.enabled, "доступен");


    public static GefestCondition attribute(String attributeName) {
        return new GefestCondition(
                Condition.attribute(attributeName),
                String.format("»меет атрибут %s", attributeName)
        );
    }

    public static GefestCondition attribute(String attributeName, String expectedAttributeValue) {
        return new GefestCondition(
                Condition.attribute(attributeName),
                String.format("»меет атрибут %s, равный %", attributeName, expectedAttributeValue)
        );
    }

    public static GefestCondition attributeMatching(String attributeName, String attributeRegex) {
        return new GefestCondition(
                Condition.attributeMatching(attributeName, attributeRegex),
                String.format("»меет атрибут %s, подход€щий под регул€рное выражение %s", attributeName, attributeRegex)
        );
    }

    public static GefestCondition href(String href) {
        return new GefestCondition(
                Condition.href(href),
                String.format("»меет атрибут href, равный %s", href)
        );
    }

    public static GefestCondition value(String expectedValue) {
        return new GefestCondition(
                Condition.value(expectedValue),
                String.format("—одержит атрибут value, равный %s", expectedValue)
        );
    }

    public static GefestCondition partialValue(String expectedValue) {
        return new GefestCondition(
                Condition.partialValue(expectedValue),
                String.format("»меет атрибут value, содержащий подстроку %s", expectedValue)
        );
    }

    public static GefestCondition pseudo(String pseudoElementName, String propertyName, String expectedValue) {
        return new GefestCondition(
                Condition.pseudo(pseudoElementName, propertyName, expectedValue),
                String.format("»меет псевдоэлемент %s со свойтсвом %s, равным %s", pseudoElementName, propertyName, expectedValue)
        );
    }

    public static GefestCondition pseudo(String pseudoElementName, String expectedValue) {
        return new GefestCondition(
                Condition.pseudo(pseudoElementName, expectedValue),
                String.format("»меет псевдоэлемент %s с контентом %s", pseudoElementName, expectedValue)
        );
    }

    public static GefestCondition exactValue(String value) {
        return new GefestCondition(
                Condition.exactValue(value),
                String.format("—одержит точно заданный текст '%s'", value)
        );
    }

    public static GefestCondition name(String name) {
        return new GefestCondition(
                Condition.name(name),
                String.format("имеет атрибут name = %s", name)
        );
    }

    public static GefestCondition type(String type) {
        return new GefestCondition(
                Condition.type(type),
                String.format("имеет атрибут type = %s", type)
        );
    }

    public static GefestCondition id(String id) {
        return new GefestCondition(
                Condition.id(id),
                String.format("имеет id = %s", id)
        );
    }

    public static GefestCondition empty = new GefestCondition(
            Condition.empty,
            "пуст"
    );

    public static GefestCondition matchText(String regex) {
        return new GefestCondition(
                Condition.matchText(regex),
                String.format("подходит под регул€рное выражение %s", regex)
        );
    }

    public static GefestCondition partialText(String expectedText) {
        return new GefestCondition(
                Condition.partialText(expectedText),
                String.format("содержит подстроку %s", expectedText)
        );
    }

    public static GefestCondition partialTextCaseSensitive(String expectedText) {
        return new GefestCondition(
                Condition.partialTextCaseSensitive(expectedText),
                String.format("содержит подстроку %s с учетом регистра", expectedText)
        );
    }

    public static GefestCondition text(String text) {
        return new GefestCondition(
                Condition.text(text),
                String.format("содержит подстроку %s с учетом регистра", text)
        );
    }
}
