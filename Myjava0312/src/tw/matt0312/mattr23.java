package tw.matt0312;

public class mattr23 {

	public static void main(String[] args) {
		 Bike b1 = new Bike();
		 Scoter s1 = new Scoter();     //如果都沒講的話但是只有唯一 用父類別的吳傳回建構式去跑,不能用其他的
		 s1.upSpeed();
		 s1.upSpeed();
		 s1.upSpeed();
		 s1.downSpeed();
		 System.out.println(s1.getSpeed());
	}

}
