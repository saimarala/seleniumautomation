package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;

public class LoginSteps {

    @Given("user is on login page")
    public void verifyLogin(){
        System.out.println("Inside step -user is on login page");
    }

    @When("user enters username and password")
    public void userEntersUserNamePasseord(){
        System.out.println("Inside step -user enters username and password");

    }

    @And("click on login button")
    public void clickOnLoginButton(){
        System.out.println("Inside step -click on login button");
    }

    @Then("user is naviagte to the home page")
    public void naviagteToHomePage(){
        System.out.println("Inside step -user is naviagte to the home page");
    }

}
