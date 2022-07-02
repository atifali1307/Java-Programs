//Static Control Flow

class Base2
{
  static int i=10;
  static int j=20;
  static
  {
    methodOne();
    System.out.println("First Static Block");
  }
  static int k=30;
  public static void methodOne()
  {
    System.out.println(i+j+k+l);
  }
  public static void main(String args[])
  {
    methodOne();
    System.out.println("Main Method");
  }
  static
  {
    System.out.println("Second Static Block");
  }
  static int l=40;
}