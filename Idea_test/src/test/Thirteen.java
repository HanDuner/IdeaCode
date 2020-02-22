package test;
/*
设计一个方法用于输入两个数字，并比大小
*/
import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        maxNumber();
    }

    public static void maxNumber() {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1 > number2) {
            System.out.println("最大数：" + number1);
        } else {
            System.out.println("最大数：" + number2);
        }
    }
}
