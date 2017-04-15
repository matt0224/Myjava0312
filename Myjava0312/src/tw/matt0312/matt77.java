package tw.matt0312;

public class matt77 {

	public static void main(String[] args) {
      matt771 obj1 = new matt771();
      obj1.setDaemon(true); //使用這個才不會繼續跑ok下面的東西 稱為背景中的執行緒所以生命跟著主序走 主序結束他也結束
      obj1.start();
      try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      System.out.println("OK");
     // return; //就算這邊用return還是會跑
	}

}
class matt771 extends Thread{ //可以拿來可以把任務做完 壽終正寢
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(i);
			try {
				Thread.sleep(100); //sleep不要拿來控制時間精準度
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}