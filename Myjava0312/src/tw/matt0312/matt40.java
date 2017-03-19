package tw.matt0312;
/*
 * 字串 這邊可能可以用支票
 */
public class matt40 {

	public static void main(String[] args) {
		 String s1 = "matt";
		 String s2 = s1;
		 s1= "hello";   //不要隨便亂指向 這樣會造成浪費記憶體
		 System.out.println(s1=s2);
		 System.out.println("----");
		 String s3= "matt";
		 System.out.println(s3.concat("12345678"));//輸出的有增加
		 System.out.println(s3); // 但原本字元沒增加
		 System.out.println(s3.replace('a', 'A'));
		 System.out.println(s3);
	}

}
