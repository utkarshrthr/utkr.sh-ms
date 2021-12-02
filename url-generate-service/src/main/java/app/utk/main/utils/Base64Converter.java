package app.utk.main.utils;

import java.util.HashMap;

/**
 * @author UtkarshRathore on 22-11-2021
 **/
public class Base64Converter {

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

    public static String convertIntToBase64(int num) {
        StringBuilder code = new StringBuilder();
        while (num > 0) {
            int r = num % 64;
            code.insert(0, charSet[r]);
            num /= 64;
        }
        return code.toString();
    }

    public static int convertBase64ToIn(String code){
        char[] chars = code.toCharArray();
        int num = 0;
        for (int i = chars.length-1; i >= 0; i--) {
            num += (charMap.get(charSet[i])* Math.pow(64, i));
        }
        return num;
    }
}
