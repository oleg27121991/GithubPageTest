package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class GithubMainPage {

    public GithubMainPage(String url) {
        open(url);
    }

    public void hoverOnNavBtn(String buttonText) {
        $(byTagAndText("button", buttonText)).hover();
    }

    public void chooseHeaderMenuDropdownLink(String linkText) {
        $(byTagAndText("a", linkText)).click();
    }
}
