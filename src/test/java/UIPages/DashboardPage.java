package UIPages;

import net.thucydides.core.pages.PageObject;

public class DashboardPage extends PageObject {
    public void clickAutomateNavButton(){
        $("//*[@id=\"header\"]/header/div/div/div/nav/ul/li[3]").click();
    }
}
