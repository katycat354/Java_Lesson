package firstlesson;

public class DemoArray {
    public static void main(String[] args) {
        int []a = {4, 5, 6};
        int []a2 = {41, 52, -6};
        printArray(a);
        System.out.println("--------  -");
        printArray(a2);
        String [] str = {"AAAA", "ABBB"};
       // System.out.println(a.length);
       // System.out.println(str.length);
        int[][] a1 = {{1,2}, {5,6,3,4,2,1,9}, {7,1,2}};
     /*   for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
*/
        int x1[];
        int []x2;

        int [] b1 = {};
        max(b1);

        int []a3 = {3,1,4};
        int temp = a3[0];
        a3[0] = a3[2];
        a3[2] = temp;
        printArray(a3);
        int []a4 = a3;
        a4[0] =  65;
        System.out.println("AFTER");

        int x = 5;
        int y = x;
        y++;

        System.out.println(x + " " + y);
    }

    public static void max(int[] a) {
        if (a.length > 0) {
            int max = a[0];
            for (int i = 1; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println(max);
        } else {
            System.out.println("Array is empty");
        }
    }


    public static void printArray(int[] a) {
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println("a[" + i + "]=" +a[i]);
        }

    }
}
