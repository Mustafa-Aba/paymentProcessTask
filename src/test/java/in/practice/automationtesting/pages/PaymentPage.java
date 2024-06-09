package in.practice.automationtesting.pages;


import org.junit.Assert;

public class PaymentPage extends PageBase {

    public void goToShoppingCart() {
        clickElementWithWait(homePageElements.shoppingCartButton);
    }

    public void clickToCheckoutButton() {
        clickElement(homePageElements.checkoutButton);
    }

    public void inputInformationsOfAddress() {
        clearElement(paymentPageElements.billingFirstNameBox);
        sendKeyToElement(paymentPageElements.billingFirstNameBox,"testAccount");
        clearElement(paymentPageElements.billingLastNameBox);
        sendKeyToElement(paymentPageElements.billingLastNameBox,"testLastName");
        clearElement(paymentPageElements.billingEmailBox);
        sendKeyToElement(paymentPageElements.billingEmailBox,"truzoimufozo-1647@yopmail.com");
        clearElement(paymentPageElements.billingPhoneBox);
        sendKeyToElement(paymentPageElements.billingPhoneBox,"+123456789");
        clearElement(paymentPageElements.billingAddressBox1);
        sendKeyToElement(paymentPageElements.billingAddressBox1,"California");
        clearElement(paymentPageElements.billingPostCodeBox);
        sendKeyToElement(paymentPageElements.billingPostCodeBox,"55555");
    }

    public void selectPaypalPaymentMethod() {
        clickElement(paymentPageElements.billingPayPalRadioButton);
    }

    public void clickToPaymentButton() {
        clickElementWithWait(paymentPageElements.billingPlaceOrderButton);
    }

    public void verifySuccessfulForPayment() {
        String expectedMessage="Thank you for your payment.";
        Assert.assertEquals("Odeme adimi gerçekleşmedi",expectedMessage,paymentPageElements.SuccessMessage.getText());
    }
}
