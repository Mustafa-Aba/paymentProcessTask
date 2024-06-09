package in.practice.automationtesting.pages;

public class HomePage extends PageBase {

    public void addProduct() {
        clickElement(homePageElements.firstProductAddToBasket);
    }

    public void goToShopPage() {
        clickElement(homePageElements.shopButton);
    }
}
