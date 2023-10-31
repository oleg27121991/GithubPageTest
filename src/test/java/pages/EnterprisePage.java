package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class EnterprisePage {
    private final SelenideElement pageH1Title = $("#hero-section-brand-heading");
    public void checkPageH1Title(String titleText) {
        pageH1Title.shouldHave(Condition.text(titleText));
    }
}
