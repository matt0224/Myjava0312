package tw.matt0312;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class matt65 {

	public static void main(String[] args) {
	  
		try {
		Socket socket=new Socket(InetAddress.getByName("127.0.0.1"), 4444);
		OutputStream out = socket.getOutputStream();//不用用物件實體輸出資料 藉由得到的socket得到
		
		out.write("Hello, World".getBytes()); //這邊開始送byte資料
		out.flush();
		out.close();
			
		socket.close(); //一開始是socket 對socket
	} catch (Exception e) { //人家不跟你講話會找出例外
		System.out.println();
	} 
	   }
	}


