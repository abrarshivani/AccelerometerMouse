package com.labs.motionsensorclient;
import java.io.Serializable;


public class POINT implements Serializable {
	private float x;
	private float y;
	
	public POINT() {
		x=y=0;
	}
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}


	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

}
