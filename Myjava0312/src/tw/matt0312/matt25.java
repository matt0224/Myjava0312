package tw.matt0312;

public class matt25 {

	public static void main(String[] args) {
		 matt253.m1();   //呼叫m1方法
		// matt253 b1= new matt253();
		// matt253 b2= new matt253();   // static只會做一次載入時 
	}

}
class matt251{				//膽案裡面有類別但決不是matt25
	 static {System.out.println("s1");}
	 // matt251(){System.out.println();}  1. //這邊是建構式  這行碼調使用matt251(int a){}  主類別做一個無船參數
	 //matt251(int a){}      //這邊已經有定義  堅持要的用的話用子類別 super(2);     // 將會出現紅字 解決方法
	 matt251(int a){System.out.println("matt251(int)");}
}                                           //類別只有建構式 類別方法
class matt252 extends matt251 {    //如果有父類別有建構則是無傳回
	 static {System.out.println("s2");}
	  matt252(String a){         //裡面int a有會沒有沒差
		  // super()					//1.上面 matt251(){System.out.println();}
		  super(2);            //super(2)建立的同時 matt251(int a){}也建立了 父子類別
		  System.out.println("matt252(String)");
	  }
	
}
class matt253 extends matt252 {    //如果有父類別有建構則是無傳回
	 static {System.out.println("s3");}
      matt253(){
    	  super("matt");
    	  System.out.println("matt253(String)"); };
    	  static void m1(){System.out.println("m1()");}
	 // matt253(int a){         //裡面int a有會沒有沒差
		  	// super()					//1.上面 matt251(){System.out.println();}
		 // super(2);            //super(2)建立的同時 matt251(int a){}也建立了 父子類別
	  }
