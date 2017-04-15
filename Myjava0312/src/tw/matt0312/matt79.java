package tw.matt0312;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class matt79  extends JFrame{
	private MyPool myPool;
	private MyClock myClock;
  matt79(){
	  setLayout(new BorderLayout());
	  myClock =new MyClock();
	  add(myClock,BorderLayout.NORTH);
	  
	  myPool=new MyPool();
	  add(myPool,BorderLayout.CENTER);
	  
	   setSize(640,800);
	   setVisible(true);
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
	public static void main(String[] args) {
		new matt79();

	}

}
