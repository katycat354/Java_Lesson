package firstlesson;

import java.util.Scanner;

public class DemoSum {

    public static void main(String[] args) {
      //  sum(5);
       // prod(3);
        int x = 5;
        System.out.println(x * 1. / 2);
        /*
        int / int = int
        double / int = double
        int / double = double

         */
        while (x < 0){
            System.out.println("!");
        }
        do{
            System.out.println("!!");
        } while (x < 0);

    ////    input();
        sumNumbers(5, 3);
    }


    public static void input () {
        Scanner sc = new Scanner(System.in); //нужно,
         // чтобы
//можно \ вводить \ информацию \ с \ клавиатуры
         int i = 0;
        do {
             System . out . println ( " Type any number . To break type a -1 " );
            i = sc . nextInt ();
             } while ( i != -1);
         }

    public static void sum(int x){
        int i = 0;
        int sum = 0;
        while (i <= x){
            sum += i ;//sum = sum + i;
            i++; //i += 1;//i = i + 1;
        }
        System.out.println(sum);
    }


    public static void prod ( int n ) {
        int i = 1;
        int prod = 1;
        while ( i <= n ) {
            prod = prod * i ;
            i = i + 1;
        }
        System . out . println ( "Произведение от 1 до " + n + " равно " + prod );
    }

    public static void sumNumbers ( int n , int k ) {
        int sum = 0;
        for ( int i = 0; i < n ; i ++) {
            if ( sum > k ) {
                break ; //Останавливает цикл
            }
            sum += i ;
            ///
            ///

        }
        System . out . println ( "Сумма равна " + sum );
    }

    public static void sumNumbers2 ( int n , int k ) {
        int sum = 0;
        for ( int i = 0; i < n  && sum <= k; i ++) {
            /*if ( sum > k ) {
                break ; //Останавливает цикл
            }

             */
            sum += i ;
            ///
            ///

        }
        System . out . println ( "Сумма равна " + sum );
    }

}
