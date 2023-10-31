package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Point;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropPage {
    private final SelenideElement firstRectangle = $("#column-a");
    private final SelenideElement secondRectangle = $("#column-b");
    public DragAndDropPage(String url){
        open(url);
    }

    public void moveFirstRectangleToPlaceSecondRectangle() {
        Point firstTriangleLocation = firstRectangle.getLocation();
        Point secondTriangleLocation = secondRectangle.getLocation();

        int deltaX = secondTriangleLocation.getX() - firstTriangleLocation.getX();
        int deltaY = secondTriangleLocation.getY() - firstTriangleLocation.getY();

        actions().moveToElement(firstRectangle)
                .clickAndHold()
                .moveByOffset(deltaX, deltaY)
                .release()
                .perform();
    }

    public void checkMoveFirstRectangleToPlaceSecondRectangle(String headerRectangleText) {
        firstRectangle.$("header").shouldHave(text(headerRectangleText));
    }
}
