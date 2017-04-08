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
			 URL url=new URL("");
			 URLConnection conn =url.openConnection();
			 InputStream in = conn.getInputStream();
			 
			 
			 BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));
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
