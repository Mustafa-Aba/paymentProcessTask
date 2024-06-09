package in.practice.automationtesting.stepdefinitions;

import in.practice.automationtesting.elements.PaymentPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentProcessStepdefs extends TestBase{

    @And("Kullanici shopping cart butonuna tiklar.")
    public void kullaniciShoppingCartButonunaTiklar() {
        getAppLibrary().getPageLibrary().getPaymentPage().goToShoppingCart();
    }

    @And("Kullanici proceed to checkout butonuna tiklar.")
    public void kullaniciProceedToCheckoutButonunaTiklar() {
        getAppLibrary().getPageLibrary().getPaymentPage().clickToCheckoutButton();
    }

    @And("Kullanici adres bilgilerini girer.")
    public void kullaniciAdresBilgileriniGirer() {
        getAppLibrary().getPageLibrary().getPaymentPage().inputInformationsOfAddress();
    }

    @And("Kullanici odeme yöntemlerinden PayPal Express Checkout secer.")
    public void kullaniciOdemeYöntemlerindenPayPalExpressCheckoutSecer() {
        getAppLibrary().getPageLibrary().getPaymentPage().selectPaypalPaymentMethod();
    }

    @And("Kullanici continue to payment  butonuna tiklar.")
    public void kullaniciContinueToPaymentButonunaTiklar() {
        getAppLibrary().getPageLibrary().getPaymentPage().clickToPaymentButton();
    }
    @Then("Kullanici odemeyi gerceklestirdigini dogrular.")
    public void kullaniciOdemeyiGerceklestirdiginiDogrular() {
        getAppLibrary().getPageLibrary().getPaymentPage().verifySuccessfulForPayment();

    }
}
