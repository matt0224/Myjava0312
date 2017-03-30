package tw.matt0312;
/*
 * 多型概念
 * 
 */
public class matt26 {

	public static void main(String[] args) {  //宣告指看到了甚麼
		// matt261 b1 = new matt261();
		// matt261 b2 = new matt262();  //要的是261但用子類別生產出來"" 要車子給我法拉利 所以看到的是車子  ""
		 							 //從
		// b2.m1();           //看到的車子但是法拉利的加速,因為261有m1的方法但是是法拉利的加速
		// b2.m2();           //這行不能執行因為看不到法拉利所以無法使用法拉利的方法
		// matt262 b2 = new matt261();   //要法拉利但給車
		// System.out.println(b2.b); //這邊會報措matt261 b2 沒有 b
		// matt262 b3 = new matt262();
		//System.out.println(b2.a);
		 matt261 b4 = new matt263();
		 
		 myf1(b4);  //這邊呼叫b3的262
	}
	static void myf1(matt261 b){    //我要一台車, 但給給一台內外都是法拉利 // 我要一台車  給我的可能是福特 BENZ
		b.m1();                      //這邊稱做為多行
	//	b.m2();    M2就抱錯了 因為因為看不到
	}

}
class matt261{                        
	int a; 
	matt261(){a++;System.out.println("matt()261");}
	void m1(){System.out.println("matt:m1()261");}
	
}
class matt262 extends matt261{
	int b;
	matt262(){a++;System.out.println("matt()262");}
	void m1(){System.out.println("matt:m1()262;b="+b);}  
	void m2(){System.out.println("matt:m2()262");}  
}
class matt263 extends matt261{       
	
}