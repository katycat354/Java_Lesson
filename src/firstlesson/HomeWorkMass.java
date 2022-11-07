package firstlesson;

public class HomeWorkMass {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 9, 4};
        int[] array_1 = {2, 3, 8, 9, 10, 72, 76, 101};
        int[] array_2 = {0, 1, 4};
        int[][] array23 = {{1, 4}, {6, 9}};
        int[][] array_23 = {{3, 0}, {7, 1}};
       // zadanie_15(array);
        //zadanie_16(array);
       // zadanie_17(array);
       // zadanie_18(new int[]{1, 6, 5});
     //   zadanie_19(new int[]{1, 5, 6}, new int[]{2, 5});

        /*

        100 * 20 + 100 * 5 + 50 * 20

        100 = 1 * 10 ^ 2 = 1 * Math.pow(10, 2)
        20 = 2 * 10 ^^ 1 = 2 * Math.pow(10, 1)

        for (int i = 0;.......){
                Math.pow(10,  i)
        }
                    25

                     3
                     --------
                        75


                        20 * 3 + 5 * 3

         */



        zadanie_20(new int[]{8, 5, 4, 6, 4});
        zadanie_21(new int[]{8, 5, 4, 6, 4});
       // int max = max_iz_dvuh_chisel(42, 35);
        System.out.println(" Max = ");
    }

    public static void zadanie_15(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }

    public static void zadanie_16(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static void zadanie_17(int[] array) {
        int maxNumber = 0;
        int vtoroiElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
                vtoroiElement = array[i + 1];
            }
        }
        System.out.println(vtoroiElement);
    }

    public static void zadanie_18(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ = summ + array[i];
        }

        //System.out.println(kolichestvo);
        double sredneeArifmet = summ * 1. / array.length;
        System.out.println(sredneeArifmet);
    }

    public static void zadanie_19(int[] a, int [] b) {
        int proizvedenie = 1;
        for (int i = b.length - 1; i >= 0; i--) {
            for (int j = a.length - 1; j >= 0; j--) {
                int result = b[i] * a[j];

                System.out.println();
            }
        }
        System.out.println(proizvedenie);

    }

    public static void zadanie_20(int array[]) {

        boolean isPrimeExists = false;
        next: for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    continue next;
                }
            }
            isPrimeExists = true;
            break;
        }
        if (isPrimeExists) {
            System.out.println("В массиве есть простое число");
        } else {
            System.out.println("В массиве нет простого числа");
        }
    }

    public static void zadanie_21(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    System.out.println(array[i]);
                }
            }

            break;
        }

    }

    public static int max(int a, int b) {
        if (a > b){
            return a;
        } else {
            return b;
        }
    }

    public static  int max(int a, int b,  int c, int d) {
        int max1 = max(a, b);
        int max2 = max (c, d);
        int max = max(max1, max2);
        return max;
    }
}



