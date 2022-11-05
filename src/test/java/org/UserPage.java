package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy(xpath="(//div[text()='S'])[1]")
    private  WebElement selectSSize;

    @FindBy(id = "option-label-color-93-item-49")
    private WebElement selectColor;

    @FindBy(id="product-addtocart-button")
    private  WebElement addProduct;

    @FindBy(xpath = "//a//span[text()='My Cart']")
    private  WebElement clickOnMyCart;

    @FindBy(id="top-cart-btn-checkout")
    private  WebElement btnCheckout;

    @FindBy(xpath = "(//input[@class='input-text'])[6]")
    private  WebElement shippingAddress;

    @FindBy(xpath="(//input[@class='input-text'])[9]")
    private  WebElement shippingCity;

    @FindBy(xpath="(//input[@class='input-text'])[11]")
    private  WebElement shippingZip;

    @FindBy(xpath = "(//input[@class='input-text'])[12]")
    private  WebElement shippingPhone;

    @FindBy(xpath = "//button//span[text()='Next']")
    private  WebElement clickOnNext;


    @FindBy(xpath = "//div[text()='Payment Method']")
    private WebElement paymentMethod;

    @FindBy(xpath = "/button//span[text()='Place Order']")
    private  WebElement placedOrder;

    @FindBy(xpath = "//span[text()='Thank you for your purchase!']")
    private  WebElement thankyou;


    // Method declarations

    public void clickOnCreateAccount(){
        linkCreateAccount.click();
    }
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
    public void hoverMouseOnItem(){
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.cssSelector("img[class='product-image-photo']"));
        actions.moveToElement(element).build().perform();
    }
    public void itemAddIntoCart(){

        addToCart.click();
    }
    public void  SelectSSize(){
        selectSSize.click();
    }

    public void selectColor(){
        selectColor.click();
    }

    public void clickOnAddProduct(){
        addProduct.click();
    }
    public void clickUserOnMyCart(){
        clickOnMyCart.click();
    }
    public void clickOnCheckOut(){
        btnCheckout.click();
    }
    public void fillShipingAddress() throws InterruptedException{
        Select regions=new Select(driver.findElement(By.name("region_id")));
        Select country=new Select(driver.findElement(By.name("country_id")));
        shippingAddress.sendKeys("Marina Street");
    shippingCity.sendKeys("New Delhi");
    country.selectByVisibleText("India");
    Thread.sleep(2000);
    regions.selectByVisibleText("Delhi");
    shippingZip.sendKeys("110011");
    shippingPhone.sendKeys("91-9078965");

    }

    public void clickOnNextButton(){
        clickOnNext.click();
    }
    public void verifyPlacementOrder(){
        assertEquals("Payment Method",paymentMethod.getText());
    }
    public void clickOnPlaceOrder(){
        placedOrder.click();
    }

    public void verifyThanks(){
        assertEquals("Thank you for your purchase!",thankyou.getText());
    }

}
