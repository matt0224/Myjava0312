package tw.matt0312;
/*
 *  字串很重要    String 視為物件 offet偏移量 
 */
public class matt0312t1601 {

	public static void main(String[] args) {
		 String s1 =new String();
		 byte[] b1={97,98,99,100,101,102}; //屬ABCDEF 屬到C
		 String s2 = new String(b1);
		 
		 String s3 = new String(b1,2,4); //參考api(偏移量2,字元長度(總共4個))
		 
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 
		 String s4 = "abcdef" ;   //重要:任何雙影號包起來皆是物件實體,自動在記憶體NEW出一個物件
		 
		 char c1 = s2.charAt(3);   //s2要是物件才能呼叫
         System.out.println(c1);    //字串就是字元陣列就是字元 所以從0開始數
         System.out.println("abcdef".charAt(3));  //呼叫字元
	}

}
