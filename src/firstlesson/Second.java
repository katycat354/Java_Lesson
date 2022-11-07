package firstlesson;

public class Second {

    public static void main(String[] args) {
       hello();
       hello("John");
       hello("Mary");
       max(2, 7);
       max(-100, 39);
       max(4,  7);

    }

    public static void hello(){
        System.out.println("Hello ");
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void max(int x, int y){
        System.out.println("Данный алгоритм ищет максимальное число среди " + x + " и " +y);
    }

}
