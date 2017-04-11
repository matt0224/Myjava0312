package tw.matt0312;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class matt6601 {

	public static void main(String[] args) {
		try {
			ServerSocket  server=new ServerSocket(4444);
			Socket socket =server.accept();//傳出Socket  //上面兩個是網路
			                                            //下面是以前接的
			
			System.out.println(socket.getInetAddress().getHostAddress());
			//InputStream in =socket.getInputStream(); //接收資料
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//reader適用文字資料//要讀國字所以用BufferedReader
			
			int i;String line;  //這邊開始接收資料增加String line;
			while( (line = reader.readLine()) != null){ //這邊while((i=in.read())!=-1)改成現在這樣
				System.out.print(line);//(char)i改成現在
			}
			reader.close();//in.close();改現在這樣
			server.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
