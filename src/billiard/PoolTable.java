package billiard;


public class PoolTable {

    int length;
    int width;
    Ball ball;

    public PoolTable(int length, int width, Ball ball){
        this.length = length;
        this.width = width;
        this.ball = ball;
    }

    public void moveBallUp( ) {
        ball.movementUp();
    }

    public static void main(String[] args) {

    }

}
