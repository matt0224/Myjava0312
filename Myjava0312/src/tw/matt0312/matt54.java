package tw.matt0312;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class matt54 {

	public static void main(String[] args) {
		String data = "Hello,matt\nline1\nline2";                   //以最後寫入的為主
		File outfile = new File("./dir2/file1.txt");
		try {
			//FileOutputStream fout =new FileOutputStream(outfile); //黨是空的OUT會自動建立新黨
			FileOutputStream fout =new FileOutputStream(outfile,true);//建構式可以用log增加在屁股
			
			fout.write(data.getBytes()); //字串轉byte很常用 轉型
			fout.flush();  //輸出就會關係到FLUSH CLoSE之前
			fout.close();                      
		} catch (Exception e) {                       //INT會找不到檔案
		     System.out.println(e.toString());
			   //讀有中文有事 輸出沒有
		}
	}

}
