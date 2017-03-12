package tw.matt0312;

public class matt0312t1801 {

	public static void main(String[] args) {
		  String a = new String("abc");
		  String b = new String("abc");
          String c = "abc";
          String d = "abc";              //c跟d是一樣的
          String e = a ;         //兩者指向同一個位置 a改變e跟著改變  所以e==a
		  System.out.println(a==b); //物件比物件比較的是 是否為相同物件
		  System.out.println(a.equals(b));   //比較字串""""內容是否一樣"""用equals比較
	}

}
