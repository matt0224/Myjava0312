package tw.matt0312;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel{
private Timer timer;
private int i;
   public MyClock(){
	   timer=new Timer();
	   timer.schedule(new MyColckTask(), 0,1000); //間隔一秒秀一下 馬上作下面方法
   }
   private class MyColckTask extends TimerTask{
	   @Override
	public void run() {
		   Calendar now =Calendar.getInstance(); //因為保護且抽象類別 雇用static
		   int hh=now.get(Calendar.HOUR_OF_DAY);
		   int mm=now.get(Calendar.MINUTE);
		   int ss=now.get(Calendar.SECOND);
		   setText(hh+":"+mm+":"+ss); //時間到顯示現在時間
		                                   //作業是時鐘
	}
   }
}
