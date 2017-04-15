package tw.matt0312;

import java.sql.Time;
import java.util.Timer; //這邊的Timer
import java.util.TimerTask;

public class matt78 {
    private static Timer timer;
	public static void main(String[] args) {
		  timer =new Timer();
		 timer.schedule(new MyTask("A"), 1000,500); //3秒印後來1秒印 無法停止
		 timer.schedule(new MyTask("B"), 1800,300);
		timer.schedule(new StopJava(timer), 10*1000);
	  
		 System.out.println("main");//main 先出來3秒印ok
	}
    private static class MyStop extends TimerTask{  //從private改成static
    	
    	@Override
    	public void run() {
    	  timer.cancel();
    		
    	}
    }
}
class MyTask extends TimerTask{ 
	private String name;
	private int i;
	public MyTask(String name) {this.name=name;
	}
	@Override
	public void run() {//這件事情叫做印OK
		System.out.println(name+":"+i++);
	}
}
class  StopJava extends TimerTask{
	private Timer timer;
	public StopJava(Timer timer) {this.timer=timer;
	
	}
	@Override
	public void run() {
    timer.cancel();
	}
}