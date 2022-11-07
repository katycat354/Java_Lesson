package firstlesson;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class HomeWork6 {
    public static void main(String[] args) {
        String str = "Hello World dofdh";
        String strSecond = "Htfaatdftd 111iii .... uuuu";
        String strThird = "Hello";
        String a [] = {" H e l l o " , "PP" , "AAA" , " 65 cdaxsCSD" , " : " , " 789 " } ;
        String s = "Hello";
        String s1 = "hello";
        String a1 []= {"aaa", "bab", "cccc", "ccz"};
        String b1 [] = {"abb", "abc", "ccac", "ckz", "dea", "mp", "upc"};
        //Списки
        List<Integer> list = new ArrayList<>();
        list.add(77);
        list.add(89);
        list.add(32);
        list.add(100);
        list.add(13);


        //zadanie25 (str);
        //zadanie26 (strSecond);
       zadanie27 (strThird);
      //  zadanie28(a[]);
       // zadanie29(s);
        //zadanie31(s, s1);
       // zadanie34(list);

        System.out.println(sum(6));

    }

    public static void zadanie25(String str) {
        for (int i = str.length() - 1; i >= 0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    }

    public static void zadanie26(String[] str) {

        for (int i = 0; i < str.length ; i++) {
            String strSecond = str[i];

            if ((strSecond.startsWith("a")) || (strSecond.startsWith("e")) || (strSecond.startsWith("o"))
                    || (strSecond.startsWith("y")) || (strSecond.startsWith("u")) || (strSecond.startsWith("i"))) {
                System.out.println(strSecond);
            }
        }
    }

    public static void zadanie27 (String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    public static void zadanie28 (String[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println( a[i].length());
        }
    }

    public static void zadanie29 (String s){
        System.out.println(s.replace('e' , 'k'));
        System.out.println(s.replace("o", "R"));
        System.out.println(s.replaceAll("l", "!"));
        System.out.println(s.substring(2));
        System.out.println(s.substring(1, 4));
        System.out.println(s.indexOf( "H"));
    }


    public static void zadanie31(String s, String s1){
        boolean check;
        check = s.equalsIgnoreCase(s1);
        if (s.equalsIgnoreCase(s1)) {
            System.out.println(check);
        }


        check = s1.equalsIgnoreCase(s1);
        System.out.println(check);
    }


    public static void zadanie32(String s){
        for (int i = 0; i < s.length(); i++){
            if (s.startsWith("a")){
                System.out.println(s.charAt(i));
                System.out.println(s.length());
            }
        }
    }

    public static void zadanie30 (String [] a1, String [] b1){

    }

    public static void zadanie34 (List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i) + " ");
        }
        list.add(2, 66);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.add(0, -8);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        list.remove(4);
        list.remove(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    public static int sum(int n){
        return  n * (n + 1) / 2;
    }

    public static int sum(int i, int n){
        /*
        i > 0
        n > 0
        n > i
         */
        return 0;
    }
    // 4 + 5 + 6 + 7 ... + 15
    // 1 + 2 + 3 +4 + 5 = 15

 // 5 * 6 / 2 = 15

    // 10 * 11 / 2 = 55

}


