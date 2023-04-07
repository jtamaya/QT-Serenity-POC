package UIPages;

import net.thucydides.core.pages.PageObject;

public class DemoQAButtonsTest extends PageObject {

    public void clickElementsCard(){
        $("//*[@id=\"app\"]/div/div/div[2]/div/div[1]").click();
    }

    public void clickButtonsSideBarItem(){
        $("//*[@id=\"item-4\"]").click();
    }

    public void doubleClickButton() {
        $("//*[@id=\"doubleClickBtn\"]").doubleClick();
    }

    public void singleClickButton() {
        $("//*[@id=\"UpTWx\"]").click();
    }

    public String getSingleClickButtonSuccessLabel(){
        return $("//*[@id=\"dynamicClickMessage\"]").getText();
    }

    public String getDoubleClickButtonSuccessLabel(){
        return $("//*[@id=\"doubleClickMessage\"]").getText();
    }
}
