package tw.matt0312;
/*
 * 正規表示法 matches;
 */
public class matt22 {

	public static void main(String[] args) {
		 String id = "A123456789";
		 System.out.println(id.matches("^$"));   //開頭要寫^尾巴要寫$  如^$代表空字串
		 System.out.println(id.matches("^A123456789$"));   //相等於aques
		 System.out.println(id.matches("^[A-Zxyz]123456789$")); //判斷第一字[A-Za-z]
		 System.out.println(id.matches("^[A-Zxyz][12]3456789$"));//判斷第二字[1或2]
		 System.out.println(id.matches("^[A-Zxyz][12][0-9]56789$"));//判斷第三字[0-9]
		 System.out.println(id.matches("^[A-Zxyz][12]{8}$"));  //前面那個東西出現8次
		 System.out.println(id.matches("^[A-Zxyz][12]{1,4}$"));  //前面那個東西出現4次
		 System.out.println(id.matches("^[A-Zxyz][12]{4,}$"));  //前面那個東西出現4次以上
		 System.out.println(id.matches("^[A-Zxyz][12]{0,4}$"));  //前面那個東西據理存在最多出現4次
		 System.out.println(id.matches("^[^A-Z]123456789$")); //反集合不要A-Z
	}

}
