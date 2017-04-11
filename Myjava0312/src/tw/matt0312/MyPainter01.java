package tw.matt0312;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPainter01 extends JPanel{
	private int  x0,y0,x1,y1,x,y,h,w;  //丟入mymyMouseAdapter01 x0,y0由MyPainter01決定
   private mymyMouseAdapter01 myMouseAdapter;
public MyPainter01(){
	   setBackground(Color.yellow);
	   myMouseAdapter=new mymyMouseAdapter01(this);    //這邊空的會罵人把自己因為宣告自己是JPanel
	  addMouseListener(myMouseAdapter) ;   
	   x0=y0=x1=y1=-1;	 //把點弄掉
	   
   }
void setX0(int x0){this.x0=x0;};
void setY0(int y0){this.y0=y0;};    //這邊是有要用的屬性
//void setX1(int x1){this.x1=x1;};
//void setY1(int y1){this.y1=y1;}; //mouseReleased 有方法後就要實作這兩個 //裝碼表後改寫成下面
//int get(){this.x0=x0;};       //這邊是裝碼表 所以要有回傳值
//int get(){this.y0=y0;};
int getx0(){return x0;}; 

int getyo(){return y0;};
int getxx(){return x;};  
void setxx(int x){this.x=x;};
int getyy(){return y;};  //
void setyy(int y){this.y=y;};
int getww(){return w;};  
void setww(int w){this.w=w;};
int gethh(){return h;};
void sethh(int h){this.h=h;};
   @Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D)g; 
		g2d.setStroke(new BasicStroke(6));
		g2d.setColor(Color.RED);   
		//g.drawLine(0, 0, 200, 200);
		g2d.drawLine(x0, y0, x1, y1);  //這行給原本介面五個實作用的畫出直線
		//g2d.drawOval(0, 0, 100, 100);劃圓先測試
		//g2d.drawOval(x, y, w, h);劃圓用
		
	}
	void changeLine(int x1,int y1){
		
		//有修改的w=2*r,h=w   int x ,int y已經宣告在上面不用從副宣告
		this.x1=x1 ; this.y1=y1;
		int r= Math.abs(x0-this.x1); 
		w=2*r;
		h=w ;
		x=x0-r ;
		y=y0-r;//到這行原本從線到劃圓
		repaint();        // 把原本mousePressed方法搬來這邊改this
		
}
 class mymyMouseAdapter01 extends MouseAdapter{
	 private MyPainter01 painter;  // painter沒被建立 就算不知道 painter也沒差
	 public mymyMouseAdapter01(MyPainter01 painter) {
			this.painter=painter;
		}
	 @Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		painter.setX0(e.getX());
		painter.setY0(e.getY()); //
		//x0=e.getX();y0=e.getY(); //原本從這邊該由pointer  取代
	}
	 @Override
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
//		painter.setX1(e.getX());
//		painter.setY1(e.getY());   
//		//x0=e.getX();y0=e.getY(); 上面兩行取代這行 但後來改邏輯
		
		int x1=e.getX(), y1=e.getY(); //最後邏輯改成這樣
		x1=e.getX();y1=e.getY();//這段從原本五個實作摳的 
//		int r= Math.abs(x0-x1);   這邊的xo要裝碼表 要改成下面這行
		//int r= Math.abs(painter.x0()-x1);  裝碼表後
		
//		painter.setww(2*r);
//		painter.sethh(2*r); 這兩行取代原本這行
////		w=2*r; 
		
		
//		h=w ;     //這邊也需要set網上設計
//		painter.setxx(painter.x0()-r);取代下面這行
////		x=x0-r ;     //這四個都要寫方法跟上面裝碼表一樣
		
//		painter.setyy(painter.y0()-r);取代下面這行
//		y=y0-r;
		
		//painter.repaint(); 這行取代下面
		////repaint();
		painter.changeLine(x1, y1); //上面那行把得到的x y給上面就吐回去就好了 現在就是專心聽而已
	}
 }
}