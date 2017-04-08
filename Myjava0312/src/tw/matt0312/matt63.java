package tw.matt0312;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * 兩台電腦對連 這邊是udp協定 我送出去也確認要看對方收不收
 */
public class matt63 {

	public static void main(String[] args) {
		//UDP /TCP 二種兩模式  //往由lag用UDP結果比較重要
         //1一直送不管你收不收  //2連結導向 會問有沒有收到 打電話給我我沒接 等我接 表示三方交握
		String data="hello";
		byte[] sendData= data.getBytes();
		try {
			DatagramSocket socket=new DatagramSocket();//此時19.20行沒關西
			DatagramPacket packet=new DatagramPacket(sendData, sendData.length,InetAddress.getByName("127.0.0.1"),1111);
			socket.send(packet);//這邊才發生關係送出                                                                                                                                      
			socket.close();
			System.out.println("OK");
		} catch (Exception e) {
		    System.out.println(e.toString());
		}
		
	}

}
