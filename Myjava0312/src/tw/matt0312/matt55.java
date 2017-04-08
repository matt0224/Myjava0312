package tw.matt0312;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class matt55 {

	public static void main(String[] args) {
		int a=1,b=2; String c= "matt", d="資策會";
        try {
			FileOutputStream fout=new FileOutputStream("./dir2/data1.dat");
			DataOutputStream dout=new DataOutputStream(fout);
			dout.writeInt(a);
			dout.writeInt(b);
			dout.writeChars(c);  //怎麼進去怎麼出來最好都用UTF不然讀會報錯 或打算一個字原來處理
			dout.writeUTF(d);
			dout.flush();
			dout.close();
		} catch (Exception e) {
		  System.out.println(e.toString());
		}
        
	}

}
