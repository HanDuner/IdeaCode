package Code;

/*
���һ������
�����������ֲ��ұȽ����ֵ��������ֵ.
 */
import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        getMax();
    }
    public static void getMax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������������֣�");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1 > number2) {
            System.out.println("������Ϊ��" + number1);
        } else {
            System.out.println("������Ϊ��" + number2);
        }
    }
}
