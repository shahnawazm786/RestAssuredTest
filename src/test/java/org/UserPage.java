package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class UserPage {
    WebDriver driver;
    public UserPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Element declarations
     @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    private WebElement linkCreateAccount;

    @FindBy(id="firstname")
    private WebElement txtFirstName;

    @FindBy(id="lastname")
    private WebElement txtLastName;

    @FindBy(id="email_address")
    private  WebElement txtEmailAddress;

    @FindBy(id="password")
    private  WebElement txtPassword;

    @FindBy(id="password-confirmation")
    private  WebElement txtConfirmPassword;

    @FindBy(css = "button[title='Create an Account']")
    private  WebElement registerButton;

    @FindBy(xpath = "//strong[text()='Account Information']")
    private WebElement myAccount;

    @FindBy(xpath="//a//span[text()='Men']")
    private WebElement clickOnMens;

    @FindBy(xpath = "//button[@title='Add to Cart']")
    private  WebElement addToCart;


    // Method declarations
    public void enterMandatoryDataForRegistration(){
        txtFirstName.sendKeys("Jamesh");
        txtLastName.sendKeys("Bound");
        txtEmailAddress.sendKeys("JameshBound2022123@gmail.com");
        txtPassword.sendKeys("JameshBound2022123");
        txtConfirmPassword.sendKeys("JameshBound2022123");

    }
    public void clickOnRegisterButton(){
        registerButton.click();
    }

    public void verifyRegisteredUser(){
        String accountString=myAccount.getText();
        assertEquals("Account Information",accountString);
    }

    public void clickOnMenMenuItem(){
        clickOnMens.click();
    }
    public void itemAddIntoCart(){
        addToCart.click();
    }

}
