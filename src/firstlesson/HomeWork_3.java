package firstlesson;

public class HomeWork_3 {
    public static void main(String[] args) {
       // mark(1.0 );
        method();
        int result = sum(5, 7);
        System.out.println("sum "+ result);
        int x1 = sum(7, -98);
        System.out.println("Сумма" + x1);
        sum(3,-8);
        String str = blabla("A", "B");
        System.out.println(str);
        double x = Math.sqrt(2);
        String str22 = "hello";
        System.out.println(str22.toUpperCase());
        HomeWork_1.whatIsANumber(5);
        int max = Integer.MAX_VALUE + 1;
        System.out.println(max);
        int min = Integer.MIN_VALUE;
        System.out.println(min);
    }

    public static String blabla(String s1, String s2) {
        String result = s1 + "!" + s2;
        return result;
    }
    public static int sum(int a, int b) {
       /// System.out.println("sum = " + (a +b))\
        return a + b;
    }
   //     zadanie_9(5, 2, 50);
      //  zadanie_10(6);
 /*
           0 = 000
           1 = 001
           2 = 010
           3 = 011
           4 = 100
           5 = 101
           6 = 110
  */

  /*      zadanie_11(9);
       // zadanie12(16, 9);
       // zadanie_13(5, 2);
        mark(3.7);
        System.out.println(0.1 + 0.2);
        double x = 2.7;
        int y = (int)x * 10;
        switch (y) {
            case 27: break;
        }

        String r = String.valueOf(x); //""+ x;

    }



    public static void zadanie_9(int x, int i, int k) {
        int sum = 0;
        while (i <= x) {
             sum += Math.abs(i);
             i++;
            // -2 2
            // 2 + 1 + 0 + 1 + 2
            if (k > sum) {
                break;
            }

        }
        System.out.println(sum);
    }

    public static void zadanie_10(int n) {
        int binaryNumber = 0;
        String result ="";
        while (n  > 0) {
            binaryNumber = n % 2;
            n = n / 2;
            result = binaryNumber + result ;
        }

        System.out.print(result);

    }

    public static void zadanie_11(double n){
       // double f = Math.sqrt(2);
        double sum = 0;
        for (int i = 1; i <= n;i++){
            sum = Math.sqrt(2 + sum);

        }
        System.out.println(sum);
    }

    public static void zadanie_13(int x, int n){
        int result = 1;
        for(int i = 1; i <= n;i++){
            result = x * result;
        }
        System.out.println(result);
    }
    public static void zadanie12 (int a, int b) {

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
                if (b > a) {
                    b = b % a;
                }
            }
          int  nod = a + b;
            System.out.println(nod);
        }
    }
    public static void mark(double x) {
            if (x==1.0){
                System.out.println("38-40");
             }
            if (x==1.3){
            System.out.println("36-37.5");
            }
            if (x==1.7){
            System.out.println("34-35.5");
            }
            if (x==2.0){
            System.out.println("32-33.5");
            }
            if (x==2.3){
            System.out.println("30-31.5");
            }
            if (x==2.7){
            System.out.println("28-29.5");
            }
            if (x==3.0){
            System.out.println("26-27.5");
            }
            if (x==3.3){
            System.out.println("24-25.5");
            }
            if (x==3.7){
            System.out.println("22-23.5");
            }
            if (x==4.0){
            System.out.println("20-21.5");
            }
            if (x==5.0){
            System.out.println("0-19.5");
        }
    }

*/
    public static void method(){
        mark(5);
    }
    public static void mark(double x) {
        String r = String.valueOf(x);
        switch(r) {
            case "1.0":
                System.out.println ("38 - 40");
                break;
            case "1.3":
                System.out.println("36 - 37.5");
                break;
            case "1.7":
                System.out.println("34 - 35.5");
                break;
            case "5.0":
                System.out.println("0 - 19.5");
                break;
            }

        }
}




