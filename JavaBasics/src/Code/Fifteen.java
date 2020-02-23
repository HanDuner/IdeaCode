package Code;

/*
设计一个方法
输入两个数字并且比较最大值，输出最大值.
 */
import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        getMax();
    }
    public static void getMax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字；");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1 > number2) {
            System.out.println("最大的数为：" + number1);
        } else {
            System.out.println("最大的数为：" + number2);
        }
    }
}
