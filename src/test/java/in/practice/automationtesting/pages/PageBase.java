package in.practice.automationtesting.pages;

import in.practice.automationtesting.elements.HomePageElements;
import in.practice.automationtesting.elements.PaymentPageElements;
import in.practice.automationtesting.utility.ConfigReader;
import in.practice.automationtesting.utility.Driver;
import in.practice.automationtesting.utility.Utility;

public class PageBase extends Utility {
    public HomePageElements homePageElements;
    public PaymentPageElements paymentPageElements;

    public PageBase() {
        this.homePageElements = new HomePageElements();
        this.paymentPageElements = new PaymentPageElements();
    }

    public void login() {
        String userName = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");
        Driver.getDriver().get(ConfigReader.getProperty("BaseUrl"));
        clickElement(homePageElements.myAccountButton);
        sendKeyToElement(homePageElements.usernameBox, userName);
        sendKeyToElement(homePageElements.passwordBox, password);
        clickElementWithWait(homePageElements.loginButton);
    }

    public void logout() {
        clickElement(homePageElements.myAccountButton);
        clickElement(homePageElements.myAccountPageSignOutButton);
    }

}
