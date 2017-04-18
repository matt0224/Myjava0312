package tw.matt0312;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/*
 * 檔案複製的邏輯-不同的讀法
 */
public class matt58 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		File readFile = new File("./dir2/images7023PMS2.jpg");
		File savaFile = new File("./dir3/images7023PMS2.jpg");
		
		
		try {
			byte[]b=new byte[(int)readFile.length()]; //因傳回LONG強轉
			FileInputStream fin =new FileInputStream(readFile);
			fin.read(b);
			fin.close();  //全部裝在一個BUFF
			
			FileOutputStream fout=new FileOutputStream(savaFile);
		
		    fout.write(b);
			fout.flush();
			fout.close();
			System.out.println("finish");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);
	}

}
