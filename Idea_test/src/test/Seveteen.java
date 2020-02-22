package test;
/*
设计一个方法用于数组的遍历，要求遍历的结果是在一行上的。例如[11, 22, 33, 44, 55]
*/
public class Seveteen {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        array(arr);
    }

    public static void array(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }
        System.out.print("]");
    }
}
