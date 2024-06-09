package in.practice.automationtesting.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepdefs extends TestBase{

    @Given("Kullanici giris yapar.")
    public void kullaniciGirisYapar() {
        getAppLibrary().getPageLibrary().getHomePage().login();
    }

    @When("Kullanici sepete bir urun ekler.")
    public void kullaniciSepeteBirUrunEkler() {
        getAppLibrary().getPageLibrary().getHomePage().goToShopPage();
        getAppLibrary().getPageLibrary().getHomePage().addProduct();
    }

}
