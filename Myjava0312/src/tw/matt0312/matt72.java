package tw.matt0312;

import java.util.HashSet;
import java.util.TreeSet;

public class matt72 {
//這邊是沒時間指定型別用
	public static void main(String[] args) {
	//	HashSet set =new HashSet(); int i=0;
		TreeSet<Integer> set =new TreeSet<>();   //換成泛行<>裡面放整數 不是整數就不能放
         set.add(12);
         set.add(56);
         byte a=13;
         //set.add(a); //byte=> int =>integer 這邊不能轉兩次
         set.add((int)a); //可以直接先轉型再放進去add就不會抱錯了
        
         
       System.out.println(set);
       
	}
}
//HashSet set =new HashSet();
//set.add(12);
//set.add(12.3);
//set.add(12.3);
//set.add(12.3);
//set.add(56);
//set.add(12.3);
//set.add("matt");		
//System.out.println(set.size());
//System.out.println(set); //裡面依樣不會從副

//public static void main(String[] args) {
//	//	HashSet set =new HashSet(); int i=0;
//		TreeSet set =new TreeSet(); int i=0;  //換一個容器而已 set得
//         while(set.size()<6){
//        	 set.add((int)(Math.random()*49+1));
//        	 i++; //迴圈數
//         }
//       System.out.println(set);
//       System.out.println(i);