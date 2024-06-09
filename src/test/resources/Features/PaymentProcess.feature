Feature:

  Background:
    Given Kullanici giris yapar.
    When Kullanici sepete bir urun ekler.

  @Smoke @US_01_TC_001
  Scenario: Kullanici odeme surecini gerceklestirir.
    And Kullanici shopping cart butonuna tiklar.
    And Kullanici proceed to checkout butonuna tiklar.
    And Kullanici adres bilgilerini girer.
    And Kullanici odeme yöntemlerinden PayPal Express Checkout secer.
    And Kullanici continue to payment  butonuna tiklar.
    Then Kullanici odemeyi gerceklestirdigini dogrular.

