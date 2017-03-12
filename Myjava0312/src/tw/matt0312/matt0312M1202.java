package tw.matt0312;

public class matt0312M1202 {

	public static void main(String[] args) {
		  long start = System.currentTimeMillis();
		     //開始洗牌
		  boolean[] check = new boolean[52]; //0-51:false
		  int[] poker = new int[10];   //0-51 :開始是0 //這邊從51改成10
		  int temp; int counter=0;
		  for(int i=0 ; i<52; i++){   
			do{
				 temp = (int) (Math.random()*10);  // 先產生亂數 //這邊從52改成10 最好的方式是10次寫完
				counter++;
			}while(check[temp]);  //檢查過了沒被使用過   如果是F不成立就要往下做  true要重作代表使用過了
			  
	
				 poker [i] = temp ;   //循序擺進temp陣列
				 check[temp]= true ;  //從本來f 變成真 
			 }
		  System.out.println("耗時"+(System.currentTimeMillis()-start));
		 System.out.println("次數"+counter);

	}

}
