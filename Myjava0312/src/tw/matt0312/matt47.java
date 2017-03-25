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
			throw new Exception(); // 碼調表示如果沒有意外
		}catch(Exception ee){   //這邊表示有抓到而且有處理
			System.out.println("catch");
			return;          
		}finally{                        //這邊是表示總結 一定要做
			System.out.println("ok");   //finally的意思是return後變成try finally完整句一定TRY完全不
		}
		//System.out.println("end");
		
		//筆記本上有幾種類別
	}
}
