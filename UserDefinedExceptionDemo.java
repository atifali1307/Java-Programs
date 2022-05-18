class UserDefinedException extends Exception
{
  int num1;
  UserDefinedException(int num2){
    num1=num2;
  }
  public String toString(){
    return ("Status Code: "+num1+" Error");
  }  
}

class UserDefinedExceptionDemo
{
  public static void main(String args[])
  {
    try
    {
	throw new UserDefinedException(404);
    }
    catch(UserDefinedException e){
	System.out.println(e);
    }
    finally{
	System.out.println("Finally Block Executed");
    }
  }
}