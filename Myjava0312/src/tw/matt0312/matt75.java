package tw.matt0312;

public class matt75 {

	public static void main(String[] args) {
		Mytherad mt1 = new Mytherad("a");
		Mytherad mt2 = new Mytherad("b");		
		mt1.start();//同時進行的兩個 執行緒
		mt2.start();
		try {
			Thread.sleep(400); //這main的主方法的執行續讓他睡0.4秒在印下面hello大概在第4~5個
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//範例1		mt1.run();//
//		mt1.start();//這邊呼叫表示生命特徵 看到start不是馬上開始 //不能兩個start生命只有一次
//		mt1.run(); //可以把方法叫出來跟上面比較,就算生命週期結束但物件方法(身體還在)所以可以物件方法可用
		System.out.println("hello");
		try {
			Thread.sleep(10*1000); //這main的主方法的執行續讓他睡0.4秒在印下面hello大概在第4~5個
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();       
	}
         mt1.run();
}
}
class Mytherad extends Thread{  //生命只有一條
	private String name;
	public Mytherad(String name) {this.name=name;}

	@Override
	public void run() { //生命週期表現在這個方法
		for(int i=0;i<10;i++){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100); //去睡覺 睡覺有例外做出來
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


