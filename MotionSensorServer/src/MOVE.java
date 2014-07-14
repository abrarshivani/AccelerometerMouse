import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

import com.labs.motionsensorclient.POINT;

public class MOVE extends Panel implements Runnable {

	volatile POINT P;

	public void paint(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.BLACK);
		g.drawLine((int) P.getX(), (int) P.getY(), (int) P.getX()+2,
				(int) P.getY()+2);
	}

	public static void main (String[] arg0) {
		int i = 0 ;
		Frame Jframe = new Frame();
		MOVE m = new MOVE();
		m.P = new POINT();
		Jframe.setBackground(Color.WHITE);
		Jframe.setSize(400,400);
		Jframe.setVisible(true);
		Jframe.add(m);
		while(i<100) {
			m.P.setX(m.P.getX() + i);
			m.P.setY(m.P.getY() + i);
			Jframe.add(m);
			i+=2;
		}
//		Thread T = new  Thread(m);
//		
//		T.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
