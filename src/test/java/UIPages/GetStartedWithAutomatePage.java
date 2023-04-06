package UIPages;

import net.thucydides.core.pages.PageObject;

public class GetStartedWithAutomatePage extends PageObject {

    public void selectPlatformButton(String platform){
        $("#" + platform).click();
    }
}
