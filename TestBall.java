public class TestBall
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball("White", 7);
        Ball b2 = new Ball("Red", 12);
        Ball b3 = new Ball("Blue");
        b3.setAge(3);
        System.out.println();
        b1.intoBallColor();
        b2.intoBallColor();
        b3.intoBallColor();
    }
}