package tw.matt0312;
/*
 * 這邊為介面   這邊主要介紹多行
 */
public class matt29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface matt291{   //介面是一個規格 沒有實作 怪物要具備五個功能   //全部的介面都是public
	void m1();    //這邊隱含public
	public void m2();    //這方法全部是抽象的
	//void m3(){}    這行實作 ,interface 沒有實作
	
}
class matt292 implements matt291{   //這邊表示要實作
	public void m1(){};   //上面的有影含 所以這邊要加上public
	public void m2(){};    //上面的有影含 所以這邊要加上public
	
}
abstract class matt293 implements matt291{   //這邊只有實作一個所以前面用抽象留給後代子孫作
	public void m1(){};   //上面的有影含 所以這邊要加上public

	
}