/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Atif Ali
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class MyPainterCanvas extends JFrame implements MouseMotionListener{
	MyPainterCanvas(){
		addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g =getGraphics();
		g.setColor(Color.RED);
		g.fillOval(e.getX(), e.getY(), 4, 4);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class MyPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				MyPainterCanvas p=new MyPainterCanvas();
				p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				p.setBounds(200,200,600,400);
				p.setVisible(true);
	}

}
