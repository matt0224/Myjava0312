package tw.matt0312;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class matt71 {

	public static void main(String[] args) { //泛行
		HashSet set =new HashSet();   //不做飯行 先做一個物件 目前是is set is collection
		
//		matt711 obj2 =new matt712();
//		obj2.m1(); //用是712的方法 
		
		
		
		int i1=12;
		Object obj1=i1;//i1這邊已經是
		Integer i2 = new Integer(34);
		set.add(i2);
	    set.add(i1); //i1=>auto-boxing=>new integer(i2) 這邊自動裝箱了 變成integer(i2)的物件了
	    System.out.println(set); //因為爸爸有改過 直接印出tostring
		System.out.println("====");
		Iterator it=set.iterator(); //因為介面 他有實作 拿到一個蝶代的物件 任何一個set都有碟代
		while(it.hasNext()){  //請問有沒有下一個 ture代表有 拿出
			Object obj=it.next(); //這行證明他是物件 
			Integer i = (Integer)obj;//強制轉型 因為使用
			System.out.println(i.floatValue()); //我有物件打方法出來
		}
		// is a collection =>for-each 存在觀念就可以用
		for (Object obj:set){
			System.out.println((Integer)obj);  //Integer i2 = new Integer(34);印出interger方法
		}                               //obj是整數物件轉型成integer物件 所以下面這行卡官
		//2.System.out.println((boolean)obj); // 這邊就會編譯成功執行失敗沒自動猜相
		//3.System.out.println((float)obj);  //obj>float=>在卡關 轉到int就卡住了
		                                    //obj>integer>int>float
		
//		Bike1 b1 =new Bike1();
//		String s1 ="matt";
//		Integer i1= new Integer(12);  //因為有overrride
//		Integer i2= new Integer("34"); //因為有overrride toString
//		int ii3 =56;
//		Integer i3=ii3;//把56基本型別 i3包成物件 進行給值的時候 沒有新的語法自動裝箱不用任何方法
//		System.out.println(ii3); //印出來都是物件  //印出得i3.tostribg  
		
	}
} //最源頭的obj所以印出記憶體位指 
//class Bike1{
//	@Override
//	public String toString() {
//		return "Bike";
//	}
//}
class matt711{
	void m1(){};
}
class matt712 extends matt711{
	void m1(){};
	void m2(){};
}
	
