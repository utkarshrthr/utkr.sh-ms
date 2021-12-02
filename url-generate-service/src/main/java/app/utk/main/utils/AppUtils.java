package app.utk.main.utils;

import java.util.HashMap;
import java.util.Random;

/**
 * @author UtkarshRathore on 23-11-2021
 **/
public class AppUtils {

    private static char[] charSet = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_', '~',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    private static HashMap<Integer, Character> charMap = new HashMap<>();

    static {
        for(int i = 0; i < charSet.length; i++)
            charMap.put(i, charSet[i]);
    }

    private static Random random = new Random();

    private static int generateRandomInteger(){
        return random.nextInt(99999999);
    }

    public static String generateRandomShortCode(){
        int randomNum = generateRandomInteger();
        return convertIntToBase64(randomNum);
    }

    private static String convertIntToBase64(int num) {
        StringBuilder code = new StringBuilder();
        while (num > 0) {
            int r = num % 65;
            code.insert(0, charSet[r]);
            num /= 65;
        }
        return code.toString();
    }
}
