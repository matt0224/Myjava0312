package tw.matt0312;
// Exception 
public class matt44 {

	public static void main(String[] args) {
			int a =10 ,b=3;           // RuntimeException除了這個之外其他的就要try catch
			int[]c={1,2,3,4};
			try{
			System.out.println(a/b); //如果出狀況從這邊跳出 
		//	  try{ 這邊也可以做巢狀 這邊的   反正只有有被RuntimeException後面繼續
				System.out.println(c[4]);
			//}catch(ArithmeticException ae){   // 例外去api lang 茶室甚麼例外 ArithmeticException數學複製過來
			//		 System.out.println("87");  //如果發生數學例外產生物件實體開始處理
			}
			catch(ArrayIndexOutOfBoundsException ee){   // 可以是多重的從下面複製lang後面出現rrayIndexOutOfBoundsException
				 System.out.println("真87");  // catch先後無差別 //數學跟陣列捕捉沒直系關係不用再議順序
			}catch(RuntimeException re){
				System.out.println("ok");   //錯誤印出ok  //有繼承關係前面寫條件小的後面寫RuntimeException
			}                               //有繼承關係小的要先
			                                
			System.out.println("hello,");

	}

}
