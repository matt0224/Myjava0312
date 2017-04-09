package tw.matt0312;

public class matt70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface matt701{  //父介面
	public void m1();
}
interface matt702 { //父介面
	public void m2();
}
interface matt703 extends matt701{ //介面永遠沒有實作所以沒有implnemt 但有繼承  //子界面
	public void m3(); //除了爸爸還有自己的方法都要時作
	public void m1(); //跟701宣告是一樣但沒有實作 以實作為主 //void改成int 寫完方法M1跟爸爸一樣所以會報錯
	public void m1(int a);//這邊是overload //而這邊變數為int是有意義的所已不抱錯
}
interface matt704 extends matt701,matt702{ //介面可以2個 類別只能有一個爸爸
	public void m3();
}
class matt705 implements matt703{  
	public void m1(){}
	public void m3(){}
	public void m1(int a){}
}
class matt706 implements matt704{
	public void m1(){}
	public void m2(){}
	public void m3(){}
}
class matt707 extends matt705{
	public void m1() {}             //基本型別都一樣 物件型別要有is a概念
}
