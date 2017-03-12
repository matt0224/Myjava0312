package tw.matt0312;

import java.util.Arrays;

public class matt0312M1204form02 {
   //發四家的牌
	public static void main(String[] args) {
		  long start = System.currentTimeMillis();
		  boolean[] check = new boolean[52]; //0-51:false
		  int[] poker = new int[52];   //0-51 :開始是0 //拿13張牌
		  int temp; int counter = 0;
		  for(int i=0 ; i<52; i++){   
		    do{
				 temp = (int) (Math.random()*52);  // 先產生亂數 //這邊從52改成10 最好的方式是10次寫完
				counter++;
			  }while(check[temp]);  //檢查過了沒被使用過   如果是F不成立就要往下做  true要重作代表使用過了
			  
	
				 poker [i] = temp ;   //循序擺進temp陣列
				 check[temp]= true ;  //從本來f 變成真 
			//	//System.out.println(temp); 這邊就先註解掉
			 }
		  // 發牌>有四個玩家>每家13張
		   int[][]player = new int [4][13];
		   for(int i=0;i<poker.length;i++){
			   player[i%4][i/4]=poker[i];    //[]只能是整數 代表幾家 筆記本有算法
		   }
            System.out.println("----");
            //驗算第一家
           // for (int v : player[0]){
           //	System.out.println(v);
          ///}
           
            String[] suits={"黑桃","愛心","方塊","梅花",}; //攤玩牌在呈現花色 所以這邊是第二步驟 有陣列0123的 
                                                      //可利用陣列INDEX
            String[] values={"a","2","3","4","5","6","7","8","9","10","11","12","13"}; //0就是A
            for(int [] cards: player){       //for each這邊是四家攤牌 ,"各家是在cards" //一維整數鄭烈
            	//理牌
               Arrays.sort(cards);  //理完牌在秀出來  //秀牌
 			   for(int card:cards){     
 				   System.out.println(suits[card/13]+values[card%13]+" "); //第一個是花色,第二個是點數
 			   }
 			   System.out.println();
 		   }
            System.out.println("耗時"+(System.currentTimeMillis()-start));
            System.out.println("次數"+counter);
	}

}
