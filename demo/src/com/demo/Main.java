package com.demo;
import javax.swing.JFrame;
public class Main {
	public static void main(String[] args) {
	JFrame obj=new JFrame();
	gameplay gp=new gameplay();
	obj.setBounds(10,10,700,600);
	obj.setTitle("breakout ball");
	obj.setResizable(false);
	obj.setVisible(true);
	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	obj.add(gp);
	}

}
