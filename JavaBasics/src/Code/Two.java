package Code;

/*
��֪�����������Ϊ150cm��210cm��165cm��
����������˭��ߣ�
 */
public class Two {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        int tempHeigh = (height1 > height2) ? height1 : height2;
        int tempHeigh1 = (tempHeigh > height3) ? tempHeigh : height3;
        System.out.println("����������ߵ�Ϊ��" + tempHeigh1 + "cm");

    }
}
