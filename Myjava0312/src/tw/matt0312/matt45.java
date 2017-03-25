package tw.matt0312;

public class matt45 {

	public static void main(String[] args) {
			Bird b1 = new Bird();
			int n=4;
			try{
			  b1.setLeg(n);
			}catch(MyException ee){   //這樣的表示是操作的人去處理
				//b1=null; // 讓b1做不出物件
				System.out.println(ee.toString());
			}catch(MyException2 ee){   //這樣的表示是操作的人去處理
				//b1=null; // 讓b1做不出物件
				System.out.println(ee.toString());
			}catch(Exception ee){  //下面有Exception這行一定要出來 不然會報錯
				
				System.out.println(ee.toString());
			}
			System.out.println("END");
	}

}
class Bird {
	private int leg;
	//void setLeg(int n ) throws Exception MyException,MyException2 { 碼調這行就藥用下面這行
	void setLeg(int n ) throws Exception { //外包裝這邊要說明 宣告要加S   這邊宣告了Exception
		if(n>2){
			//throw new Exception();  //這邊拋出例外 不要寫死  EX做出茶杯外包裝有可以會發生甚麼事
			throw new MyException2();  //這邊拋出例外 void方法這邊要宣告 這邊沒有處理(沒有寫TRY)
			//System.out.println();   //上面這行如果接受到 永遠都道不了31行是編譯失敗
		}else if(n<0){
			throw new MyException();
		}
		leg = n; //腳的數量來自設定
	}
}
/////上面的是一種 在自己做出例外 一個一個說
class MyException extends Exception{  //自己做出例外
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "沒有欠人家腳的";
	}
}
class MyException2 extends Exception{
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "1122";
	}
}