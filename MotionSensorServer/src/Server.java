import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.labs.motionsensorclient.POINT;


public class Server {

	private ServerSocket serverSock;
	DataInputStream ObI;
	
	public Server() {
		try {
			serverSock = new ServerSocket(4242);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	POINT getPoint() {
		while(true) {
			try {
				Socket sock  = serverSock.accept();
				ObI = new DataInputStream(sock.getInputStream());
				POINT p= new POINT();
				float x = ObI.readFloat();
				float y = ObI.readFloat();
				p.setX(x);
				p.setY(y);
				return p;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
	}
	
}
