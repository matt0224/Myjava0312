package tw.matt0312;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class matt68 {

	public static void main(String[] args) {
		try {
			ServerSocket  server=new ServerSocket(9999);
			Socket socket =server.accept();//傳出Socket
			
			System.out.println(socket.getInetAddress().getHostAddress());
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));
			 															//進來的檔案都叫做上面這個黨名
			BufferedInputStream bin =new BufferedInputStream(socket.getInputStream());
			byte[] buf=new byte [4096]; int len; //這邊用4096,4096寫
			while ((len=bin.read(buf))!=-1){
				bout.write(buf, 0, len);
			}
			bin.close();
			bout.flush();
			bout.close();
			
		
			server.close();
			System.out.println("receive ok");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
