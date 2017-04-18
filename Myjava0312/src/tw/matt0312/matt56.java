package tw.matt0312;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
 * 這邊怎麼讀出來跟上面55號儲存的圓投有關
 */
public class matt56 {

	public static void main(String[] args) {
		try {
			DataInputStream din=new DataInputStream(new FileInputStream("./dir2/data1.dat"));
			                                          //把資料夾讀進來顯示在console
			String c=din.readUTF();
		    String s1=din.readUTF();   //這兩行的寫法無法讀到55的原因是因為存的順序要跟讀的順序一樣不能隨便變化
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
