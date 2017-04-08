package tw.matt0312;

public class matt53 {

	public static void main(String[] args) {
		//ma("brad");
		ma1("brad","Peter","Andy");
		//ma2(new String[]{"brad","Peter","Andy"}); //ma2一定要這樣宣告
         ma02(3,"a","b"); //固定參數要寫前面不定的寫後面
	}
//   static void ma(String name){     //如果參數很明確會先跑宣告各數明確的
//	   System.out.println("Ya,"+name);
//   }
//   static void ma(String name1,String name2){
//	   System.out.println("Ya,"+name1);
//	   System.out.println("Ya,"+name2);
//   }
   static void ma1(String... names){  //...=>(不定個數有幾個都可以傳遞近來)//傳遞沒有也可以
	   //nemes =>String[]=>{"brad","Peter"} //
	   for(String name:names){     //尋訪的是names陣列但取出的是name
	   System.out.println("OK"+name);
	   }
   }
   
//   static void ma2(String[] names){
//	   for(String name:names){     //與上面不定數執行結果一樣 差別在宣告的差別
//		   System.out.println("OK"+name);
//		   } 
//   }
   static void ma01(String name1,String... names){  //這邊的語法是至少一定有一個傳遞
	   for(String name:names){     //尋訪的是names陣列但取出的是name
	   System.out.println("OK"+name);
}
   }
    static void ma02(int name1,String... names){  //這邊的語法是至少一定有一個傳遞
		   for(String name:names){     //尋訪的是names陣列但取出的是name
		   System.out.println("OK"+name);
	}
		                                     //1.確定的例如int 特定的要在前面
   }										//2.不定各數只能用一個傳遞各數不能多個	
   }
