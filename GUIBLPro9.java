import java .awt.*;
import javax.swing.*;
public class GUICLPro10 extends JFrame implements ActionListener
{
  CardLayout cl;
  JButton b1;
  Container c;
  GUICLPro10()
  {
    c.getContentPane();
    cl=new CardLayout(40,30);
    c.setLayout(cl);
    b1=new JButton("A");
    b1.addActionListener(this);
    c.add("a",b1); 
  } 
  public static void main(String args[])
  {
    GUICLPro10 p=new GUICLPro10();
    p.setSize(400,400);
    p.setVisible(true);
    p.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}