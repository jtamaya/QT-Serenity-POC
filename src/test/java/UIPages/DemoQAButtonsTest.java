package UIPages;

import net.thucydides.core.pages.PageObject;

public class DemoQAButtonsTest extends PageObject {

    public void clickElementsCard(){
        $("//*[@id=\"app\"]/div/div/div[2]/div/div[1]").click();
    }

    public void clickButtonsSideBarItem(){
        $("//*[@id=\"item-4\"]").click();
    }

    public boolean doubleClickButton() {
        $("//*[@id=\"doubleClickBtn\"]").doubleClick();
        return $("//*[@id=\"doubleClickMessage\"]").isVisible();
    }

    public boolean singleClickButton() {
        $("//*[@id=\"UpTWx\"]").click();
        return $("//*[@id=\"dynamicClickMessage\"]").isVisible();
    }
}
