package ru.netology.data;

import com.github.javafaker.Faker;

import javax.xml.crypto.Data;
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

    public static String getEmptyMonth(){
        return "";
    }







}











}
