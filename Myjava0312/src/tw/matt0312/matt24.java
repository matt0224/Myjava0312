package tw.matt0312;

import javax.swing.JFrame;

public class matt24 extends JFrame{     //載入先才能執行Staic 
										
	 matt24(){							//前面如果要寫成是要寫publice
		 //super();       //super this存在的原因因為要叫出歷史的副類別
		 super("視窗程式");            //呼叫另一個建構式
		 //System.out.println("matt24()");
		 setSize(640,480);     //繼承致window  
		 setVisible(true);		//繼承致window
		 setDefaultCloseOperation(EXIT_ON_CLOSE);   //
	 }
	public static void main(String[] args) {//main方法是進入點
		 new matt24();   //需要一個matt24的類別物件但不要呼叫他 						
		                 //呼叫成JFrame

	}

}
