package tw.matt0312;

import java.io.IOException;
import java.rmi.RemoteException;

public class matt46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class matt461 {
	void m1()  throws IOException {}
	
}
class matt462 extends matt461{
	void m1()  throws RemoteException {}  //發揚光大是丟出的例外比爸爸少  1.狀況一枚丟出RemoteException是子類別
	                                       //跟爸爸一樣  繼承是好處發揚 壞處縮小 如果要處理多的例外要自己增加方法
}