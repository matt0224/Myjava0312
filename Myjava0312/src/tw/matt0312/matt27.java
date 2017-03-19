package tw.matt0312;
/*
 * 抽象類別,主要為了創造多行
 */
public class matt27 {

	public static void main(String[] args) {
		matt271 b1 = new matt272();  //new 271出現紅字 因為抽象用272定義
		matt271 b2 = new matt273();
		b1.m2();
        b2.m2();
        //這邊抽象方法未宣告
	}

}
abstract class matt271 {    //有抽象類別 這邊也要加 abstract 打算不直接坐車物件實體(期待子類別的出現)
	 matt271(){System.out.println("matt271)");} //可寫可不寫 建構式
	 void m1(){System.out.println("matt271:m1()");}
	 abstract void m2(); // 有這招沒實作 前面要加 abstract   這邊式宣告
}
class matt272 extends matt271 {
	//void m2(){}   //有大括號就有實作了  紅字就消失了
	void m2(){System.out.println("matt272:m2()");}
}
class matt273 extends matt272 {
	void m2(){System.out.println("matt273:m2()");}   //有大括號就有實作了  紅字就消失了
}
abstract class matt274 extends matt273{
	void m3(){}   //抽象類別不作m2 先做m3 上面還是要寫抽象
	abstract void m4();  //抽象M4
}
abstract class matt275 { //無法建構出物件實體要透過子類別
	void m1(){}       //有抽象方法一定要宣告??
}