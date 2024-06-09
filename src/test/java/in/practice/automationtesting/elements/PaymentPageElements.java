package in.practice.automationtesting.elements;


import in.practice.automationtesting.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPageElements {

    public PaymentPageElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "billing_first_name")
    public WebElement billingFirstNameBox;
    @FindBy(id = "billing_last_name")
    public WebElement billingLastNameBox;
    @FindBy(id = "billing_email")
    public WebElement billingEmailBox;
    @FindBy(id = "billing_phone")
    public WebElement billingPhoneBox;
    @FindBy(id = "billing_address_1")
    public WebElement billingAddressBox1;
    @FindBy(id = "billing_postcode")
    public WebElement billingPostCodeBox;
    @FindBy(id = "payment_method_ppec_paypal")
    public WebElement billingPayPalRadioButton;
    @FindBy(id = "place_order")
    public WebElement billingPlaceOrderButton;
    @FindBy(className = "woocommerce-error")
    public WebElement SuccessMessage;

}
