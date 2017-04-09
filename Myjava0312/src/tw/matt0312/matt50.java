package tw.matt0312;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//這邊是坐讀資料
public class matt50 {

	public static void main(String[] args) {
		File file =new File("./dir1/file1.txt ");  
		             
		  try{
			FileInputStream fin= new FileInputStream(file); //這邊用的是 FileInputStream第一招裡面放file
			  byte[] buf=new byte[(int)file.length()] ;	 //陣列最多只能只能到整數範圍 這邊最多只能讀2g
			//  byte[] buf=new byte[1024];//用大一點的臉盆全部丟進去EX:1024 
			  int len =fin.read(buf);                    //然後強制轉型但是只能讀兩G
			                                             //或者改邏輯變迴圈 文字先讀 在讀英文跟數字
			  System.out.println(new String(buf,0,len));
			
//			    System.out.println((char)fin.read());
//			    System.out.println((char)fin.read());
//			    System.out.println((char)fin.read());
			    
			    
				fin.close(); //水龍頭關起來 這是老師的13行 //JAVA 7.8有自動關閉機制
//		  }catch(FileNotFoundException ee){     //他是IOE底下的子類別所以順序上要先
//			  System.out.println(ee.toString());
//		  }catch(IOException ee){      //fin.close關水龍頭要處理IOException
//			  System.out.println(ee.toString());
		  }catch(Exception ee){      //fin.close關水龍頭要處理IOException
			  System.out.println(ee.toString());
		  }
		
	        if(file.exists()){     //他的是RUNTIME執行的時候例外
	        	System.out.println("ok:"+file.getAbsolutePath()); //顯示絕對路進
	        }else{
	        	System.out.println("XX");
	        }
		}
	
	}
