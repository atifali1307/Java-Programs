class TestFinallyBlock
{
  public static void main(String args[])
  {
    try{
      System.out.println("Inside Try Block");
      int data=25/0;
      System.out.println(data);
    }
    catch(ArithmeticException e){
      System.out.println("Exception Handled");
      System.out.println(e);
    }
    finally{
      System.out.println("Finally Block always executed");
    }
    System.out.println("After Finally Block");
  }
}
