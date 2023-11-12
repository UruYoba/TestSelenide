package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.GefestAllure.TestElement;

public class GooglePage extends BaseSelenidePage{

    public TestElement searchField = findElement("���� ������", By.xpath("//textarea[contains(@type, 'search')]"));

    public GooglePage openPage(){
        open("https://www.google.com/");
        return this;
    }

    @Step("������ ����� � ���� ������")
    public GooglePage fillSearchField(String value){
        searchField.click().sendKeys(value);
        return this;
    }
}
