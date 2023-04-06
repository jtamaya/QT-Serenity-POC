package UIPages;

import net.thucydides.core.pages.PageObject;

public class DashboardPage extends PageObject {
    public void clickAutomateNavButton(){
        $("#automate_cross_product_explore").click();
    }
}
