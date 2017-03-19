package tw.matt0312;

public class matt28 {

	public static void main(String[] args) {
		

	}

}
class matt281{
	// void m1(){return new matt283();}    //原本存取修飾字是沒有 改成protected 這邊在改成private但這邊變成私人的下面變成另外一個新的父不讓子看
	String m2(){return "";}
	matt283 m1(){return new matt283();}
}
class matt282 extends matt281{
	//void m1(){}           //這邊如果要改寫的話傳 回值基本型別 void要一樣void m1(){} 上面是protected要改更大
	//int m1(){return:1}
	//void m1(){return new matt284();}
	matt284 m1(){return new matt284();}         //基本型別可以一樣 物件型別要比老爸強
}
///////這邊跟上面沒關西
class matt283 {
	
}
class matt284 extends matt283{
	
}