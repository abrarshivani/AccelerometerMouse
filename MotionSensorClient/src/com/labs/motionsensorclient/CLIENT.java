package com.labs.motionsensorclient;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class CLIENT {

	Socket sock;
	DataOutputStream OOS;
	public CLIENT() {
		try {
			sock = new Socket("192.168.0.100", 4242);
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
			OOS = new DataOutputStream(sock.getOutputStream());
			OOS.writeFloat(p.getX());
			OOS.writeFloat(p.getY());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
