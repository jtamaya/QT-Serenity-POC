package StepDefinitions;

import UIPages.DemoQAButtonsTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DemoQAButtonsSteps {

    private DemoQAButtonsTest demoQAButtonsTest;
    public boolean singleLabel;
    public boolean doubleLabel;

    @Given("A navigates to the buttons page")
    public void navigateToButtonPage(){
        demoQAButtonsTest.clickElementsCard();
        demoQAButtonsTest.clickButtonsSideBarItem();
    }

    @When("user click on the double click button")
    public void doubleClickButton(){
        doubleLabel = demoQAButtonsTest.doubleClickButton();
    }

    @And("user click on the single click button")
    public void singleClickButton(){
        singleLabel = demoQAButtonsTest.singleClickButton();
    }

    @Then("user should see \"You have done a double click\" and \"You have done a dynamic click\"")
    public void labelsDoAppear(){
        System.out.println(doubleLabel);
        System.out.println(singleLabel);
        Assert.assertTrue(doubleLabel);
        Assert.assertTrue(singleLabel);
    }

}
