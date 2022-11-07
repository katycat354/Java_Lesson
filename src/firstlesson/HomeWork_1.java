package firstlesson;

public class HomeWork_1 {
    public static void main(String[] args){
        int y =5;
       abs(y);
       whatIsANumber(-9);
       square(4);

    }

    public static void abs(int x){
        if (x>=0){
            System.out.println(x);
        } else{
            System.out.println(x * (-1));
        }

    }
    public static void whatIsANumber(int x){
        if (x > 0){
            System.out.println("Positive number");
        }
        if (x < 0){
            System.out.println("Negtive number");
        }
        if (x == 0){
            System.out.println(0);
        }


    }

    public static void square(double radius){
        double S;
        S = Math.PI * radius * radius;
        System.out.println(S);
    }



}
