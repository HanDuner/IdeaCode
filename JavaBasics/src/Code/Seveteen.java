package Code;

/*
���һ���������������ȡ����0-100���ڵ��������бȽϣ����������ڲ�����
 */
import java.util.Random;

public class Seveteen {
    public static void main(String[] args) {
        Random r = new Random();
        int number1 = r.nextInt(101);
        System.out.println("��һ�������Ϊ��" + number1);
        int number2 = r.nextInt(101);
        System.out.println("�ڶ��������Ϊ��" + number2);
        getMax(number1, number2);
        System.out.println("������Ϊ��" + getMax(number1, number2));
    }
    public static int getMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }
}
