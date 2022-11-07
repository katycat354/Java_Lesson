package firstlesson;

public class ThirdClass {

    public static void main(String[] args) {
        max(4, 5);
        min(6, 9);
        isEven(63);
        ///print10Times();
        printNumbers(10);
    }

    public static void max(int x, int y){
        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }

    public static void min(int x, int y){
        if (x < y){
            System.out.println(x);
        } else{

            System.out.println(y);
        }
    }

    public static void  isEven(int x) {
        if (x%2==0){
            if (x > 0) {
                System.out.println("Positive even");
            } else {
                System.out.println("Negztive even");
            }
            System.out.println("Chetnoe");
        } else{
            System.out.println("Nechetnoe");
        }
    }

    public static void print10Times () {
        int i = 0;
        while ( i < 10) {
            System . out . println ( "Это строка" );
            i = i + 1;
        }
    }

    public static void printNumbers ( int x ) {
        int i = 0;
         while ( i <= x ) {
            System . out . println ( i );
            i = i + 1;
        }
    }

    public static void printNumbers2 ( int x ) {
        int i = 2;
        while ( i <= x ) {
            System . out . println ( i );
            i = i + 2;
        }
    }

}
