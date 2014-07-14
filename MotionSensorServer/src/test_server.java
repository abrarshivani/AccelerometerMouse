import java.awt.AWTException;
import java.awt.Robot;

import com.labs.motionsensorclient.POINT;

public class test_server {
	public static void main(String[] args) {
		Robot r;

		try {
			r = new Robot();
			POINT P = new POINT();
			Server S = new Server();
			while (true) {
				P = S.getPoint();
				System.out.println(P.getX() + " " + P.getY());
				r.mouseMove((int)(P.getX()), (int)(P.getY()));
			}

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
