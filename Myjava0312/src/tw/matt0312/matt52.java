package tw.matt0312;
/*
 * 換列符號    檔案是自己建的 也是讀進來
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class matt52 {

	public static void main(String[] args) {
		 File file = new File("./dir1/Book1.csv");
		  try{                                 //
	         FileReader fr = new FileReader(file); //想讀上面接一根管子 因為 BufferedReader需要一個Reader
	         BufferedReader br =new BufferedReader(fr);   // 這根管子讀一列不包含換列符號
	        // System.out.println(br.readLine());
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
