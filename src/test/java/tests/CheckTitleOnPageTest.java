package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.EnterprisePage;
import pages.GithubMainPage;

public class CheckTitleOnPageTest extends BaseTest {
    private final static String GITHUB_MAIN_URL = "https://github.com/";
    private final static String NAME_HEADER_MENU_LINK = "Solutions";
    private final static String NAME_HEADER_DROPDOWN_MENU_LINK = "Enterprise";
    private final static String ENTERPRISE_H1_TITLE_TEXT = "The AI Powered Developer Platform.";
    @Test
    public void testCheckTitleOnEnterprisePage() {
        GithubMainPage githubMainPage = new GithubMainPage(GITHUB_MAIN_URL);
        githubMainPage.hoverOnNavBtn(NAME_HEADER_MENU_LINK);
        githubMainPage.chooseHeaderMenuDropdownLink(NAME_HEADER_DROPDOWN_MENU_LINK);

        EnterprisePage enterprisePage = new EnterprisePage();
        enterprisePage.checkPageH1Title(ENTERPRISE_H1_TITLE_TEXT);
    }
}
