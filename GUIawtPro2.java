import java.awt.*;
import java.awt.event.*;
class GUIawtPro2 extends Frame implements ActionListener
{
  TextField t;
  GUIawtPro2()
  {
    t=new TextField();
    t.setBounds(30,100,80,30);
    Button b=new Button("Click on me");
    b.setBounds(100,120,80,50);
    b.addActionListener(this);
    add(b);
    add(t);
    setSize(300,300);
    setLayout(null);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e) 
  {
    t.setText("Welcome");
  }
  public static void main(String args[])
  {
    new GUIawtPro2();
  }
}