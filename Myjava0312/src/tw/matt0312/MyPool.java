package tw.matt0312;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPool extends JPanel{
	private Ball ball;
	private Timer timer;
	private int viewW,viewH,dx,dy;
    private LinkedList<Ball> balls;
	public MyPool(){
		timer=new Timer();
		timer.schedule(new ViewTask(),0, 60 );//更新的坪綠
		balls= new LinkedList<>();
		//ball=new Ball(10,10); 這邊是一例球的年代
		//dx=dy=10; 為了取代不一樣的撞牆 不再只有一個
		timer.schedule(ball, 1000,60);//fps0.06形成動畫
				
	}
	private class MymouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) { //點按下去求 被產生了
			  Ball ball =new Ball(e.getX(),e.getY()) ;             //你點哪裡我出現在哪裡
			  balls.add(ball);
			 // timer.schedule(ball, 1000,60);
			  timer.schedule(null, 1000,30+(int)(Math.random()*30));
		}
	}
	private class ViewTask extends TimerTask{
		@Override
		public void run() {
			repaint();
			
		}
	}
	@Override
	protected void paintComponent(Graphics g) { //畫面寬跟高
		Graphics2D g2d =(Graphics2D)g;
		
		viewW=getWidth(); viewH=getHeight();
		g2d.setColor(Color.black);
		//g2d.fillRect(0, 0,640, 480);
		g2d.setColor(Color.YELLOW);
		g2d.fillOval(ball.x, ball.y,40, 40);
		for(Ball ball:balls){
			g2d.fillOval(ball.x, ball.y, 40, 40);
		}
		
	}
	private  class Ball extends TimerTask{
        int x,y;
        Ball(int x,int y){this.x=x; this.y=y;this.y=y;dx=dy=10;
        	
        }
		@Override
		public void run() {
			if(x<0 || x+40>viewW){//上面牆壁
				dx *=-1;
			}
			if(y<0 || y+40>viewW){//下面牆壁
				dy *=-1;
			}
			x +=dx;
				y +=dy;
		//	x+=10;
		//	y+=10;
			//repaint(); 移動不要叫我看 眼睛固定平率是依樣的
		}
		
	}
}
 