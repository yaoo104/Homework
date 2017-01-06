package Module6;

/**
 * Created by aleks_000 on 06.01.2017.
 */
public final class ArrayUtils {

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
        System.out.println(secondLargest(array));
        System.out.println(reverse(array));
        System.out.println(findEvenElements(array));

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
    public static int secondLargest(int[] array) {
        for(int j = 2; j>0; j--) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[i + 1]) {
                    int l = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = l;
                }
            }
        }
        return array[array.length - 2];
    }
    public static int[] reverse(int[] array) {
        int a = array.length;
        int b = 0;
        int[] rev = new int[a];
        for (int i = a-1; i >= 0; i--) {
            rev[b] = array[i];
            b++;
        }
        return rev;
    }
    public static int[] findEvenElements(int[] array){
        int [] elements= new int[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                int [] same = new int[elements.length+1];
                System.arraycopy(elements,0,same,0,elements.length);
                elements=same;
                elements[elements.length-1]=array[i];
            }
        }
        return elements;
    }

}
