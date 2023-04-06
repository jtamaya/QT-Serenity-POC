package StepDefinitions;

import UIPages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {

    private LoginPage loginPage = new LoginPage();
    @Given("user is on Login Page")
    public void isOnLoginPage(){
        loginPage.open();
    }

    @When("user enters username and password")
    public void loginAsUser(){
        loginPage.doLogin();
    }
    @Then("user should see platform list")
    public void userShouldBeLoggedIn (){
        Assert.assertTrue(loginPage.accountPageIsVisible());
    }

}
