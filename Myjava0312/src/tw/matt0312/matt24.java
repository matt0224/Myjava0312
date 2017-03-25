//package tw.matt0312;
//
//import java.awt.BorderLayout;
//
//import java.awt.FlowLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class matt24 extends JFrame{     //載入先才能執行Staic 
//	private JButton open, save, exit; //這邊的屬性	是matt24所擁有的 has的概念								
//	private MyPainter myPainter;
//	 matt24(){							//前面如果要寫成是要寫publice
//		 //super();       //super this存在的原因因為要叫出歷史的副類別 建構式釋初始化的概念
//		
//		 super("視窗程式");            //呼叫另一個建構式
//		 //System.out.println("matt24()");
//		// setLayout(new FlowLayout(FlowLayout.LEFT));  //請一個室內設計師整理版面 
//		 setLayout(new BorderLayout());  
//		 
//		 
//		 open = new  JButton("open");
//		 save = new  JButton("save");   //宣告
//		 exit = new  JButton("exit");
//		 myPainter = new MyPainter();
//		 
//		  JPanel top = new JPanel(new FlowLayout());
//		  top.add(open);top.add(save);top.add(exit); //這邊為止沒關西
//		
//		  add(top, BorderLayout.NORTH);  //這邊JPanel正式BorderLayout連結
//		  add(myPainter,BorderLayout.CENTER);
//	
////		// add(open);add(save);add(exit); //丟進去
////		 add(open,BorderLayout.NORTH);
////		 add(save,BorderLayout.WEST);
////		 add(exit,BorderLayout.CENTER);
//		 
//		 setSize(640,480);     //繼承致window  
//		 setVisible(true);		//繼承致window
//		 setDefaultCloseOperation(EXIT_ON_CLOSE);   //
//	 }
//	public static void main(String[] args) {//main方法是進入點
//		 new matt24();   //需要一個matt24的類別物件但不要呼叫他 						
//		                 //呼叫成JFrame
//
//	}
//
//}
