package UIPages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://www.browserstack.com/users/sign_in")
public class LoginPage extends PageObject {
    public void doLogin(){
        $("#user_email_login").sendKeys("jonathan.amaya@softwareone.com");
        $("#user_password").sendKeys("$OCCERball9561");
        $("#user_submit").click();
    }

    public boolean accountPageIsVisible(){
        return $("#platform-list-react").isVisible();
    }
}
