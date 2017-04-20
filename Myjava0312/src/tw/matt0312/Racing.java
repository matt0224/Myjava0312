package tw.matt0312;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Racing extends JFrame {
	private JButton go, stop;
	private JLabel[] lanes=new JLabel[8]; //宣告為物件型別 內部為空 //一開始先寫一個跑道
	
	private Car[] cars =new Car[8]; //這也是Null
	private int rank ;
	private boolean isRunning;
	public Racing(){
		super("Racing Game");
		setLayout(new GridLayout(lanes.length+2, 1)); //兩列 //改版面 //增加按鈕也是從這邊
		//setLayout(new GridLayout(2, 1));     //再加一顆按鈕變成兩顆
		go=new JButton("go"); add(go);
		//lane = new JLabel("1");
		//測試是否有八個跑道把下面報錯先註解掉
		//for(int i=0;i<lanes.lenght;i++){
	//JLabel lane=new JLabel((i+1)+".");}
		stop=new JButton("stop"); add(stop);
		for(int i=0;i<lanes.length;i++){
		JLabel lane= new JLabel((i+1)+".");
		lanes[i]=lane; //作陣列
		add(lane); //作畫面
		}		
		
		go.addActionListener(new ActionListener() {  //go是new出來的一般方法存取外面屬性方法
			                                           //new ActionListener()內部類別存取外面屬性方法
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		stop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				stopGame();
				
			}
		});
		
		
		setSize(800,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void go(){
		if(!isRunning){ //透過這邊讓速度無法累加 還沒到下面所以不會按
		isRunning =true;
		
		rank =1;
		for(int i=0;i<lanes.length;i++){
			lanes[i].setText((i+1) + ". "); //清畫面 //不要用作新的跑道
		}
	
		for(int i=0;i<cars.length;i++){  //作新的車
	      cars[i]=new Car(i);
		}
		for(int i=0;i<cars.length;i++){
			                   //Car car1=new Car();
		cars[i].start();      //cars1.start(); 啟動生命週期
		}
		}                          
	}                         
	
	private void stopGame(){   
		//cars[3].interrupt();  //car[3]是執行緒了這邊呼叫interrupt
		for(Car car:cars){ //改成只有第一名才顯示
			car.interrupt();
			
		}
		isRunning=false;
	}
	private class Car extends Thread{ //內部類別 
		private int lane;    
		public Car(int lane) {this.lane=lane;} //這邊決定 哪一條跑道
		@Override
		public void run() {  //從這邊開始表現生命
			//boolean isRunning =true;
			for(int i=0;i<100;i++){ //重複做一件事
				lanes[lane].setText(lanes[lane].getText()+">");//自己的56是老師53 //append自己寫 這邊是內部類別方便存取外部類別屬性方法
				//for(int i=0;i<100;i++){ //一開始只有這兩行而已
				//lanes[lane].setText(lanes[lane].getText()+">");
				try {
					Thread.sleep(10+(int)(Math.random()*200)); //改速度這邊 10~10+199
				} catch (InterruptedException e) {					// TODO Auto-generated catch block
					//System.out.println(lane+"OK"); //上面例外拋出來跑到這邊
					//isRunning=false;
					//break;
					return; //整個方法結束叫return
				}
			}
		//	if(isRunning){
				//lanes[lane].setText(lanes[lane].getText()+rank++); //生命週期後++可表明次
			lanes[lane].setText(lanes[lane].getText()+"==>winner");
			stopGame();                               //rank++
		//	}
				                            //作業是81行印出"==> winner" 第一名其他不跑
			}
		}//這邊就結束生命
		
	

	public static void main(String[] args) {
	    new Racing();

	}

}

