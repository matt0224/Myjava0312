package tw.matt0312;

public class matt41 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = sb1;
		sb1.append("11111111111111111");
		System.out.println(sb1.capacity()); //智慧型累加容量 處理效能 檢查容量
		System.out.println(sb1.length());
		System.out.println(sb1==sb2); 
	}

}
