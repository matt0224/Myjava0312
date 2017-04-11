package tw.matt0312;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * 從66號copy的
 */
public class matt68 {

	public static void main(String[] args) {
		try {
			ServerSocket  server=new ServerSocket(1235);
			Socket socket =server.accept();//傳出Socket
			System.out.println("ok");
			System.out.println(socket.getInetAddress().getHostAddress());
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));
			 //BufferedOutputStream把檔案寫進來這邊	讀多少寫多少得概念								//進來的檔案都叫做上面這個黨名只有一次性只知道檔案內容
			 //用BufferedInputStream來收 從網路這邊讀進來的 socket.getInputStream()把源頭灌進來
			//但不知道讀進來檔案有多大 網路先才有本地端 所以建立BufferedOutputStream
			BufferedInputStream bin =new BufferedInputStream(socket.getInputStream());
			byte[] buf=new byte [4096]; int len; //這邊用4096,4096寫 準備一個byte是準備讀出去的
			while ((len=bin.read(buf))!=-1){
				bout.write(buf, 0, len); //4096,4096不足4096就寫這些道-1脫離
			}
			//BufferedInputStream bin =new BufferedInputStream(socket.getInputStream());
			//bin.close(); 碼調這兩行是網路進來的 其他連同這兩行是準備寫出去的
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
