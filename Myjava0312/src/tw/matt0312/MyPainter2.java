package tw.matt0312;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;
/*
 * 內部類別   //這邊寫成內部類別 方便存取的屬性  公司裡面成立小公司
 */

public class MyPainter2 extends JPanel implements MouseListener {//component抽象 沒有抽象方法想表現出多行
	private int  x0,y0,x1,y1,x,y,h,w;            //implements MouseListener案左邊直接實作
	
	public MyPainter(){
		setBackground(Color.DARK_GRAY);
		addMouseListener(new MyMouseAdapterV3()) ;       //兩行都會聽到
		x0=y0=x1=y1=-1;	 //把點弄掉
		
	}
	
	
	@Override
		protected void paintComponent(Graphics g) { //拿到g物件   //paintcome直接出現Component
			// TODO Auto-generated method stub
			super.paintComponent(g);      //打回原形
			
			Graphics2D g2d=(Graphics2D)g; //從車子打回原形法拉利 //如果沒有法拉利會變成轉不過的例外
			
			g2d.setColor(Color.RED);    //畫線顏色
	
			g2d.drawOval(x,y,w,h);
			System.out.println("paint");
		}
	void changeLine(int x1,int y1){
		this.x1=x1 ; this.y1=y1;
		int r= Math.abs(x0-this.x1); 
		w=2*r;
		h=w ;
		x=x0-r ;
		y=y0-r;
	}
	
	 private  class MyMouseAdapterV3 extends MouseAdapter{ //沒有要對外要寫private 存取有4個其他一樣
		 @Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			 x0=e.getX();y0=e.getY();
		}
		 @Override
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(e);
				x1=e.getX();y1=e.getY();
				int r= Math.abs(x0-x1); 
				w=2*r;
				h=w ;
				x=x0-r ;
				y=y0-r;
				repaint();
			}
}
	
}