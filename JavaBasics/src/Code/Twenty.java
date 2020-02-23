package Code;

/*
设计一个方法用于获取数组中元素的最大值，调用方法并输出结果；
 */
public class Twenty {
    public static void main(String[] args) {
        int[] arr = {1234, 234, 13443, 12, 43};
        System.out.println("最大的数为：" + getMax(arr));
    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x ++) {
//            if (arr[0] > arr[x]) {
//                max = arr[0];
//            } else {
//                max = arr[x];
//            }这里不用这么复杂
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }
}
