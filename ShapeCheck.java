class Shape
{
  void draw()
  {
    System.out.println("I am in Shape Class Draw Method");
  }
  void erase()
  {
    System.out.println("I am in Shape Class Erase Method");
  }
}
class Circle extends Shape
{
  void draw()
  {
    System.out.println("I am in Circle Class Draw Method");
  }
  void erase()
  {
    System.out.println("I am in Circle Class Erase Method");
  }
}
class Triangle extends Circle
{
  void draw()
  {
    System.out.println("I am in Triangle Class Draw Method");
  }
  void erase()
  {
    System.out.println("I am in Triangle Class Erase Method");
  }
}
class Square extends Triangle
{
  void draw()
  {
    System.out.println("I am in Square Class Draw Method");
  }
  void erase()
  {
    System.out.println("I am in Square Class Erase Method");
  }
}
public class ShapeCheck
{
  public static void main(String args[])
  {
    Shape s=new Circle();
    System.out.println("Polymorphism. i use (Shape s=new Circle();)");
    s.draw();
    s.erase();
    System.out.println("Polymorphism. i use (Circle c=new Triangle();)");
    Circle c=new Triangle();
    c.draw();
    c.erase();
    System.out.println("Polymorphism. i use (Shape s=new Circle();)");
    Triangle t=new Square();
    t.draw();
    t.erase();
  }
}













