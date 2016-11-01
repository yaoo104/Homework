package Module2;

import static jdk.nashorn.internal.objects.NativeMath.min;

/**
 * Created by aleks_000 on 01.11.2016.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int x = 0;
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 3;
        array[2] = 17;
        array[3] = -4;
        array[4] = 15;
        array[5] = 6;
        array[6] = 12;
        array[7] = 7;
        array[8] = -2;
        array[9] = 8;

        System.out.println(sum(array));
        System.out.println(min(array));
        System.out.println(max(array));
        System.out.println(modulus(array));
        System.out.println(multiplication(array));
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
    private static int modulus(int[] array){
        int q = array[0]%array[array.length];
        return q;
    }
    private static int multiplication(int[] array) {
        int p = 1;
        for(int arr : array) {
            if (arr != 0) {
                p *= arr;
            }
        }
        return p;
    }


}



