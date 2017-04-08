package tw.matt0312;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class matt66 {

	public static void main(String[] args) {
		try {
			ServerSocket  server=new ServerSocket(9999);
			Socket socket =server.accept();//傳出Socket
			
			System.out.println(socket.getInetAddress().getHostAddress());
			InputStream in =socket.getInputStream();
			
			
			int i;
			while((i=in.read())!=-1){
				System.out.println((char)i);
			}
			server.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
