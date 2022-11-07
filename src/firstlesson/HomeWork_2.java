package firstlesson;

public class HomeWork_2 {

    public static void main(String[] args) {
        summa(2,3);
        ostatok(2, 5);
       printNumbers2(-4);
        printNumbers(-6);
        formula(15);
        method1(10, 5);

        sumNumbers(10, 7);

    }

    public static int summa(int i, int x) {
        int sum = 0;
        while (i < x){
            sum += i;
            i++;
        }
        System.out.println(sum);
        return sum;
    }


    public static void ostatok(int i, int x) {
        int sum = summa(i, x);

        int resut = 0;
        if (sum % 3 == 0) {
            resut = sum * sum;
          /// System.out.println(sum * sum + ";");
        } else {
            if (sum % 3 == 1) {
                resut = sum * sum * sum;
            }
            else {
                resut = sum;
            }
        }

        System.out.println(resut );

    }

    public static void printNumbers(int x) {

        if (x > 0) {
            for (int i = 0; i < x; i++) {
                System.out.println(i);
            }
        }
        if (x < 0) {
            for (int i = x; i <= 0; i++) {
                System.out.println(i);
            }

        }
    }
    public static void printNumbers2(int x){
        int start = 0;
        int end = x;
        if (x < 0) {
            start = x;
            end = 0;
        }
        int i = start;
        while (i<= end){
            System.out.println(i + ")");
            i++;
        }
    }


    public static void formula(int n) {
        int factorial = 1;
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
             sum +=   1. /  factorial ;

        }

        System.out.println(sum);
    }

    public static void method1(int a, int b) {
        int razn = a - b;
        if (a > b) {
            System.out.println(true);
        }
        if (razn < 0) {
            System.out.println(false);
        }
    }

    public static void sumNumbers (int n , int k ) {
        int sum = 0;

        for ( int i = 0; i < n ; i ++) {

            if ( sum > k ) {

                break ; //Останавливает цикл

                 }

            if ( i % 2 == 0) { //Четное число

                continue ;//Переход на . новый / шаг

            }
            sum += i ;
        }
        System . out . println ("Сумма равна " + sum );

    }

public static void method2(int x){
        switch (x){
            case 1:
                System.out.println("!");
                break;
            default:
                System.out.println();
        }
}
}




