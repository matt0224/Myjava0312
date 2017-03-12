package tw.matt0312;

public class matt0312M1201 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();  //處理時間的秒速
		  int[] poker = new int[52] ; //0-51
		  boolean isRepeat  ;  int temp;               //do while 宣告   /12行複製  temp 宣告
		  for (int i=0 ; i<52 ; i++){
			do{
			   temp = (int) (Math.random()*52);   //檢查機制  是否有重複
			   isRepeat = false; 
			   for(int j=0; j<i;j++){           //檢查前面是否跟I重複
				  if (poker[j]==temp){
					  isRepeat = true;
					  break;        //這關如果沒過就是錯的 跳出
				  }
			 }
			  
			}while(isRepeat);                //沒有重複再輸出
				  poker[i] =temp;         
				 System.out.println(poker[i]);
			  
		 
		  }
           System.out.println("耗時"+(System.currentTimeMillis()-start));     //字串沒有做檢的 運算

	}

	
}
