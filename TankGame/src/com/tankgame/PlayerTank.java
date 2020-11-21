package com.tankgame;

//Íæ¼ÒÌ¹¿Ë
class PlayerTank extends Tank{
	public PlayerTank(int x, int y) {
		super(x, y);
		
	}
	
	public void moveUp() {
		y-=speed;
	}
	public void moveLeft() {
		x-=speed;
	}
	public void moveDown() {
		y+=speed;
	}
	public void moveRight() {
		x+=speed;
	}
}
