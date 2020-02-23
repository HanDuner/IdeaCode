package Code;

/*
设计一个方法
输入两个随机数字并且比较最大值，输出最大值，数据来自参数
*/
import java.util.Random;

public class Sixteen {
    public static void main(String[] args) {
        Random r = new Random();

        int writeNumber1 = r.nextInt(100);
        int writeNumber2 = r.nextInt(200);
        System.out.println("第一个随机数字：" + writeNumber1);
        System.out.println("第二个随机数字：" + writeNumber2);
        int flag = maxNumber(writeNumber1, writeNumber2);
        System.out.println("最大的随机数:" + flag);
    }

    public static int maxNumber(int writeNumber1, int writeNumber2) {
        if (writeNumber1 < writeNumber2) {
            return writeNumber2;
        } else {
            return writeNumber1;
        }
    }
}
