package tw.matt0312;
/*
 * 3/18從這邊講起
 */
public class Bike extends Object{     //寫在類別裡面  //父類別的觀念如果不講隱含public class Bike extends Object為bike的副類別
	
      double speed;     //速度不是說改就改所以要加封裝private //第2階段把private拿掉
      int a; // a=0 代表顏色 0代表沒顏色  a沒有 private 
      static int b;  //跟上面插static
     
      Bike(){ 					//3/18建構式宣告無傳回值與類別Bike大小寫一樣 //建構完bike的第9行後,再做一台腳踏車測試是否有兩台
    	                        //這邊表沒有使參數 使用原本的就好
    	  this(0);            //代表就是這個物件傳整數的那個會跳到下面 Bike(int s)這個
      //  speed = 100;       測試用  
    	//  speed = s;                             // 
    	//  System.out.println("Bike:bike()v1");   // 用this取代這兩行
    	 // System.out.println("Bike:bike()v1");//括號裡面隨便寫測試用
      }
      Bike(int s){                                      //宣告名稱只能跟類別依樣,從括號避免混淆
    	  this(s*1f);   //這邊又可以呼叫Bike(float s)
    	 // speed = s; //客戶指定1.2所以給他1.2   	  
    	 // System.out.println("Bike:bike()v3");     //這邊使用不同的方法來使用 bike  int找不到 
    	                                                                // bike如果找不到會找double
    	               /////Bike(int s)上面範呼叫float
      }Bike(float s){                                      //宣告名稱只能跟類別依樣,從括號避免混淆
    	  this(s*1.0);    //這邊又可以呼叫Bike(double s)
    	 // speed = s; 
    	 // System.out.println("Bike:bike()");  
    	    
  } 
      Bike(double s){                                      //宣告名稱只能跟類別依樣,從括號避免混淆
    	  
        	  speed = s; //客戶指定1.2所以給他1.2
        	  a++; b++;
            System.out.println("Bike:bike()");   //在主程式只有1個腳踏車的同時會混淆兩台腳踏車
        	    //上面兩台腳踏車插在屬性不同一個是double
    	  //以上是屬性
      }
      void upSpeed(){   //要有物件才能做的方法 任何物件都有傳回值 VOID就沒有傳回值 
    	                //透過方法改變速度
    	  speed = (speed<1)?1:(speed*1.2);   
	  } void upSpeed(int gear){   //gear指定 但是也是要呼叫加速度
		                                           //""同名異事""
		  speed = (speed<1)?1:(speed*(1.2+gear));   //複製第一個增加檔位
		}
      void downSpeed(){
    	  speed= (speed<1)?1:(speed*0.7);;
      }
      double getSpeed(){      //里程表的意思  這邊是第4行要加這兩行傳回速度
    	  return speed;
      }
}
