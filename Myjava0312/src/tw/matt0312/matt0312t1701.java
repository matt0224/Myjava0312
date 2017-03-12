package tw.matt0312;
//猜數字未完成在17張回家看老師
import javax.swing.JOptionPane;

public class matt0312t1701 {
		 static String createAnswer(int d){   //""一開始"""有宣告沒回傳   public跟static都是方法
			 boolean[] check = new boolean[10]; //0-10:false 三張牌洗三張
			  int[] poker = new int[d];   //0-51 :開始是0 //三張牌洗三張 ""這邊可寫產生幾碼
			  int temp; int counter=0;
			  for(int i=0 ; i<poker.length; i++){  //所以迴圈要跟洗牌一起  //陣列在建立同時維度確定 對他來說是屬性值
				  
				do{
					 temp = (int) (Math.random()*10);  // 先產生亂數 //這邊從52改成10 最好的方式是10次寫完
					counter++;
				}while(check[temp]);  //檢查過了沒被使用過   如果是F不成立就要往下做  true要重作代表使用過了
				  
		
					 poker [i] = temp ;   //循序擺進temp陣列
					 check[temp]= true ;  //從本來f 變成真 
				 }
			  String ret="";  //做一個答案出來 隨便的答案 return "742
			  for(int v:poker) ret +=v;  //抽出第一張第二章第三張 後面再return出來
	           return ret  ;              //再改成字串+字元=字串""+ poker [0]+poker [1]+poker [2];
	}
	public static void main(String[] args) {
		  //1.Create answer
		   String answer = createAnswer(3);
		   System.out.println(answer);
		  //2.開始玩
		   boolean isWinner = false ;               //一開始不是贏家
		   for(int i=0 ; i<10;i++){
			   
		   
		  //2.1 input a number string
			   String guess = JOptionPane.showInputDialog("猜一個數字") ;  //這邊體目就是字串
			  
			   
          //2.2 compare string =>result
			   String result = checkAB(answer,guess);  //開始寫方法
			   JOptionPane.showMessageDialog(null,result);
			   if(result.equals("3A0B")){      
				   isWinner = true;
				   break;
			   }
		  //2.3 winner  =>break 贏脫離
			   
		  //2.4 repeat 10times = >loser
	}
		  //3. show   //show出答案
		   
		   System.out.println("恭喜答對");
	}
	
	 // metjod:cheakAB(answer,guess)=>?a?b   自己製作辦法     // 這邊要回傳到第33行
		  static String checkAB(String a, String g){
			  int A,B ; A= B = 0 ;
			  for(int i=0; i<g.length();i++){      //這邊是呼叫方法 方法是執行才會做的 
				  									//屬性是一個值 EX男生,身高  
				   									//方法會影響到屬性
				  if(g.charAt(i)==a.charAt(i)){      //g中的第i碼==a中的第i  API JAVA.LANG string找
					  A++;
				  }else if(a.indexOf(g.charAt(i))!=-1){       //g中的第i碼 是否存在於A中 api不對傳回-1
					  B++;									 //條件 不等於-1 >=0
				  }
			  }
			  return A+"A"+B+"B";   //幾 A 加 幾 B
			//測試用 
			//  String d = "abcde" ;
			 // System.out.println(a.indexOf(''));
		  }
	     
	
     // static String createAnswer(){   //""一開始"""有宣告沒回傳   public跟static都是方法
    	                            //做一個答案出來
    	  
    	// return "742";               //
    //  }
		 
		  
		  
		  
}
      
