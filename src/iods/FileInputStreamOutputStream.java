package iods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamOutputStream {

	public static void main(String[] args) throws IOException {

		//

		File f = new File("d://Temp//data.txt");// link-->data.txt
		f.createNewFile();// if present then return false and do not create else create and return true

		FileOutputStream fos = new FileOutputStream(f);
		fos.write('a');// byte
		fos.write('o');
		fos.write('y');
		fos.write('a');
		fos.write('l');
		fos.write(12);
		fos.write(65);
		fos.close();

		FileInputStream fis = new FileInputStream(f);

//		int b = fis.read();// single byte read
//		System.out.println((char)b);

//		int b = 0;
//		while (true) {
//			b = fis.read();// -1 EOF
//			if (b == -1) {
//				break;
//			}
//			System.out.println((char) b);
//		}

		int l = (int) f.length(); // byte --> long
		byte b[] = new byte[l];
		fis.read(b); // bytes ==> b

		for (byte x : b) {
			System.out.println((char) x);
		}
		fis.close();
		System.out.println("done");
	}

}
