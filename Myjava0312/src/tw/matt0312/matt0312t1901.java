package tw.matt0312;

public class matt0312t1901 {

	public static void main(String[] args) {    ///主程式是被執行的要先建立腳踏車方法
		  Bike b1 = new Bike();  //沒抱錯的new就是具體存在  3/18開始:這邊稱建構式 叫完就不會用了 //b1的初始在bike
		                         //(程式想法括號空白使用預設值)
		  System.out.println(b1.b);  //b1.a a=1  跑完程式後 a屬於物件的屬性//  b1.b a=1
		  Bike b2 = new Bike();  //回摳到bike (程式想法括號想用客戶的速度所以改bike裡面)	
		  System.out.println(b2.b);  //b2.a b=1 跑完程式後//   b2.b b=2 //因為.b不需要物件也不跟物件有關係
		                                                            //.b是satic有計數器的概念
		  															//比較少人用物件概念呼叫計數器
		//  System.out.println(Bike.b);					//所以B可以用Bike.b呼叫出
		  
//		  System.out.println(b1);
//		  System.out.println(b2);
//		  System.out.println(b1.getSpeed());
		  System.out.println(b1.getSpeed());
		  System.out.println(b2.getSpeed());
//	  b1.upSpeed();  //加速度
		  b1.upSpeed();
		  b1.upSpeed();
		  b1.upSpeed();
		  b2.upSpeed();
		  b2.upSpeed();
		  b2.upSpeed();
		  b2.upSpeed(1);
		  b2.upSpeed(2);
//		 // int speed = 10;   因為不能隨便改速率
//		  System.out.println(b1.getSpeed());
		  System.out.println(b1.getSpeed());
		  System.out.println(b2.getSpeed());
		  
	}

}
