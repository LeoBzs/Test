package Utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerGenerator {

    private static Faker faker = new Faker(new Locale("pt-BR"));

    public static String getFirstName(){
        return faker.name().firstName();
    }

    public static String getPhoneNumber(){
        return faker.phoneNumber().phoneNumber();
    }

    public static String getEmailAdress(){
        return faker.internet().emailAddress();
    }
}