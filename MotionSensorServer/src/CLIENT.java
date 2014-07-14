import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.labs.motionsensorclient.POINT;

public class CLIENT {

	Socket sock;
	ObjectOutputStream OOS;
	public CLIENT() {
		try {
			sock = new Socket("127.0.0.1", 4242);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void sendPoint(POINT p) {
		try {
			OOS = new ObjectOutputStream(sock.getOutputStream());
			OOS.writeObject(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
