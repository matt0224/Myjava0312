package tw.matt0312;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class matt60 {

/*
 * 解序列化
 */
		public static void main(String[] args) {
			try {
				ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir2/matt.object"));
				Object obj1 = oin.readObject();										//這邊解序列化所以物件存在
				Object obj2 = oin.readObject();  //多個物件的解序列
				oin.close();
				Student s1 = (Student)obj1;  //要強制轉型才能用物件原本裡面的方法
				Student s2 = (Student)obj2;
				System.out.println(s1.getname()+s1.sum()+":"+s1.avg());
				System.out.println(s2.getname()+s2.sum()+":"+s2.avg());
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
}
	