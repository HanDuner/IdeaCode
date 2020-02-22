package test;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请随机输入两个数字:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = getMax(a,b);
        System.out.println("最大的数字：" + result);
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
          //  哈哈哈
        }
    }
}


