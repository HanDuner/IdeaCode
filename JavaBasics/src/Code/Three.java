package Code;

/*
有三个和尚，他们的身高必须经过测量得出；
请用程序实现获取三个和尚的最高身高。
 */
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个和尚的身高:");
        int height1 = sc.nextInt();

        System.out.println("请输入第二个和尚的身高:");
        int height2 = sc.nextInt();

        System.out.println("请输入第三个和尚的身高:");
        int height3 = sc.nextInt();

        System.out.println("------------");

        int tempHeight = height1 > height2 ? height1 : height2;
        int maxHeight = Math.max(tempHeight, height3);
        System.out.println("这三个和尚中身高最高的:" + maxHeight + "cm");

    }
}