interface Parent1
{
  default void display()
  {
    System.out.println("Parent1 Class Display Method");
  }
}
interface Parent2
{
  default void display()
  {
    System.out.println("Parent2 Class Display Method");
  }
}
class MultipleInheritanceDemo implements Parent1,Parent2
{
  public void display()
  {
    Parent1.super.display();

    Parent2.super.display();
  }
  
  public static void main(String args[])
  {
    MultipleInheritanceDemo mi=new MultipleInheritanceDemo();
    mi.display();
  }
}