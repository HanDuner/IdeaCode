package Code;

/*
���һ���������ڻ�ȡ������Ԫ�ص����ֵ�����÷�������������
 */
public class Twenty {
    public static void main(String[] args) {
        int[] arr = {1234, 234, 13443, 12, 43};
        System.out.println("������Ϊ��" + getMax(arr));
    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x ++) {
//            if (arr[0] > arr[x]) {
//                max = arr[0];
//            } else {
//                max = arr[x];
//            }���ﲻ����ô����
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }
}
