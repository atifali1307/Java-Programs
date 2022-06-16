
import java.util.*;
class CursorDemo2
{
  public static void main(String args[])
  {
    ArrayList v=new ArrayList();
    //Enumeration e=v.elements();
    Iterator itr=v.iterator();
    ListIterator litr=v.listIterator();
    //System.out.println(e.getClass().getName());
    System.out.println(itr.getClass().getName());
    System.out.println(litr.getClass().getName());
  }
}