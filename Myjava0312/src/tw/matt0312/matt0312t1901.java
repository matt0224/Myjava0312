package tw.matt0312;

public class matt0312t1901 {

	public static void main(String[] args) {    ///主程式是被執行的要先建立腳踏車方法
		  Bike b1 = new Bike();  //沒抱錯的new就是具體存在
		  Bike b2 = new Bike();
		  System.out.println(b1);
		  System.out.println(b2);
		  System.out.println(b1.getSpeed());
		  b1.upSpeed();  //加速度
		  b1.upSpeed();
		  b1.upSpeed();
		  b1.upSpeed();
		 // int speed = 10;   因為不能隨便改速率
		  System.out.println(b1.getSpeed());
	}

}
