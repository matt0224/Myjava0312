package tw.matt0312;

import java.util.HashMap;
import java.util.Set;

public class matt74 {
											//list的key永遠是整數 但map可以是物件
	public static void main(String[] args) { //MAP是映射 一對一的關係  
		HashMap<String, Object>  map= new HashMap<>(); //前面不泛資料會亂丟
		                                   
		                                   //下面這次是新加的
		Object o1=map.put("name","brad"); //put這次的
		Object o2=map.put("name","brad1"); 
		System.out.println((String)o2);  //這邊可以顯示上次的資料 因為put顯示k值
		
		map.put("name","matt");  //有泛行會提醒你 用PUT丟
		map.put("weight", 80.5);  //前面add是多一個元素 put是設定
		map.put("gender", true);
		System.out.println(map.get("gender"));
		System.out.println(map);
		map.put("weight", 70.5);
		System.out.println(map.get("weight"));
		System.out.println();
		
		Set<String> keys=map.keySet(); //用keySet得到SET
		for(String key:keys){ //尋訪
			System.out.println(key+"==>"+map.get(key)); //用get得到v
		}
		
	}

}
