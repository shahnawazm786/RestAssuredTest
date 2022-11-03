package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    // Method declarations




}
