package iods;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
//		createFile();
//		methodS();
//		folder();
		
		getFolderList();
	}

	static void createFile() throws IOException {
		File f = new File("d://javabatch//royal.txt"); // it will not create a file
		// link --> f ==> royal.txt
		System.out.println("exists() ==> " + f.exists()); // boolean [f]
		f.createNewFile(); // boolean [t] -> IOException
		System.out.println("total bytes ==> " + f.length());
		// f.delete(); // boolean [t] [f]

		File newF = new File("d:\\javabatch\\26jan.txt");
		f.renameTo(newF);

	}

	static void methodS() {
		File f = new File("d://javabatch//royal.txt"); // it will not create a file
		System.out.println(f.isFile()); // true
		System.out.println(f.isDirectory());// false
		System.out.println(f.isHidden());// false
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		System.out.println(f.canExecute());

	}

	static void folder() throws IOException {
		File f = new File("d:\\javabatch\\reliance");
		f.mkdir();// boolean
		System.out.println("folder created....");

//		File f2 = new File("d:\\javabatch\\reliance\\mukesh.txt");
//		File f2 = new File("d:\\javabatch\\reliance", "mukesh.txt");
		File f2 = new File(f, "mukesh.txt");
		f2.createNewFile();
		// f.delete(); // boolean --> false -- folder empty
	}

	static void getFolderList() {
		File f = new File("D:\\");
		String list[] = f.list();

		for (String x : list) {
			System.out.println(x);
		}
	}

}
