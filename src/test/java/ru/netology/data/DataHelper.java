package ru.netology.data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataHelper {
    private static Faker fakerEn = new Faker(new Locale("en"));
    private static Faker fakerRu = new Faker(new Locale("ru"));

    private DataHelper() {

    }

    public static String getFirstCardNumber() {
        return "4444 4444 4444 4441";
    }

    public static String getSecondCardNumber() {
        return "4444 4444 4444 4442";
    }

    public static String getFirstCardStatus() {
        return "APPROVED";
    }

    public static String getSecondCardStatus() {
        return "DECLINED";
    }

    public static String getEmptyCardNumber() {
        return "";
    }

    public static String getRandomCardNumber() {
        return fakerEn.business().creditCardNumber();
    }

    public static String getCardNumberWith15Digits() {
        return "4444 4444 4444 444";
    }

    public static String getCardNumberWith1Digit() {
        return "1";
    }

    public static String getCardNumberWithTextAndChars() {
        return "номер карты!";
    }

    public static String getValidMonth() {
        return "10";
    }

    public static String getEmptyMonth() {
        return "";
    }

    public static String getMonthOver12() {
        return "13";
    }

    public static String getZeroMonth() {
        return "00";
    }

    public static String getInvalidFormatMonth() {
        return "1";
    }

    public static String getMonthWithText() {
        return "октябрь";
    }

    public static String getValidYear() {
        return "23";
    }

    public static String getEmptyYear() {
        return "";
    }

    public static String getPastYear() {
        return "13";
    }

    public static String getInvalidFormatYear() {
        return "3";
    }

    public static String getFutureYear() {
        return "90";
    }

    public static String getYearWithText() {
        return "двадцать третий";
    }

    public static String getValidOwner() {
        return "Ivan Ivanov";
    }

    public static String getEmptyOwner() {
        return "";
    }

    public static String getOnlyNameOwner() {
        return "Ivan";
    }

    public static String getLowercaseLettersOwner() {
        return "ivan ivanov";
    }

    public static String getUppercaseLettersOwner() {
        return "IVAN IVANOV";
    }

    public static String getRedundantDataOwner() {
        return "Ivan Ivanov Ivanovich";
    }

    public static String getCyrillicDataOwner() {
        return "Иван Иванов";
    }

    public static String getTwoAlphabetsDataOwner() {
        return "Иван Ivanov";
    }

    public static String getOwnerWithDigits() {
        return "12345";
    }

    public static String getOwnerWithSpecialChars() {
        return "!№%?*";
    }

    public static String getValidCode() {
        return "999";
    }

    public static String getEmptyCode() {
        return "";
    }

    public static String getInvalidFormatCode() {
        return "11";
    }

    public static String getCodeWithText() {
        return "код";
    }
}