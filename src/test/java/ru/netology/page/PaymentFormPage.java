package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PaymentFormPage {

    private SelenideElement cardNumberField = $("[placeholder='0000 0000 0000 0000']");
    private SelenideElement monthField = $("[placeholder='08']");
    private SelenideElement yearField = $("[placeholder='22']");
    private SelenideElement cardOwnerField = $(byText("Владелец"));
    private SelenideElement codeField = $("[placeholder='999']");

    private SelenideElement continueButton = $(byText("Продолжить"));

    private SelenideElement failedNotification = $(byText("Ошибка! Банк отказал в проведении операции."));
    private SelenideElement successedNotification = $(byText("Операция одобрена Банком."));
    private SelenideElement mandatoryFieldMessage = $(byText("Поле обязательно для заполнения"));
    private SelenideElement wrongFormatMessage = $(byText("Неверный формат"));
    private SelenideElement invalidCharactersMessage = $(byText("Поле содержит недопустимые символы"));
    private SelenideElement wrongCardExpirationMessage = $(byText("Неверно указан срок действия карты"));
    private SelenideElement cardExpiredMessage = $(byText("Истёк срок действия карты"));


}
