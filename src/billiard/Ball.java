package billiard;


public class Ball {


    double x;
    double y;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void movementUp ( ) {
        System.out.println("движение вверх!");
    }

    public void movementLeft(){
        System.out.println("движение влево!");
    }

    public void movementRight(){
        System.out.println("движение вправо!");
    }

    public void movementDown (){
        System.out.println("движение вниз!");
    }

    public void freeMovement(int x, int y){
        System.out.println("Свободное движение!");
    }

}
