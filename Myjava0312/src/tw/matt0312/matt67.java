package tw.matt0312;


	import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

//複製老師65的

	import java.io.IOException;
	import java.io.OutputStream;
	import java.net.InetAddress;
	import java.net.Socket;
public class matt67 {

		public static void main(String[] args) {
			try {
				File sendFile = new File("./dir2/images7023PMS2.jpg");
				byte[]buf=new byte[(int)sendFile.length()];//檔案限定2G
				BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sendFile));
				bin.read(buf);
				bin.close();
				Socket socket = new Socket(InetAddress.getByName("10.1.6.65"), 9999);
				
				OutputStream out = socket.getOutputStream();
				out.write("Hello, World".getBytes());
				out.flush();
				out.close();
				
				socket.close();
			} catch (Exception e) {
				//System.out.println();
			}
		}

	}