package tw.matt0312;

import java.util.HashMap;
import java.util.Set;

public class matt74 {

	public static void main(String[] args) {
		HashMap<String, Object>  map= new HashMap<>(); //前面不泛資料會亂丟
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
