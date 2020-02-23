package Code;

/*
给出一串数字求最值
 */
public class Fourteen {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 34};
        int max = arr[0];
        for (int x = 1; x < arr.length; x ++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        System.out.println("最大值为：" + max);
    }
}
