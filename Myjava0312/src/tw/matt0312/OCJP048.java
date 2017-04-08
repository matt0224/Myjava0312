package tw.matt0312;

public class OCJP048 {

	public static void main(String[] args) {
		int[]x={1,2,3};
		int y[]={4,5,6};
		new  OCJP048().go(x,y); //new出物件在叫方法
	}
    void go(int [] ... z){  //不定個數的參數題目
    	//z=int[]  []=>{{1,2,3},{4,5,6}}  
    	for(int[]a:z){    //x[],y[] 
    		System.out.println(a[0]);//a的第0個有兩個X跟Y 第0格是1跟4
    	}
    }
}
