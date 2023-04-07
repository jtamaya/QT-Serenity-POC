package StepDefinitions;

import UIPages.DashboardPage;
import UIPages.GetStartedWithAutomatePage;
import UIPages.LoginPage;
import UIPages.SeleniumWithJavaDocPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class JavaDocPageSteps {

    private DashboardPage dashboardPage = new DashboardPage();
    private GetStartedWithAutomatePage getStartedWithAutomatePage = new GetStartedWithAutomatePage();
    private SeleniumWithJavaDocPage seleniumWithJavaDocPage = new SeleniumWithJavaDocPage();
    private LoginPage loginPage = new LoginPage();

    @Given("A user is logged into the site")
    public void isLoggedIn(){
        loginPage.open();
        loginPage.doLogin();
        Assert.assertTrue(loginPage.accountPageIsVisible());
    }

    @When("user selects the automate nav button")
    public void clicksAutomateNavButton(){
        dashboardPage.clickAutomateNavButton();
    }

    @And("user selects {string} as the platform")
    public void clicksJavaPlatformButton(String platform){
        getStartedWithAutomatePage.selectPlatformButton(platform);
    }

    @Then("user should see {string}")
    public void userShouldSeeJavaDoc(String header){
        Assert.assertTrue(seleniumWithJavaDocPage.javaDocHeaderIsVisible().equals(header));
    }


}
