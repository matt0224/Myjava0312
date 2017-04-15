package tw.matt0312;

import javax.print.DocFlavor.STRING;

public class matt76 {

	public static void main(String[] args) {
//		Thread2 t2 =new Thread2();
//		Thread tt =new Thread(t2); //把t2丟進去
//		tt.start();
		Thread2 t2 =new Thread2("A");
		Thread tt2 =new Thread(t2);
		Thread2 t3 =new Thread2("B");
		Thread tt3 =new Thread(t3);
		tt2.start();
		tt3.start();
		
	}

}

class Thread2 implements Runnable{ //目前Thread2還不是執行緒
	String name;
	Thread2(String name){
		this.name=name;}
	@Override
	public void run() {		//這邊run方法要實現出來
		for(int i=0;i<10;i++){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} 
}
class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
}
//class Thread2 implements Runnable{ //目前Thread2還不是執行緒
//	@Override
//	public void run() {		//這邊run方法要實現出來
//		for(int i=0;i<10;i++){
//			System.out.println(i);
//		}
//	} 
//}