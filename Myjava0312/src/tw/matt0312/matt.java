package tw.matt0312;

public class matt {
	int a ;
	static int b;
	{                        
				 a=100;
	             System.out.println("{}:a=");          //程式區塊早就有物件了並非建構式才有   		                      		
	              
	}
	static {
		System.out.println("static{}");
	}
	matt(){                     //與類別大小嚴格區分
		System.out.println("matt()");
	}
}
