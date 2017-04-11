package tw.matt0312;

/*
 * 從65複製過來的
 */
	import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

//複製老師65的

	import java.io.IOException;
	import java.io.OutputStream;
	import java.net.InetAddress;
	import java.net.Socket;
public class matt67 {
                //把檔案讀到一包在全部發出去
		public static void main(String[] args) {
			try {
				File sendFile = new File("./dir2/images7023PMS2.jpg");
				   //有圖案在/dir2裡面要發送且建立一個sendfile看檔案有多大
				byte[]buf=new byte[(int)sendFile.length()];//準備一個2g讓他讀檔案限定2G 
				BufferedInputStream bin = new BufferedInputStream
						  (new FileInputStream(sendFile)); //第一步先建立這個 
				//把檔案讀進來Buffered""In""putStream
				bin.read(buf); //把圖檔全部讀進buf陣列裡面 所以要建立byte
				bin.close();
				Socket socket = new Socket(InetAddress.getByName("10.2.1.117"), 9999);
				
				OutputStream out = socket.getOutputStream();
				out.write(buf); //這邊要改發蛇模
				out.flush();
				out.close();
				
				socket.close();
			} catch (Exception e) {
				//System.out.println();
			}
		}

	}