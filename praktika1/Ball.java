public class Ball
{
    private String color;
    private int diameter;

    public Ball(String c, int d)
    {   color = c;
        diameter = d;}
    
    public Ball(String c)
    {   color = c;
        diameter = 0;}
    
    public Ball()
    {   color = "Yellow";
        diameter = 0;}
    
    public void setAge(int diameter)
    {  this.diameter = diameter;}
    
    public void setColor(String color)
    {  this.color = color;}
    
    public String getColor(String color)
    {  return color;}
    
    public int getDiameter()
    {  return diameter;}
    
    public String toString()
    {  return this.color+", diameter "+this.diameter;}
    
    public void intoBallColor()
    {  System.out.println(color+" ball, diameter "+diameter+" ");}
}
