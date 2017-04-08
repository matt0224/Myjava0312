package tw.matt0312;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class matt61 {

	public static void main(String[] args) {
	   matt613 obj =new matt613(); //序列是一個一個按造順序  並列
	   	//序列
	   try {
		ObjectOutputStream oout= new ObjectOutputStream(new FileOutputStream("./dir2/matt611"));
		oout.writeObject(obj);//資料寫出
		oout.flush();
		oout.close();
		System.out.println("OK");
	} catch (Exception e) {
       System.out.println(e.toString());
	}
	System.out.println("-------");
	   //解序
	   try{
		  ObjectInputStream oin =new ObjectInputStream(new FileInputStream("./dir2/matt611"));
		  matt613 obj2= (matt613)oin.readObject();
		  oin.close();
	   }catch(Exception e){
		   
	   }
	}       //建構式非物件所以全部東西都會回來
}
class matt611 {    //阿公宣告有序列化 子孫都有
	matt611(){System.out.println("matt611()");}
}
class matt612 extends matt611{
	matt612(){System.out.println("matt612()");}
}
class matt613 extends matt612 implements Serializable{ //只有孫子有序列化只有孫子有解回來
	matt613(){System.out.println("matt613()");}
}
