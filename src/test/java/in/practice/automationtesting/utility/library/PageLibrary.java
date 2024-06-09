package in.practice.automationtesting.utility.library;

import in.practice.automationtesting.pages.HomePage;
import in.practice.automationtesting.pages.PaymentPage;
import lombok.Getter;

@Getter
public class PageLibrary {
    private HomePage homePage;
    private PaymentPage paymentPage;

    public PageLibrary() {
        this.homePage = new HomePage();
        this.paymentPage = new PaymentPage();
    }

}


