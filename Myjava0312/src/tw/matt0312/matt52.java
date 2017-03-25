package tw.matt0312;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class matt52 {

	public static void main(String[] args) {
		 File file = new File("./dir1/Book1.csv");
		  try{                                 //
	         FileReader fr = new FileReader(file); //想讀上面接一根管子
	         BufferedReader br =new BufferedReader(fr);   // 這根管子讀一列
	         String temp ; 
	         while ((temp=br.readLine()) !=null){  //這邊已經變成NULL不是0,-1了
	        	 System.out.println(temp);
	         }
	         fr.close();//水管隨便找一條關閉
		  }catch(Exception ee){
			  System.out.println(ee.toString());
		  }
	}

}
