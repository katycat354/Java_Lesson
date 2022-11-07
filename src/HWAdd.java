public class HWAdd {
    public static void main(String[] args) {
        int[] a = {2, 3, 8, 9};
        int[] b = {0, 1, 4};
        int[][] matrix1 = new int[][]{{1, 4}, {6, 9}};
        int[][] matrix2 = new int[][]{{3, 0}, {7, 1}};

        ///  zadanie22 (a, b);
        //zadanie23(matrix1, matrix2);
        zadanie24 (a, 1);
    }

    public static void zadanie22(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int count = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                k++;
                i++;
            } else {
                res[k] = b[j];
                k++;
                j++;
            }
        }
        while (i < a.length) {
            res[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length) {
            res[k] = b[j];
            k++;
            j++;
        }
        for (int i1 = 0; i1 < res.length; i1++)
            System.out.print(res[i1] + " ");

    }

    public static void zadanie23(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[2][2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++)
                sum[i][j] = matrix1[i][j] + matrix2[i][j];

        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
         }

    }


    public static void zadanie24 (int  [] a, int  shift) {
        int temp = a[0];        for (int i = 0; i < a.length - 1; i++) {
            a[i]=a[i +1];
        }
        a[a.length - 1] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}




