import java .awt.*;
import java.awt.event.*;
public class GUIMLIPro11 extends Frame implements MouseListener
{
  GUIMLIPro11()
  {
    addMouseListener(this);
    setSize(300,300);
    setLayout(null);
    setVisible(true);
  }
  public void mouseClicked(MouseEvent e)
  {
    Graphics g=getGraphics();
    g.setColor(Color.BLUE);
    g.fillOval(e.getX(),e.getY(),30,30);
  }
  public void mouseExited(MouseEvent e){}
  public void mouseEntered(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
  public void mousePressed(MouseEvent e){}
  public static void main(String args[])
  {
    new GUIMLIPro11();
  }
}