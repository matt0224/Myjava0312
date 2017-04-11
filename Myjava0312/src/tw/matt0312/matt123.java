package tw.matt0312;

//接收圖片
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class matt123 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(2234);
			Socket socket = server.accept();//一旦傳成功socket會被傳進來 變成socket對socket
			
			
			System.out.println(socket.getInetAddress().getHostAddress());
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));//不知道傳送過來的檔名
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			byte[] buf = new byte[4096]; int len;
			while((len= bin.read(buf)) != -1){
				bout.write(buf, 0, len);//buf從零開始就這個長度
			}
			bin.close();
			bout.flush();
			bout.close();
			
			server.close();
			System.out.println("Receive OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}

