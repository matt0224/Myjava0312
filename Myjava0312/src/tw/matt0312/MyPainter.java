package tw.matt0312;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;

public class MyPainter extends JPanel implements MouseListener {//component抽象 沒有抽象方法想表現出多行
	private int  x0,y0,x1,y1,x,y,h,w;
	public MyPainter(){
		setBackground(Color.DARK_GRAY);
		addMouseListener(this);            //找人聽聽一次所以從這邊建立 找到方法後再13行左手邊錯誤的地方會跑到
	           					   //MyPainter按ADD增加範例 下面就會實作overrride
		x0=y0=x1=y1=-1;	 //把點弄掉
		
	}
	
	@Override
		protected void paintComponent(Graphics g) { //拿到g物件
			// TODO Auto-generated method stub
			super.paintComponent(g);      //打回原形
			
			Graphics2D g2d=(Graphics2D)g; //從車子打回原形法拉利 //如果沒有法拉利會變成轉不過的例外
			g.setColor(Color.RED);    //畫線顏色
			//g.drawLine(0, 0, 200, 200);
			//g2d.drawLine(x0,y0, x1, y1); //這行是從轉型過來的
		//	System.out.println("");
			//g2d.drawLine(x0,y0, x1, y1);  //自訂現
			g2d.drawOval(x,y,w,h);
			System.out.println("paint");
		}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("Clicked");
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//System.out.println("Pressed"+e.getX()+"x"+e.getY()+"y");
		x0=e.getX();y0=e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x1=e.getX();y1=e.getY();
		int r= Math.abs(x0-x1); 
		w=2*r;
		h=w ;
		x=x0-r ;
		y=y0-r;
		// System.out.println("Released");
		 repaint();  //這邊在畫圖有生命週期方法都會被觸發 這邊應該要寫在周期性的東西 劃的時候就叫你來看
		
	}
}
