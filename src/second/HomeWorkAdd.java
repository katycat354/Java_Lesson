package second;

import java.util.*;


public class HomeWorkAdd {

  /*  public static void main(String[] args) {
        String []s = {"Bus", "Abba", "Gudwin", "Cat"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
    }
    */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(77);
        list.add(89);
        list.add(32);
        list.add(100);
        list.add(13);

        List<Integer> list1 = new ArrayList<>();
        list1.add(26);
        list1.add(-90);
        list1.add(21);
        list1.add(45);
        list1.add(78);

        List<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Postgres");
        list2.add("Mongo");
        list2.add("Python");
        String a1[] = {"aaa", "bab", "cccc", "ccz"};
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        String a[] = {"aaa", "bab", "cccc", "ccz"};
        String b[] = {"abb", "abc", "ccac", "ckz"};

        int[] aa = {2, 5};
        int[] bb = {3, 6};

        zadanie28(a1);
        zadanie30(a, b);
        zadanie34(list, list1);
        zadanie35(list2);
        zadanie_19 (aa, bb);
        sum(5, 7);

    }

    public static void zadanie28(String[] a1) {
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
            System.out.println(a1[i].length());
        }
    }

    public static void zadanie30(String[] a, String[] b) {
        String[] result = new String[a.length + b.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            result[count++] = b[j];
        }
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println(" ");

    }

    public static void zadanie34(List<Integer> list, List<Integer> list1) {
        list.addAll(list1);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }

    public static void zadanie35(List<String> list2) {
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).charAt(0) == 'P') {
                System.out.println(list2.get(i));
            }
        }
    }


    public static int sum(int i1, int n) {

     // if (i1 > 0 && n > 0 && n > i1) {
            int result = ((n - i1 + 1) * (i1 + n) / 2);
            System.out.println(result);
            return result;


    }

    public static int sum(int n) {
        return  n * (n + 1) / 2;
    }
    // 1 + 2 + 3 + 4 + 5 + 6 + 7

    public static int sum2( int i, int n) {
        return sum(n) - sum(i - 1);
    }
    /*
      25
     * 36
     __________

     20 * 6 + 5 * 6

     */
    public static void zadanie_19 (int[] aa, int[] bb) {
        int result = 0;
        int sum = 0;

        int powB = 0;
        for (int i = bb.length - 1; i >= 0; i--) {
            int tempResult = 0;
            int powA = 0;
            for (int j = aa.length - 1; j >= 0; j--) {
                tempResult += bb[i] * Math.pow(10, powB)* aa[j] * Math.pow(10, powA);
                powA++;
            }
            powB++;
            result += tempResult;
        }
        System.out.println(result);
    }

}


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

