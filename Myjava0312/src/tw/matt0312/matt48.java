package tw.matt0312;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class matt48 {

	public static void main(String[] args) {
		File file =new File("./dir1/file1.txt ");  //一開始就出現紅字要找某建構是建立 找到是字串 //dir
		                     //./dir1/file1.txt                 //這邊就可以開始存取路進了
		                                       //用逗點表示顯示的目錄
		                                      //這邊表示C: 跳脫後面不存在
		                                          //兩\\第一表示跳脫TAB看後面表示真的想表示\
		                                          //可以用C:/test/brad.txt ,java用法自動幫你轉成目錄符號
		        //逗號表示目前所在路進            
		  try{
			FileInputStream fin= new FileInputStream(file);
			  int temp;	 //1位1位近來作的
			  while((temp=fin.read())!=-1){     //不是-1近來作  /fin.read()這只能讀一個BYTE
				  System.out.print((char)temp);
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
