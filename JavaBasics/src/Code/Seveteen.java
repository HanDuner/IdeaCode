package Code;

/*
设计一个方法可以随机获取两个0-100以内的数并进行比较，数据来自于参数；
 */
import java.util.Random;

public class Seveteen {
    public static void main(String[] args) {
        Random r = new Random();
        int number1 = r.nextInt(101);
        System.out.println("第一个随机数为：" + number1);
        int number2 = r.nextInt(101);
        System.out.println("第二个随机数为：" + number2);
        getMax(number1, number2);
        System.out.println("最大的数为：" + getMax(number1, number2));
    }
    public static int getMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }
}
