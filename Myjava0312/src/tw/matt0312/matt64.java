package tw.matt0312;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;
//資料要接收這邊要先按
public class matt64 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socker = new DatagramSocket(1111);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socker.receive(packet); //沒經過三方交握 UCP
			socker.close();
			int len = packet.getLength();
			byte[] rdata = packet.getData();
			String urip = packet.getAddress().getHostAddress();
			System.out.println(urip + " => " + new String(rdata, 0, len));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
