package firstlesson;

public class HomeWork_5 {
    public static void main(String[] args) {
        zadanie_15();
        zadanie_16();
        zadanie_17();
        zadanie_18();
        zadanie_19();
        zadanie_20();
        zadanie_21();
        zadanie_22();
    }

    public static void zadanie_15 () {
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 9;
        array[2] = 1;
        array[4] = 55;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];

            }
        }
        System.out.println(sum);
    }

    public static void zadanie_16 () {
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 9;
        array[2] = 1;
        array[4] = 55;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                i++;
            }
        }
        System.out.println(sum);
    }

    public static void zadanie_17() {
        int[] array = new int[]{8, 11, 0, 33};
        int maxNumber = 0;
        int vtoroiElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
            vtoroiElement = maxNumber + array[i];
        }
        System.out.println(vtoroiElement);
    }

    public static void zadanie_18() {
        int[] array = new int[]{5, 6, 8, 5, 6};
        int summ = 0;
        int kolichestvo = 0;
        for (int i = 0; i < array.length; i++) {
            summ = summ + array[i];
        }
        // System.out.println(summ);
        for (int i = 0; i < array.length; ++i) {
            kolichestvo = kolichestvo + 1;
        }
        //System.out.println(kolichestvo);
        int sredneeArifmet = summ / kolichestvo;
        System.out.println(sredneeArifmet);
    }

    public static void zadanie_19() {
        int[] array_1 = new int [] {1, 5, 6};
        int[] array_2 = new int [] {2, 6};
        int proizvedenie = 1;
        for (int i = array_1.length; i < 0; i--) {
            System.out.println(array_1);
            for (int j = array_2.length; j < 0; j--) {
                // proizvedenie = proizvedenie * array_1[i] * array_2[j];
            }
        }
    }

    public static void zadanie_20 () {
        int[] array = new int [] {66, 8, 6, 4, 9};
        for (int i = 0; i < array.length; i++) {
            int n = 2;
            if (array [i] % 2 != 0 && array [i] != 0) {
                System.out.println ( "В массиве есть простое число" );
            }
            else
                System.out.println ( "В массиве нет простых чисел" );
        }
    }


    public static void zadanie_21() {
        int[] array = new int [] {6, 3, 5, 7, 11, 13, 17};
        int n = array [5];
        for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0 && array[i] != 0) {
                   //   System.out.print(array[i] + " ");
                    if (array [i] == n){
                        break;
                    }
                    System.out.print(array [i] + "  ");
                }
            }
        }
    public static void zadanie_22() {
        int[] [] array = {{1, 4}, {6, 9}};
        int[] [] array_1 = {{0, 3}, {3, 7}};
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

            }

        }

    }
    }







