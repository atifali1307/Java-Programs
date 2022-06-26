/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Atif Ali
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
class MouseHandler extends MouseAdapter{
	MyCanvas can;
	 MouseHandler(MyCanvas can){
		 this.can=can;
	 }
 int x, y;
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x=e.getX();
		y=e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g =can.getGraphics();
		g.fillRect(x, y, e.getX()-x, e.getY()-y);
	}

		
}
class MyCanvas extends Canvas{

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		this.addMouseListener(new MouseHandler(this));
		g.setColor(Color.RED);
		g.drawString("Java Swing", 100, 100);
		g.setColor(Color.BLUE);
		g.fillRect(100, 150, 200, 200);
		g.setColor(Color.GREEN);
		g.drawOval(400, 200, 150, 350);
		g.setColor(Color.BLACK);
		g.drawArc(500, 50, 50, 80, 180, 200);
	}
	
}
class MyDrawing extends JFrame {
	Container c;
	MyCanvas dr;
	MyDrawing(){
		c=this.getContentPane();
		dr=new MyCanvas();
		c.add(dr);
	}
}
public class DrawingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				MyDrawing d =new MyDrawing();
				d.setSize(800,600);
				d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				d.setLocationRelativeTo(null);
				d.setVisible(true);
	}

}
