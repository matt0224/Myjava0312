package tw.matt0312;
 // https://libgdx.badlogicgames.com/  介紹
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;
                                //""""java只能任一個爸爸要用MouseListener只能考五張證照"""
public class MyPainter extends JPanel implements MouseListener {//component抽象 沒有抽象方法想表現出多行
	private int  x0,y0,x1,y1,x,y,h,w;            //implements MouseListener案左邊直接實作
	private MyMouseAdapter myMouseAdapter;
	public MyPainter(){
		setBackground(Color.DARK_GRAY);
		//addMouseListener(this);//表示在這邊        //找人聽 聽一次所以從這邊建立 找到方法後再13行左手邊錯誤的地方會跑到
		    		//this跑到右上的   //MyPainter按ADD增加範例 下面就會實作overrride 設置完了之後在馬調去跑
		myMouseAdapter=new MyMouseAdapter(this);      //new1個物件進來在把它裝到下一行
		addMouseListener(myMouseAdapter) ;       //兩行都會聽到
		x0=y0=x1=y1=-1;	 //把點弄掉
		
	}
	void setX0(int x0){this.x0=x0;};
	void setY0(int y0){this.y0=y0;};    //這邊是有要用的屬性
	void setX1(int x1){this.x1=x1;};
	void setY1(int y1){this.y1=y1;};
//	int get(int x1){this.x0=x0;};       //這邊是裝碼表 所以要有回傳值
//	int get(int y1){this.y0=y0;};
//	int get(){this.x0=x0;};       //這邊是裝碼表 所以要有回傳值
//	int get(){this.y0=y0;};
	@Override
		protected void paintComponent(Graphics g) { //拿到g物件   //paintcome直接出現Component
			// TODO Auto-generated method stub
			super.paintComponent(g);      //打回原形
			
			Graphics2D g2d=(Graphics2D)g; //從車子打回原形法拉利 //如果沒有法拉利會變成轉不過的例外
			
			g2d.setColor(Color.RED);    //畫線顏色
		
			//g.drawLine(0, 0, 200, 200);
			//g2d.drawLine(x0,y0, x1, y1); //這行是從轉型過來的
		//	System.out.println("");
			//g2d.drawLine(x0,y0, x1, y1);  //自訂現
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
class MyMouseAdapter extends MouseAdapter{ //這個類別設計出來只能跟 MyPainter painter搭配用
	                                       //一般寫類別要共用 這邊的觀念是物件跟物件之間如何傳遞 但把類別做小了
	private MyPainter painter;  //只是要認識painter沒有要NEW出
	 public MyMouseAdapter(MyPainter painter) {
		this.painter=painter;
	}
	  @Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		painter.setX0(e.getX());
		painter.setY0(e.getY());   //上面這邊有可以使用回告
		//x0=e.getX();y0=e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {  //我專心聽到事件把事件的值回報給裡面
		super.mouseReleased(e);
		int x1=e.getX(), y1=e.getY();
		painter.changeLine(x1, y1); //這行表示專心聽到並傳值回changeLine
		//painter.setX1(x1);
		//painter.setY1(y1);
		painter.repaint();
	}
}
