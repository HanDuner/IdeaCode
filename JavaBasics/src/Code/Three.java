package Code;

/*
���������У����ǵ���߱��뾭�������ó���
���ó���ʵ�ֻ�ȡ�������е������ߡ�
 */
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("�������һ�����е����:");
        int height1 = sc.nextInt();

        System.out.println("������ڶ������е����:");
        int height2 = sc.nextInt();

        System.out.println("��������������е����:");
        int height3 = sc.nextInt();

        System.out.println("------------");

        int tempHeight = height1 > height2 ? height1 : height2;
        int maxHeight = Math.max(tempHeight, height3);
        System.out.println("�����������������ߵ�:" + maxHeight + "cm");

    }
}