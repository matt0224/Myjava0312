package tw.matt0312;
/*
 * 強制轉型
 */
public class matt42 {

	public static void main(String[] args) {
		matt421 b1 = new matt422(); //我要車子你給我法拉利 呼叫作422的M1
		//matt422 b2 =b1; //這行這樣不行須強制轉型
		matt422 b2 =(matt422)b1;   //這邊就是強制轉型
		matt421 b3 =new matt423();  //第三台
		matt422 b4 = (matt422)b3;   //法拉利變成藍寶堅尼 沒抱錯錯在轉型因為在直系血親但骨子裡不是 但不可以 便會有出現例外處理
		//Bike b5 = new Bike();
		b2.m1();
		//matt422 b6 = (matt422)b5;  //腳踏車跟車沒關西
	}

}
class matt421{
	 void m1(){System.out.println("matt421:m1()");}    //一個m1方法
}
class matt422 extends matt421{
	void m1(){System.out.println("matt421:m1()");}     
	void m2(){System.out.println("matt421:m2()");}    //除了原本方法M!子類別要發揚光大多M2
}
class matt423 extends matt421{
	void m1(){System.out.println("matt42:m1()");}
	void m2(){System.out.println("matt423:m2()");}
	
	}