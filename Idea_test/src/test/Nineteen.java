package test;
/*
设计一个方法用于获取数组中元素的最大值，调用方法并输出结果。
*/
public class Nineteen {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int result = getMax(arr);
        System.out.println("数组最大值：" + result);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int a = 1; a < arr.length; a ++) {
            if (arr[a] > max) {
                max = arr[a];
            }
        }
        return max;
    }
}
