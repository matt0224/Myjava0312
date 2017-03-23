package tw.matt0312;
//回傳到21執行
public class TWid {   //這是一個類別
	
	static String letters="ABCDEFGHJKLMNPQRSTUVXYWZIO"; //從20行拉到第四行家static不屬於物件
	
	// TWid(String myid){
	//	id=myid;     
	// }  
	 
	   //""第一道敘述句不是spuer 就是this""
	                                   //建構式發揚光大
	 TWid(){                                 //參數列 型別 不會造成混淆   //表示隨機
		 //super     第一道敘述句只能用一次因為已經放在第22行了 不要再整理成
		 //boolean = X   不要再整理成 
		 //this(X)       不要再整理成 用下面的            //第一道敘述句 不是this 不是就是super這邊會往下叫
		 this((int)(Math.random()*2)==0);   //男生不是0就是118行f0和19行f1隨機 其他跟18行一樣
	 }
	 TWid(boolean isFemale){                //這四招都是要滿足check ok
		 this(isFemale, ((int)(Math.random()*26))); //指定男生女生其他亂數
	 }								 //第一道敘述句 不是this 不是就是super這邊會往下叫
	 TWid(int area){                
			 this((int)((Math.random()*2))==0,area);   //進去之後傳給area
	 } 								 //第一道敘述句 不是this 不是就是super這邊會往下叫
	 TWid(boolean isFemale,int area){  
		  //沒寫就是super():  //super到父類別 如果是沒有的話 上面跑玩到obj這樣才會在記憶體才能呼叫
		 
		   char f0=letters.charAt(area); //這邊是物件 物件可以呼叫static 因為已經載入了 但是static沒有物件實體所以無法呼叫
		   char f1=isFemale?'2':'1';
		   StringBuffer sb =new  StringBuffer("" +f0+f1);//String temp="" +f0+f1;  //斥串加其他型別等於字串
		   for(int i=0;i<7;i++){
			   sb.append((int)(Math.random()*10));
			//以上行數表示轉型再執行其他行數,有1,2就亂數 有2,1就亂數		  
		   }
		   for(int i=0;i<10;i++){        //這邊插座後一碼
			   if(ischeckOK(sb.toString()+i)){id=sb.append(i).toString()+i;break;}
			 //  if(ischeckOK(temp+i)){; //前面9個加檢查碼隨便數字加最後一個數字 10個裡面拿去
			 //  id=temp+i;     //如果檢查OK後離開
			 //  break;
			   }
		   }
	 
	 TWid(String id){								//這邊屬於建構式,人家傳遞近來叫myid
		 this.id=id;							          //如果人家傳遞進來也較id 用this區隔 寶寶的id
	 }  
	 private String id;                    //這是屬性的部分要小寫,身分證不被改 所以要封裝
		// TWid(String myid){
		//	id=myid;
		// }  
	                                                   // this.id是private String id
	   //true >female ; false>male
	  boolean isfemale(){						//宣告必須布林的傳回
		  char gender = id.charAt(1); // A123456789 =>1
		  return gender=='2';       //女生第二碼為二傳回去
	  }//
	  
	  static boolean ischeckOK(String id){  //同一種特性 不需要物件給我一個字串阿!! 先隨便做一個舉證不罵我
		   if(!id.matches("^[A-Z][12][0-9]{8}$")) return false; //正規表示 //需要吻合此條件在往下判斷 無判斷會出現錯誤傳回False
		   //依照身分證網站數字順序 基本數值是加10 A=11 
		  char f0= id.charAt(0);
		  int n12 = letters.indexOf(f0)+10;  //'Y'=>21+10=31
		  int n1=n12 / 10;
		  
		  int n2 = n12 % 10;
		  int n3 =Integer.parseInt(id.substring(1,2));   //抽出來的字串(12345)轉成(int)
		  int n4 =Integer.parseInt(id.substring(2,3)); 
		  int n5 =Integer.parseInt(id.substring(3,4)); 
		  int n6 =Integer.parseInt(id.substring(4,5)); 
		  int n7 =Integer.parseInt(id.substring(5,6)); 
		  int n8 =Integer.parseInt(id.substring(6,7)); 
		  int n9 =Integer.parseInt(id.substring(7,8)); 
		  int n10 =Integer.parseInt(id.substring(8,9)); 
		  int n11 =Integer.parseInt(id.substring(9,10)); 
		  int sum=n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1;
		  
	      return sum%10==0;
	  }
//	  static boolean preCheck(String id){ 
//		   //長度10    
//		  //charAt(0)=>A-Z
//		  //other =>0-9
//		  boolean result=true;
//		  if(id.length()!=10){
//		  result=false;
//		  }else{
//			  if(letters.indexOf(id.charAt(0))==-1)
//					  result=false;  //告訴你第幾個位置 找不到-1會傳回
//		  }
//		  return result;
//	  }
	 String getId(){					//可以看到id但不能改
		 return id;
	 }
}
