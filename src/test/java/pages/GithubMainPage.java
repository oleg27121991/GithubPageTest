package pages;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

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
