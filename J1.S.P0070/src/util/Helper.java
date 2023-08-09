package util;

import java.util.Random;

public class Helper {

    public static void menu() {
        System.out.println("-------Login Program-------\n"
                           + "1. Vietnamese\n"
                           + "2. English\n"
                           + "3. Exit\n"
        );
    }
    
    /**
     * Returns generate captcha
     * 
     * @param length length of captcha
     * @return the string value is captcha
     */
    public static String generateCaptcha(int length){
        StringBuilder alpha = new StringBuilder();
        for(char c = 'A'; c<= 'Z';c++){
            alpha.append(c);
        }
        String digits = "0123456789";
        String alphaNumeric = alpha + digits;
        StringBuilder captcha = new StringBuilder();
        for(int i=0;i<length;i++){
            captcha.append(alphaNumeric.charAt(new Random().nextInt(alphaNumeric.length())));
        }
        return captcha.toString();
    }
}
