import java.awt.AWTException;
import java.awt.Robot;


public class CONTROL {

	public static void main(String[] args) {
		int i=0;
		Robot r;
		try {
			r = new Robot();
			while(i<100){
				r.mouseMove(i, i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
