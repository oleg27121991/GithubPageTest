package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.DragAndDropPage;

public class DragAndDropTest extends BaseTest {
    private final static String DRAG_AND_DROP_SITE_URL = "https://the-internet.herokuapp.com/drag_and_drop";
    private final static String HEADER_RECTANGLE_TEXT_AFTER_MOVE = "B";
    @Test
    public void testMoveFirstRectangleToPlaceSecondRectangle() {
        DragAndDropPage dragAndDropPage = new DragAndDropPage(DRAG_AND_DROP_SITE_URL);
        dragAndDropPage.moveFirstRectangleToPlaceSecondRectangle();
        dragAndDropPage.checkMoveFirstRectangleToPlaceSecondRectangle(HEADER_RECTANGLE_TEXT_AFTER_MOVE);
    }
}
