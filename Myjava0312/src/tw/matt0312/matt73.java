
package tw.matt0312;

import java.util.LinkedList;

public class matt73 {

	public static void main(String[] args) {
		LinkedList<String> list1 =new LinkedList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c"); 
		list1.add("b"); 
		System.out.println(list1);
		list1.remove("b"); //砍第一個
		System.out.println(list1);
		list1.remove("b");//砍第二個
		System.out.println(list1);
		list1.remove("b");//沒了 沒做不會抱錯
	}

}
//public class matt73 {
//
//	public static void main(String[] args) {
//		LinkedList<String> list1 =new LinkedList<>();
//		list1.add(0,"a");
//		list1.add(0,"b");
//		list1.add(0,"c"); //新加入的擺前面 abc>cba
//	//	list1.add(0,"c"); //插第0格
//		//list1.add(3,"c"); //只在現有的位置插 index<list.size()
//		System.out.println(list1.get(1));
//	}