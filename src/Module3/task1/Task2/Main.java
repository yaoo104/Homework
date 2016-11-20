package Module3.task1.Task2;

/**
 * Created by aleks_000 on 12.11.2016.
 */
    public class Main {
        public static void main(String[] args) {
            Arithmetic arithmetic = new Arithmetic();

            Adder adder = new Adder();

            Adder arithmeticS = new Adder();



            System.out.println(arithmetic.add(2, 7));

            System.out.println(adder.check(1, 3));

            System.out.println(arithmetic.add(7, 5));

        }
    }

