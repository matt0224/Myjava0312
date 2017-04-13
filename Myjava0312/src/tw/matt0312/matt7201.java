package tw.matt0312;

import java.util.TreeSet;

public class matt7201 {
//自然排序法 字串部分
	public static void main(String[] args) {
		TreeSet<String> set =new TreeSet<>();   //換成泛行<>裡面都是
        set.add("1");
        set.add("2");
        set.add("12"); //這邊泛成字串 的自然排序法
       for(String obj:set){
    	   System.out.println(obj); //換成泛行<>裡面都是字串
       }
        
      System.out.println(set);
	}
}