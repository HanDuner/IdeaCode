package Code;

/*
使用方法重载的思想，实际比较两个整数是否相同的方法，兼容整数类型。
 */
public class Eighteen {
    public static void main(String[] args) {
        boolean result = compare((byte)141, (byte)1411);
        System.out.println(result);
    }

    public static boolean compare(int a, int b) {
       /* if (a == b) {
            return true;
        } else {
            return false;
        }*/
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        /*if (a == b) {
            return true;
        } else {
            return false;
        }*/
        return a == b;
    }

    public static boolean compare(short a, short b) {
        /*if (a == b) {
            return true;
        } else {
            return false;
        }*/
        return a == b;
    }

    public static boolean compare(long a, long b) {
       /* if (a == b) {
            return true;
        } else {
            return false;
        }*/
        return a == b;
    }
}

