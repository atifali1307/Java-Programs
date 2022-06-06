/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Atif Ali
 */
class Calculator<T,N>
{
  T num1;
  N num2;
  Calculator(T num1,N num2){
      this.num1=num1;
      this.num2=num2;
  }
  public void getResult(){
      if(num1 instanceof Number && num2 instanceof Number){
          System.out.println("Sum= "+(Double.parseDouble(num1.toString())+Double.parseDouble(num2.toString())));
      }
      else{
          System.out.println("Concatenation: "+num1.toString()+num2.toString());
      }
  }
}
public class GenericsCalculator {
    public static void main(String args[])
    {
        Calculator<Integer,Integer> c1=new Calculator<Integer,Integer>(12,15);
        c1.getResult();
        Calculator<Integer,String> c2=new Calculator<Integer,String>(40,"Atif Ali Khan");
        c2.getResult();
    }
}
