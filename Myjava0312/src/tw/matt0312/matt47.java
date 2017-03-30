package tw.matt0312;
public class matt47 {

	public static void main(String[] args) {
			new matt471().m1();
			
	}
}
class matt471{
	void m1(){
		try{    //這邊有TRY
			System.out.println("do some");
			throw new Exception(); // 碼調表示如果沒有意外  //45號下面的程式如果沒有try只有方法跟throw new Exception();要在方法那行宣告
		}catch(Exception ee){   //這邊表示有抓到而且有解決內部處理掉了      沒做就是做  //比較45號 45號是沒處理要對外宣告
			System.out.println("catch");
			return;          //如果return在這邊System.out.println("end");永遠做不到
		}finally{                        //這邊是表示總結 一定會跑來這
			System.out.println("ok");   //finally的意思是return後變成try finally完整句一定TRY完全不
		}
		//System.out.println("end");
		
		//筆記本上有幾種類別
	}
}
