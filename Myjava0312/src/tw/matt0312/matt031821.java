package tw.matt0312;

public class matt031821 {

	public static void main(String[] args) {
		System.out.println(TWid.ischeckOK(""));//檢查程式是否正確
		
		//TWid id1= new TWid("A123456789");
		TWid id1= new TWid();
		TWid id2= new TWid(1);
		TWid id3= new TWid(false);
		TWid id4= new TWid(true,12);
		System.out.println(id1.getId());
//		System.out.println(id1.getId());
//		if(id1.isfemale()){
//			System.out.println("女生");
//		}else{
//			System.out.println("男生");
//		}
	}

}
