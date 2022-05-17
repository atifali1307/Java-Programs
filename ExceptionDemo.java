class ExceptionClass
{
  int result;
  ExceptionClass(int num1,int num2)
  {
    try
    {
      result=num1/num2;
    }
    catch
    {
      System.out.println("Catch Block");
    }
  }
  void getResult()
  {
    System.out.println("Result: "+result);
  }
}
public class ExceptionDemo
{
  public static void main(String args[])
  {
    ExceptionClass ex=new ExceptionClass(25,0);
    ex.getResult();
    System.out.println("Exception Handled Successfully");
  }
}