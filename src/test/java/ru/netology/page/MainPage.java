package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement heading = $("#root > div > h2");
    private SelenideElement headingPaymentForm = $("#root > div > h3");
    private SelenideElement buyByDebitCardButton = $(byText("Купить"));
    private SelenideElement buyByCreditCardButton = $(byText("Купить в кредит"));

    public MainPage() {
        heading.shouldBe(visible);
    }

    public void payWithDebitCard() {
        buyByDebitCardButton.click();
        headingPaymentForm.shouldHave(exactText("Оплата по карте"));
    }

    public void payWithCreditCard() {
        buyByCreditCardButton.click();
        headingPaymentForm.shouldHave(exactText("Кредит по данным карты"));
    }
}