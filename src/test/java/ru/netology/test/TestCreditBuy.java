package ru.netology.test;

import lombok.val;
import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;
import ru.netology.page.MainPage;
import ru.netology.page.PaymentFormPage;

public class TestCreditBuy {
    MainPage mainPage = new MainPage();
    PaymentFormPage paymentFormPage = new PaymentFormPage();

    @Test
    void shouldAllowPurchaseWithApprovedCard() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForSuccessedNotification();

    }

    @Test
    void shouldDenyPurchaseWithEmptyFields() {
        val cardNumber = DataHelper.getEmptyCardNumber();
        val month = DataHelper.getEmptyMonth();
        val year = DataHelper.getEmptyYear();
        val cardOwner = DataHelper.getEmptyOwner();
        val code = DataHelper.getEmptyCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForMandatoryFieldMessage();

    }

    @Test
    void shouldDenyPurchaseWithEmptyFieldCardNumber() {
        val cardNumber = DataHelper.getEmptyCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForMandatoryFieldMessage();
    }


    @Test
    void shouldDenyPurchaseWithDeclinedCard() {
        val cardNumber = DataHelper.getSecondCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForFailedNotification();

    }

    @Test
    void shouldDenyPurchaseWithAnotherCard() {
        val cardNumber = DataHelper.getRandomCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForFailedNotification();

    }

    @Test
    void shouldDenyPurchaseCardNumberWith15Digits() {
        val cardNumber = DataHelper.getCardNumberWith15Digits();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongFormatMessage();

    }

    @Test
    void shouldDenyPurchaseCardNumberWith1Digit() {
        val cardNumber = DataHelper.getCardNumberWith1Digit();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongFormatMessage();

    }

    @Test
    void shouldDenyPurchaseCardNumberWithTextAndChars() {
        val cardNumber = DataHelper.getCardNumberWithTextAndChars();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForInvalidCharactersMessage();

    }

    @Test
    void shouldDenyPurchaseWithEmptyFieldMonth() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getEmptyMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForMandatoryFieldMessage();

    }

    @Test
    void shouldDenyPurchaseWithMonthOver12() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getMonthOver12();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongCardExpirationMessage();

    }

    @Test
    void shouldDenyPurchaseWithZeroMonth() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getZeroMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongCardExpirationMessage();

    }

    @Test
    void shouldDenyPurchaseWithWrongFormatMonth() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getInvalidFormatMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongFormatMessage();

    }

    @Test
    void shouldDenyPurchaseWithTextInMonthField() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getMonthWithText();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForInvalidCharactersMessage();

    }

    @Test
    void shouldDenyPurchaseWithEmptyYearField() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getEmptyYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForMandatoryFieldMessage();

    }

    @Test
    void shouldDenyPurchaseWithPastYear() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getPastYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForCardExpiredMessage();

    }

    @Test
    void shouldDenyPurchaseWithWrongFormatYear() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getInvalidFormatYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongFormatMessage();

    }

    @Test
    void shouldDenyPurchaseWithTooFutureYear() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getFutureYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongCardExpirationMessage();

    }

    @Test
    void shouldDenyPurchaseWithTextInYearField() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getYearWithText();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForInvalidCharactersMessage();

    }

    @Test
    void shouldDenyPurchaseWithEmptyCardOwnerField() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getEmptyOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForMandatoryFieldMessage();

    }

    @Test
    void shouldDenyPurchaseWithoutSecondName() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getOnlyNameOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongFormatMessage();

    }

    @Test
    void shouldDenyPurchaseWithLowercaseCardOwner() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getLowercaseLettersOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongFormatMessage();

    }

    @Test
    void shouldDenyPurchaseWithUppercaseCardOwner() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getUppercaseLettersOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongFormatMessage();

    }

    @Test
    void shouldDenyPurchaseWithRedundantDataCardOwner() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getRedundantDataOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongFormatMessage();

    }

    @Test
    void shouldDenyPurchaseWithCyrillicDataCardOwner() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getCyrillicDataOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongFormatMessage();

    }

    @Test
    void shouldDenyPurchaseWithTwoLanguagesCardOwner() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getTwoAlphabetsDataOwner();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForInvalidCharactersMessage();

    }

    @Test
    void shouldDenyPurchaseWithDigitsCardOwner() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getOwnerWithDigits();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForInvalidCharactersMessage();

    }

    @Test
    void shouldDenyPurchaseWithSpecialCharsCardOwner() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getOwnerWithSpecialChars();
        val code = DataHelper.getValidCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForInvalidCharactersMessage();

    }

    @Test
    void shouldDenyPurchaseWithEmptyCodeField() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getEmptyCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForMandatoryFieldMessage();

    }

    @Test
    void shouldDenyPurchaseWithWrongFormatCode() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getInvalidFormatCode();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForWrongFormatMessage();

    }

    @Test
    void shouldDenyPurchaseWithTextInCodeField() {
        val cardNumber = DataHelper.getFirstCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val cardOwner = DataHelper.getValidOwner();
        val code = DataHelper.getCodeWithText();
        paymentFormPage.fillForm(cardNumber, month, year, cardOwner, code);
        paymentFormPage.waitForInvalidCharactersMessage();

    }
}
