package tw.matt0312;
/*
 * 這邊實作建構式使用無傳但父類別KM1一定要有無傳
 * \\
 */
public class matt25301 {

	public static void main(String[] args) {
		// matt253.m1();   //呼叫m1方法
		// matt253 b1= new matt253();
		 km3 b2= new km3();   // static只會做一次載入時 
	}

}
class km1 {	// 將會出現紅字 解決方法
	km1(){}
	 km1(int a){System.out.println("matt251(int)");}
}                                           
class km2 extends km1 {    //如果有父類別有建構則是無傳回
	km2(){;System.out.println("a");}
	 // 如果matt53空有兩招弟一招 matt()         {super(0)} 
	                     //上面這邊空的給下面但上面是int還是要給他
	  km2(String a){         //裡面int a有會沒有沒差
		  // super()					//1.上面 matt251(){System.out.println();}
		  super(2);            //super(2)建立取得父類別的同時 matt251(int a){}也建立了 父子類別
		  System.out.println("matt252(String)");
	  }
	
}
class km3 extends km2 {    //如果有父類別有建構則是無傳回
	  
	  }
