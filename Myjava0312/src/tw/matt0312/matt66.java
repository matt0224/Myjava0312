package tw.matt0312;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class matt66 {

	public static void main(String[] args) {
		try {
			ServerSocket  server=new ServerSocket(3333);
			System.out.println("before");
			server.accept(); //接收
			System.out.println("afrter");
			server.close();
			System.out.println("Ok");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
