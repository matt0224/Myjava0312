package tw.matt0312;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class matt51 {

	public static void main(String[] args) {
		File file =new File("./dir1/file1.txt ");  
		                //來源還是資策會資料夾
		      try {
				FileReader reader = //
						//這個使用父類別的reder方法文字
						  new FileReader(file);
				int temp;
				while( (temp=reader.read())!=-1){  //這邊是一個一個讀近來他認的就是字元 文字資料
					System.out.print((char)temp);
				}
				reader.close(); //有開有關
			} catch (Exception e) {
				System.out.println(e.toString());
				
			}       
		 
		}
	
	}
