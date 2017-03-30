package tw.matt0312;
   //安卓也常用內部類別 做出外部實體
public class matt43 {
	 
	public static void main(String[] args) {
		matt431 obj1 = new matt431();
       // obj1.m1();
        matt431.matt4311 obj2= obj1 .new matt4311(); //物件類別同級的物件再呼叫出來
        obj2.m1();  //要有裡面的物件才能呼叫M1方法
        matt431.m3();
        matt431.matt4312 obj3 = new matt431.matt4312();  //static的物件實體 這招不需要
	}                                                    //內部類別做出來 431的物件實體

}
class matt431{
	 matt431(){System.out.println("matt431()");}
	 void m1(){System.out.println("matt431:m1()");}
	 void m2(){System.out.println("matt431:m2()");}
	 static void m3(){};
	 class matt4311{
		 matt4311(){System.out.println("matt4311()");}
		 void m1(){System.out.println("matt4311:()m1");
		 matt431.this.m1();   //講的是外部的m1方法
		 }
	 
	 }

  static class matt4312{
	 matt4312(){System.out.println("matt4312()");}
	 void m1(){System.out.println("matt4312:()m1");
	 }
}
}


