abstract class Area
{
  void display()
  {
    System.out.println("Abstract Class Area, Method Display");
  }
  abstract void getArea();    //abstract method
}
class Circle extends Area
{
  int r;
  Circle(int r)
  {
    this.r=r;
  }
  void getArea()
  {
    System.out.println("Area of Circle is: "+(3.14*r*r));
  }
}
public class AbstractExample
{
  public static void main(String args[])
  {
    Circle c=new Circle(2);
    c.getArea();
  }
}











