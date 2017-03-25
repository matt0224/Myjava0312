package tw.matt0312;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 讀沒有a的
 */
public class matt49 {

	public static void main(String[] args) {
		File file =new File("./dir1/file1.txt ");  
		             
		  try{
			FileInputStream fin= new FileInputStream(file);
			  byte[] buf=new byte[3] ;	 //字串也是byte構成 //使用utf8改成3才會顯示中文字 //微軟還是2個BYTE
			  int len ;  //這邊怕遇到不是byte的
			  while((len=fin.read(buf))!=-1){     
				  System.out.print(new String(buf,0,len));
			  }
			
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
