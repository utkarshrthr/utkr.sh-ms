package app.utk.main.utils;

import java.util.Random;

/**
 * @author UtkarshRathore on 23-11-2021
 **/
public class AppUtils {

    private static Random random = new Random();

    private static int generateRandomInteger(){
        return random.nextInt(99999999);
    }

    public static String generateRandomShortCode(){
        int randomNum = generateRandomInteger();
        return Base64Converter.convertIntToBase64(randomNum);
    }
}
