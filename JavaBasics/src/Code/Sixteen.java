package Code;

/*
���һ������
��������������ֲ��ұȽ����ֵ��������ֵ���������Բ���
*/
import java.util.Random;

public class Sixteen {
    public static void main(String[] args) {
        Random r = new Random();

        int writeNumber1 = r.nextInt(100);
        int writeNumber2 = r.nextInt(200);
        System.out.println("��һ��������֣�" + writeNumber1);
        System.out.println("�ڶ���������֣�" + writeNumber2);
        int flag = maxNumber(writeNumber1, writeNumber2);
        System.out.println("���������:" + flag);
    }

    public static int maxNumber(int writeNumber1, int writeNumber2) {
        if (writeNumber1 < writeNumber2) {
            return writeNumber2;
        } else {
            return writeNumber1;
        }
    }
}
