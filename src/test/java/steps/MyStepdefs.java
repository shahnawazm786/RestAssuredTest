package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.UserPage;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    WebDriver driver=Hooks.driver;
    UserPage userPage=new UserPage(driver);
    @Given("enter mandatory data for registration")
    public void enterMandatoryDataForRegistration() {
        userPage.enterMandatoryDataForRegistration();
    }

    @When("click on register")
    public void clickOnRegister() {
        userPage.clickOnRegisterButton();
    }

    @Then("verify user registered")
    public void verifyUserRegistered() {
        userPage.verifyRegisteredUser();
    }



    @Then("user navigate to item page")
    public void userNavigateToItemPage() {
        userPage.clickOnMenMenuItem();

    }

    @When("user select item")
    public void userSelectItem() {
        userPage.itemAddIntoCart();
        userPage.SelectSSize();
        userPage.selectColor();
        userPage.clickOnAddProduct();


    }
    @And("goto item cart")
    public void gotoItemCart() {
        userPage.clickUserOnMyCart();
        userPage.clickOnCheckOut();
    }

    @Then("enter shipping details")
    public void enterShippingDetails() throws Throwable {
        userPage.fillShipingAddress();
        Thread.sleep(2000);
        userPage.clickOnNextButton();
    }

    @And("click on payment")
    public void clickOnPayment() {
    userPage.verifyPlacementOrder();
    userPage.clickOnPlaceOrder();

    }

    @Then("verify payment successful")
    public void verifyPaymentSuccessful() {
        userPage.verifyThanks();
    }



}