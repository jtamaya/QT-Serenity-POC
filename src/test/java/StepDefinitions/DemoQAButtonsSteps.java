package StepDefinitions;

import UIPages.DemoQAButtonsTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DemoQAButtonsSteps {

    private DemoQAButtonsTest demoQAButtonsTest = new DemoQAButtonsTest();

    @Given("A navigates to the buttons page")
    public void navigateToButtonPage(){
        Assert.assertTrue(demoQAButtonsTest.isElementCardVisible());
        System.out.println(demoQAButtonsTest.isElementCardVisible());
        System.out.println(demoQAButtonsTest.getElementCardText());
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

    @Then("user should see {string} and {string}")
    public void labelsDoAppear(String doubleLabelText, String singleLabelText){
        System.out.println(demoQAButtonsTest.getSingleClickButtonSuccessLabel());
        Assert.assertEquals(singleLabelText, demoQAButtonsTest.getSingleClickButtonSuccessLabel());

//        System.out.println(demoQAButtonsTest.getDoubleClickButtonSuccessLabel());
//        Assert.assertEquals(demoQAButtonsTest.getDoubleClickButtonSuccessLabel(), doubleLabelText);

    }

}
