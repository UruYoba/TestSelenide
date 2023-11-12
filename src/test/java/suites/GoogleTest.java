package suites;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static utils.GefestAllure.GefestCondition.*;

public class GoogleTest extends BaseSelenideTest {

    @Test
    @Description("�������� �����")
    @DisplayName("����������� ����� �����")
    public void myTest() {
        googlePage()
                .openPage()
                .fillSearchField("lol");
        googlePage()
                .searchField.should(visible)
                .should(enabled)
                .shouldBe(editable)
                .should(exactValue("lol"));
    }

    @Test
    @DisplayName("���� �������")
    public void newTest() {
        somePage()
                .openPage()
                .search("lol");
    }
}
