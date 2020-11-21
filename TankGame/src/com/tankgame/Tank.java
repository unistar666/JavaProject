package com.tankgame;

//坦克类
class Tank{
	int x = 0;					//坦克横坐标
	int y = 0;					//坦克纵坐标

	int direct = 0;				//坦克方向 0：上 1：左 2：下 3：右
	
	int speed = 10;				//坦克速度

	int type = 0;				//坦克类型
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getDirect() {
		return direct;
	}

	public void setDirect(int direct) {
		this.direct = direct;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	public Tank(int x, int y) {
		this.x = x;
		this.y = y;
	}
}