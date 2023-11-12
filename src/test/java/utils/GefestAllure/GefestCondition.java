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

    public static GefestCondition visible = new GefestCondition(Condition.visible, "�������");
    public static GefestCondition exist = new GefestCondition(Condition.exist, "����������");
    public static GefestCondition hidden = new GefestCondition(Condition.hidden, "�����");
    public static GefestCondition appear = new GefestCondition(Condition.appear, "��������");
    public static GefestCondition disappear = new GefestCondition(Condition.disappear, "�����");
    public static GefestCondition interactable = new GefestCondition(Condition.interactable, "������������");
    public static GefestCondition readonly = new GefestCondition(Condition.readonly, "������ ��� ������");
    public static GefestCondition editable = new GefestCondition(Condition.editable, "�������������");

    public static final GefestCondition enabled = new GefestCondition(Condition.enabled, "��������");


    public static GefestCondition attribute(String attributeName) {
        return new GefestCondition(
                Condition.attribute(attributeName),
                String.format("����� ������� %s", attributeName)
        );
    }

    public static GefestCondition attribute(String attributeName, String expectedAttributeValue) {
        return new GefestCondition(
                Condition.attribute(attributeName),
                String.format("����� ������� %s, ������ %", attributeName, expectedAttributeValue)
        );
    }

    public static GefestCondition attributeMatching(String attributeName, String attributeRegex) {
        return new GefestCondition(
                Condition.attributeMatching(attributeName, attributeRegex),
                String.format("����� ������� %s, ���������� ��� ���������� ��������� %s", attributeName, attributeRegex)
        );
    }

    public static GefestCondition href(String href) {
        return new GefestCondition(
                Condition.href(href),
                String.format("����� ������� href, ������ %s", href)
        );
    }

    public static GefestCondition value(String expectedValue) {
        return new GefestCondition(
                Condition.value(expectedValue),
                String.format("�������� ������� value, ������ %s", expectedValue)
        );
    }

    public static GefestCondition partialValue(String expectedValue) {
        return new GefestCondition(
                Condition.partialValue(expectedValue),
                String.format("����� ������� value, ���������� ��������� %s", expectedValue)
        );
    }

    public static GefestCondition pseudo(String pseudoElementName, String propertyName, String expectedValue) {
        return new GefestCondition(
                Condition.pseudo(pseudoElementName, propertyName, expectedValue),
                String.format("����� ������������� %s �� ��������� %s, ������ %s", pseudoElementName, propertyName, expectedValue)
        );
    }

    public static GefestCondition pseudo(String pseudoElementName, String expectedValue) {
        return new GefestCondition(
                Condition.pseudo(pseudoElementName, expectedValue),
                String.format("����� ������������� %s � ��������� %s", pseudoElementName, expectedValue)
        );
    }

    public static GefestCondition exactValue(String value) {
        return new GefestCondition(
                Condition.exactValue(value),
                String.format("�������� ����� �������� ����� '%s'", value)
        );
    }

    public static GefestCondition name(String name) {
        return new GefestCondition(
                Condition.name(name),
                String.format("����� ������� name = %s", name)
        );
    }

    public static GefestCondition type(String type) {
        return new GefestCondition(
                Condition.type(type),
                String.format("����� ������� type = %s", type)
        );
    }

    public static GefestCondition id(String id) {
        return new GefestCondition(
                Condition.id(id),
                String.format("����� id = %s", id)
        );
    }

    public static GefestCondition empty = new GefestCondition(
            Condition.empty,
            "����"
    );

    public static GefestCondition matchText(String regex) {
        return new GefestCondition(
                Condition.matchText(regex),
                String.format("�������� ��� ���������� ��������� %s", regex)
        );
    }

    public static GefestCondition partialText(String expectedText) {
        return new GefestCondition(
                Condition.partialText(expectedText),
                String.format("�������� ��������� %s", expectedText)
        );
    }

    public static GefestCondition partialTextCaseSensitive(String expectedText) {
        return new GefestCondition(
                Condition.partialTextCaseSensitive(expectedText),
                String.format("�������� ��������� %s � ������ ��������", expectedText)
        );
    }

    public static GefestCondition text(String text) {
        return new GefestCondition(
                Condition.text(text),
                String.format("�������� ��������� %s � ������ ��������", text)
        );
    }
}
