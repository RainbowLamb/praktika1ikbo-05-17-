public class TestBall
{
    public static void main(String[] args)
    {
        Ball ball1 = new Ball("White", 7);
        Ball ball2 = new Ball("Red", 12);
        Ball ball3 = new Ball("Blue");
        
        ball3.setAge(3);
        System.out.println();
        
        ball1.intoBallColor();
        ball2.intoBallColor();
        ball3.intoBallColor();
    }
}
