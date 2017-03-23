package tw.matt0312;
/*
 * 計算面積 三角形 用interface
 */
public class matt30 {

	public static void main(String[] args) {
		 
		//shape s1 = new Trishape(3,4,5,4);//寫一個三角形出來    //介面永遠不會有建構式不存在物件實體等著你來實作
		   //宣告出了s1就有      Trishape裡面的方法         ;這邊的shape看不到下面方法 除非宣告為      Trishape  
		 Trishape s1= new Trishape(3,4,5,4);
		
		  shape s2 = new squshape(4);//寫一個三角形出來
		  m1(s1);
		  m1(s2); 
		  s1.isTrashape();// Trishape s1= new Trishape(3,4,5,4);這樣就有辦法出現
		  
		  
	}
        static void m1(shape s){         //傳近來甚麼行就沒關係   //你有考過shape所以你會計算面積這招
        	System.out.println(s.calArea());  //計算面積
        	                                    //抽象是有幾招已經實作了有幾招沒做
        										//介面是完全沒有實作
        	         //形狀只有兩招 因為打算不使用其他方法
        }
}
interface shape{
	double callength();    
	double calArea();
}
  class Trishape implements shape{
	private double s1, s2, s3,h1;
	Trishape(double s1, double s2, double s3,double h1) {      //建構式要傳遞參數近來
		this.s1=s1;this.s2=s2;this.s3=s3;this.h1=h1;		   //有了方法後要有建構式傳進來
		                                                       //所以不一定要有無傳參數近來
	                                                          //這個三角形是無法改變設計觀的
		                                                      //沒有set讓你用
		//void setS1(double s) {this.S1=S1}  //這個表示可以任意改變 
		
		
	}														   
	public double callength(){                                 
		return s1+s2+s3;
		}
	public double calArea(){
		return s1*h1/2;
		};
		public  boolean  isTrashape(){
			   return true;
		   }
	}
  class squshape implements shape{
	private double s;
	squshape(double s) {      //建構式要傳遞參數近來
		this.s=s;            //所以不一定要有無傳參數近來
	                                                          //這個三角形是無法改變設計觀的
		                                                      //沒有set讓你用
		//void setS1(double s) {this.S1=S1}  //這個表示可以任意改變 
		
		
	}														   
	public double callength(){                                 
		return s*4;
		}
	public double calArea(){
		return s*s;
		};
		
	}
   