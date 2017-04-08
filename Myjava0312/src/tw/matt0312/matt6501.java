package tw.matt0312;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class matt6501 {

	public static void main(String[] args) {
	   for(int i=50;i<100;i++){  //這段code有ttl延遲時間 大約一段code10秒
		try {
		Socket scoket=new Socket(InetAddress.getByName("127,0,0,1"), i);
		System.out.println("port"+i);
	} catch (Exception e) { //人家不跟你講話會找出例外
		System.out.println();
	} 
	   }
	}

}
