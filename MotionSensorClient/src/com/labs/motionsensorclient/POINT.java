package com.labs.motionsensorclient;
import java.io.Serializable;


public class POINT implements Serializable {
	private float x;
	private float y;
	
	public POINT() {
		x=y=0;
	}
	float getX() {
		return this.x;
	}
	
	float getY() {
		return this.y;
	}


	void setX(float x) {
		this.x = x;
	}

	void setY(float y) {
		this.y = y;
	}

}
