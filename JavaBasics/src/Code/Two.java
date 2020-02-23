package Code;

/*
已知三个和尚身高为150cm、210cm、165cm；
问三个和尚谁最高？
 */
public class Two {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        int tempHeigh = (height1 > height2) ? height1 : height2;
        int tempHeigh1 = (tempHeigh > height3) ? tempHeigh : height3;
        System.out.println("三个和尚最高的为：" + tempHeigh1 + "cm");

    }
}
