package Module2;


/**
 * Created by aleks_000 on 01.11.2016.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int x = 0;
        int[] array = new int[10];
        array[0] = 13;
        array[5] = -2;

        System.out.println(sum(array));
        System.out.println(min(array));
        System.out.println(max(array));
        System.out.println(multiplication(array));
        System.out.println(modulus(array));

    }
    private static int sum(int[] array) {
        int s = 0;
        for (int arr : array) {
            s += arr;
        }
        return s;
    }

    private static int min(int[] array) {
        int mi = array[0];
        for (int arr : array) {
            if (arr < mi) {
                mi = arr;
            }
        }
        return mi;
    }

    private static int max(int[] array) {
        int ma = array[0];
        for (int arr : array) {
            if (arr > ma) {
                ma = arr;
            }
        }
        return ma;
    }

    private static int multiplication(int[] array) {
        int p = 1;
        for (int arr : array) {
            if (arr != 0) {
                p *= arr;
            }
        }
        return p;
    }

    private static int modulus(int[] array) {
        int q = 0;
        if (array[array.length - 1] != 0) {
            q = array[0] % array[array.length - 1];
        }
        return q;
    }
}










