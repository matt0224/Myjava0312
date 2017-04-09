package tw.matt0312;

import java.util.HashSet;
import java.util.TreeSet;

public class matt7202 {
//addALL
	public static void main(String[] args) {
		HashSet set =new HashSet();   //換成泛行<>裡面都是
        set.add(1);
        HashSet set2 =new HashSet();   //換成泛行<>裡面都是
        set.add(2);
        set.add(3);
        set.add(4); 
        set.addAll(set2);   
       System.out.println(set);
      System.out.println(set.size());
	}
}