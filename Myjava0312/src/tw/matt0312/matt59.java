package tw.matt0312;
/*
 * 這邊是從取資料 序列化 所以這物件要先存在
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class matt59 {

	public static void main(String[] args) {
		Student s1 =new Student("matt",50,40,24);
		Student s2 =new Student("eric",50,40,24);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir2/matt.object"));
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.flush();
			oout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
