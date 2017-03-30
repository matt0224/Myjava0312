package tw.matt0312;

//安卓也常用內部類別 做出外部實體
public class test2{
	 
	public static void main(String[] args) {
		
	matt43e f=new matt4311().b;
	f.m1();
	
	}                                                  

}
class matt43e{
	 matt43e(){System.out.println("matt431()");}
	 void m1(){System.out.println("matt431:m1()");}
	 void m2(){System.out.println("matt431:m2()");}
	
	 
	 }
class matt4311 extends matt43e{
	matt43e b=new matt43e(){
	void m1(){System.out.println("hhh");}
	};	
}
