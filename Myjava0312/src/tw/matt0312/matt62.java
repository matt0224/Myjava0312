package tw.matt0312;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class matt62 {

	public static void main(String[] args) {
		
		try {
		//	InetAddress ip=InetAddress.getByName("www.iii.org");
			InetAddress[] ips=InetAddress.getAllByName("www.iii.org");
		//用for InetAddress[]  //
				for(InetAddress ip:ips){
				System.out.println(ip.getHostAddress());
			//}
				}
			
				//System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
			
		}

	}

}
