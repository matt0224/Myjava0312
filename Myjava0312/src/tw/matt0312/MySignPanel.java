package tw.matt0312;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MySignPanel extends JPanel {                     //line
	private LinkedList <LinkedList<HashMap<String, Integer>>> lines, recyle;  //原本一條線 包起來代表很多條線
	         
	//以上是資料結構                                                //作一個回收桶
	//<LinkedList<HashMap<String, Integer>> lines;這樣叫做一條線
	                        //k,v
    public MySignPanel(){
    	
    	setBackground(Color.YELLOW);
    	MyMouseListener listener= new MyMouseListener();
    	addMouseListener(listener);   //需要用到這兩個方法,但需要時作
    	addMouseMotionListener(listener);//需要用到這兩個方法,但需要時作
    	
    	//line=new LinkedList<>(); //先new 出來 看是否為一條線
    	lines=new LinkedList<>(); //先new 出來 看是否為一條線 //圖案在這邊建構
    	recyle=new LinkedList<>(); //垃圾桶才作
    }
	//1. mouse event 2. data structure 3.draw
    @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	Graphics2D g2d=(Graphics2D)g;
    	g2d.setColor(Color.BLUE);
    	g2d.setStroke(new BasicStroke(4));
    	
    	for(LinkedList<HashMap<String, Integer>>line:lines){
    		///顏色整個放在裡面 每一條線不同線
    		for(int i=1;i<line.size();i++){ //從一才能劃                                   //把現在線迴圈 丟給很多線的迴圈
        		HashMap<String, Integer> p0=line.get(i-1); //第一個點
        		HashMap<String, Integer> p1=line.get(i);   //現在的點
        		int x0= p0.get("x"), y0=p0.get("y"); //取出來在劃
        		int x1= p1.get("x"), y1=p1.get("y");
        		g2d.drawLine(x0, y0, x1, y1);
        		//g2d.drawLine(line.get(i-1).get("x"), line.get(i-1).get("y"), line.get(i).get("x"),
        				//line.get(i).get("y")); 這一行取代上一行
    	}
    	
    
    	}
    }
     public void chear() {
		lines.clear(); //清的是資料結構
		repaint(); //一定要用不然無法清 //肚子裡面已經沒有就乾淨了
	}
     public void undo(){
    	 recyle.add(lines.removeLast());  //移掉最後一個一個物件
    	 repaint();                   //recyle包起來
     }
     public void redo(){
    	if(recyle.size()>0){
    	lines.add(recyle.remove()); //實現你丟我撿
    	 repaint(); 
    	}
     }
    private class  MyMouseListener extends MouseAdapter{
    	@Override
    	public void mousePressed(MouseEvent e) { //打mP出現    //第二趟新的線跟新的點方式一樣
    		super.mousePressed(e);
    		//劃新線
    		recyle.clear();
    		
    		LinkedList<HashMap<String, Integer>> line=new LinkedList<>();
    		HashMap<String, Integer> point = new HashMap<>();
    		point.put("x", e.getX());
    		point.put("y",e.getY() );
    		line.add(point); //這邊只是區域變數
    		
    		lines.add(line);   //只含一個點的新線納入大結構
    		
    	}
    	@Override
    	public void mouseDragged(MouseEvent e) { //上下都在收集點 收集完了到3畫圖  //收集資料
    		super.mouseDragged(e);
    		HashMap<String, Integer> point = new HashMap<>();
    		point.put("x", e.getX());
    		point.put("y",e.getY() );
    		//line.add(point); 改成下面那行
    		lines.getLast().add(point); // 把線加進去
    		repaint();
    		//recyle.clear(); 這邊是有個點就clear
    	}
    	
    }
}
