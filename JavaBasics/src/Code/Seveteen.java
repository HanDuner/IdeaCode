package Code;

/*
Éè¼ÆÒ»¸ö·½·¨¿ÉÒÔËæ»ú»ñÈ¡Á½¸ö0-100ÒÔÄÚµÄÊı²¢½øĞĞ±È½Ï£¬Êı¾İÀ´×ÔÓÚ²ÎÊı£»
 */
import java.util.Random;

public class Seveteen {
    public static void main(String[] args) {
        Random r = new Random();
        int number1 = r.nextInt(101);
        System.out.println("µÚÒ»¸öËæ»úÊıÎª£º" + number1);
        int number2 = r.nextInt(101);
        System.out.println("µÚ¶ş¸öËæ»úÊıÎª£º" + number2);
        getMax(number1, number2);
        System.out.println("×î´óµÄÊıÎª£º" + getMax(number1, number2));
    }
    public static int getMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }
}
