package in.practice.automationtesting.elements;


import in.practice.automationtesting.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageElements {

    public HomePageElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameBox;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginButton;
    @FindBy(xpath = "//a[normalize-space()='My Account']")
    public WebElement myAccountButton;
    @FindBy(xpath = "//a[normalize-space()='Shop']")
    public WebElement shopButton;
    @FindBy(xpath = "(//*[text() = 'Add to basket'])[1]")
    public WebElement firstProductAddToBasket;
    @FindBy(xpath = "//span[@class='cartcontents']")
    public WebElement shoppingCartButton;
    @FindBy(css = ".checkout-button")
    public WebElement checkoutButton;
    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    public WebElement myAccountPageSignOutButton;


}
