package tw.matt0312;

public class matt0312t1501 {

	public static void main(String[] args) {
		 
		int a = 1 ;
		int sum =0 ; //透過容器累加的概念
		while (a<=100){
			 System.out.println(a++);
			  sum +=a++;
		 }
		 System.out.println("1+2+...."+sum);
		 System.out.println("------");
		 
		 for( ;a<10;){
			 sum +=a++;
		 }
		 System.out.println("1+2+...."+sum);
	}

}
