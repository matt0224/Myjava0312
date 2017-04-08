package tw.matt0312;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class matt57 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		File readFile = new File("./dir2/images7023PMS2.jpg");
		File savaFile = new File("./dir3/images7023PMS2.jpg");
		
		
		try {
			FileOutputStream fout=new FileOutputStream(savaFile);
			FileInputStream fin =new FileInputStream( readFile);
			int b;
			while ((b=fin.read())!=-1){
				fout.write(b);
			}	
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("finish");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);
	}

}
