package StepDefinitions;

import UIPages.DemoQAButtonsTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DemoQAButtonsSteps {

    private DemoQAButtonsTest demoQAButtonsTest;

    @Given("A navigates to the buttons page")
    public void navigateToButtonPage(){
        demoQAButtonsTest.clickElementsCard();
        demoQAButtonsTest.clickButtonsSideBarItem();
    }

    @When("user click on the double click button")
    public void doubleClickButton(){
        demoQAButtonsTest.doubleClickButton();
    }

    @And("user click on the single click button")
    public void singleClickButton(){
        demoQAButtonsTest.singleClickButton();
    }

    @Then("user should see {doubleClickMessage} and {singleClickMessage}")
    public void labelsDoAppear(){
        Assert.assertTrue(demoQAButtonsTest.doubleClickButton());
        Assert.assertTrue(demoQAButtonsTest.singleClickButton());
    }

}
