package tw.matt0312;

public class Bike {     //寫在類別裡面
     private  double speed;     //速度不是說改就改所以要加封裝private
      void upSpeed(){   //要有物件才能做的方法 任何物件都有傳回值 VOID就沒有傳回值 
    	                //透過方法改變速度
    	  speed = (speed<1)?1:(speed*1.2);
      }
      void downSpeed(){
    	  speed= (speed<1)?1:(speed*0.7);;
      }
      double getSpeed(){      //里程表的意思  這邊是第4行要加這兩行傳回速度
    	  return speed;
      }
}
