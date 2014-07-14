import com.labs.motionsensorclient.POINT;




public class test_client {
     public static void main(String [] args) {
    	 POINT P = new POINT();
    	 CLIENT c = new CLIENT();
    	 P.setX(10);
    	 P.setY(10);
    	 c.sendPoint(P);
     }
}
