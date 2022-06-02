/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Atif Ali
 */
public class Swing1 {
    public static void main(String args[])
    {
        JFrame f=new JFrame();  // creating instance of JFrame
        JButton b=new JButton("Click"); // creating instance of JButton
        b.setBounds(130,100,100,140);  // x axis, y axis, width, height
        f.setResizable(false);
        f.add(b);  //adding button in JFrame
        f.setSize(400,500);  // 400 width and 500 height
        f.setLayout(null); // using no layout managers
        f.setVisible(true);  // making the frame visible
    }
}
