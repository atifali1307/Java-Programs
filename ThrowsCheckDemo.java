class ThrowsCheck
{
  void checkAge(int age) throws ArithmeticException
  {
    if(age<18){
      throw new ArithmeticException("Access Denied- You must be at least 18 Years Old.");
    }
    else
    {
      System.out.println("Access Granted - You are Old enough!");
    }
  }
}
public class ThrowsCheckDemo
{
  public static void main(String args[])
  {
    ThrowsCheck tc=new ThrowsCheck();
    tc.checkAge(35);
    tc.checkAge(15);
  }
}