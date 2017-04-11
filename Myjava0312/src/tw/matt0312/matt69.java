package tw.matt0312;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

//url
public class matt69 {

	public static void main(String[] args) {
		 try{
			 URL url=new URL("http://www.msn.com/zh-tw/news/national/%e7%82%ba%e4%bd%95%e6%95%b8%e5%8d%81%e5%b9%b4%e5%89%8d%e7%9a%84%e5%8f%b0%e7%81%a3%e6%98%af%e5%9c%8b%e9%9a%9b%e4%b8%8a%e7%9a%84%e7%a7%91%e6%8a%80%e9%be%8d%e9%a0%ad%ef%bc%8c%e7%8f%be%e5%9c%a8%e5%8d%bb%e5%be%97%e9%9d%a2%e8%87%a8%e6%85%98%e6%be%b9%e4%bb%a3%e5%b7%a5%e5%91%bd%e9%81%8b%ef%bc%9f/ar-BBzGSue?li=BBqiNIb&ocid=iehp&fullscreen=true#image=1");
			 URLConnection conn =url.openConnection();
			 InputStream in = conn.getInputStream();
			 
			 
			 BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii2.jpg"));
			 BufferedInputStream bin =new BufferedInputStream(in);
				byte[] buf=new byte [4096]; int len; //這邊用4096,4096寫
				while ((len=bin.read(buf))!=-1){
					bout.write(buf, 0, len);
				}
				bin.close();
				bout.flush();
				bout.close();
				
				System.out.println("OK");
					
		 }catch(Exception e){
			 System.out.println(e.toString());
		 }

	}

}
