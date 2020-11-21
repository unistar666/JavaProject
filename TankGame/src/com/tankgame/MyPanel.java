package com.tankgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

//�Զ������
class MyPanel extends JPanel implements KeyListener{
	PlayerTank playertank = null;

	int enSize = 3;						//�з�̹������
	//�����з�̹��
	Vector<EnemyTank> en = new Vector<>(); 
	public MyPanel() {
		//��������̹��
		 playertank = new PlayerTank(150, 150);
		 
		 //�����з�̹��
		 for(int i=0; i<enSize; i++) {
			 EnemyTank e = new EnemyTank((i+1)*50, 0);
			 e.setDirect(2);
			 e.setType(1);
			 en.add(e);
		 }
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		//����̹��
		g.fillRect(0, 0, 500, 500);
		this.drawTank(playertank.getX(), playertank.getY(), g, playertank.getDirect(), 0);
		for(int i=0; i<en.size(); i++) {
			this.drawTank(en.get(i).getX(), en.get(i).getY(), g, en.get(i).getDirect(), 1);
		}
	}
	
	//����̹�˷���
	public void drawTank(int x, int y, Graphics g, int direct, int type) {
		//�ж�̹������
		switch(type) {
		case 0:
			g.setColor(Color.cyan);
			break;
		case 1:
			g.setColor(Color.MAGENTA);
			break;
		}
		
		switch(direct) {
		case 0:
			//��߾���
			g.fill3DRect(x, y, 5, 30, false);
			//�ұ߾���
			g.fill3DRect(x+15, y, 5, 30, false);
			//�м����
			g.fill3DRect(x+5, y+5, 10, 20, false);
			//Բ��
			g.fillOval(x+5, y+10, 10, 10);
			//ֱ��
			g.drawLine(x+10, y+15, x+10, y);
			break;
		case 1:
			g.fill3DRect(x, y, 30, 5, false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false);
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x, y+10);
			break;
		case 2:
			g.fill3DRect(x, y, 5, 30, false);
			g.fill3DRect(x+15, y, 5, 30, false);
			g.fill3DRect(x+5, y+5, 10, 20, false);
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y+30);
			break;
		case 3:
			g.fill3DRect(x, y, 30, 5, false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false);
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x+30, y+10);
			break;
		}
	}

	@Override
	//�����¼� w:�� a:�� s:�� d:��
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == e.VK_W) {
			this.playertank.setDirect(0);
			this.playertank.moveUp();
		}
		else if(e.getKeyCode() == e.VK_A) {
			this.playertank.setDirect(1);
			this.playertank.moveLeft();
			}
		else if(e.getKeyCode() == e.VK_S) {
			this.playertank.setDirect(2);
			this.playertank.moveDown();
		}
		else if(e.getKeyCode() == e.VK_D) {
			this.playertank.setDirect(3);
		    this.playertank.moveRight();
		}
			   
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}