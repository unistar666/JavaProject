package com.tankgame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

public class TankGame extends JFrame{
	
	public static void main(String[] args) {
			new TankGame();
	}

	
	public TankGame() {
		MyPanel mp = new MyPanel();
		this.add(mp);
		this.addKeyListener(mp);			//×¢²á¼àÌý
		this.setSize(500, 500);
		this.setLocation(150,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}







