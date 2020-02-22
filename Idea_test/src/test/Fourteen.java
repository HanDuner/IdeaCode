package test;
/*设计一个方法用于打印输入的两个数中的较大值*/


import java.util.Scanner;
public class Fourteen {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入两个数字：");
       int writeNumber1 = sc.nextInt();
       int writeNumber2 = sc.nextInt();
       maxNumber(writeNumber1, writeNumber2);
    }

    public static void maxNumber(int writeNumber1, int writeNumber2) {
        if (writeNumber1 < writeNumber2) {
            System.out.println("最大的数字：" + writeNumber2);
        } else {
            System.out.println("最大的数字：" + writeNumber1);
        }
    }
}
