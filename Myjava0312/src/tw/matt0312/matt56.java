package tw.matt0312;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class matt56 {

	public static void main(String[] args) {
		try {
			DataInputStream din=new DataInputStream(new FileInputStream("./dir2/data1.dat"));
			                                          //讀進來
			String c=din.readUTF();
		    String s1=din.readUTF();
		    int a = din.readInt();
		    int b = din.readInt();
		    char c1 = din.readChar();
		    char c2 = din.readChar();
		    char c3 = din.readChar();
		    char c4 = din.readChar();
		    din.close();
		    System.out.println("==>"+ a +":"+ b +":"+c+":"+s1);
		    		
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
