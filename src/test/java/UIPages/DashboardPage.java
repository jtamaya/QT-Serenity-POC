package UIPages;

import net.thucydides.core.pages.PageObject;

public class DashboardPage extends PageObject {
    public void clickAutomateNavButton(){
        $("/html/body/div[1]/header/div/div/div/nav/ul/li[3]/a").click();
    }
}
