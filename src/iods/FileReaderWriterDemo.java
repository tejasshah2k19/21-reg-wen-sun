package iods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		bufferedReaderDemo();
	}

	static void bufferedReaderDemo() throws IOException {

		File f = new File("d:\\Temp\\data2.txt");
		f.createNewFile();

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);// InputStreamReader -- console

		String data = "";

		while (true) {
			data = br.readLine();
			if (data == null) {
				break;
			}
			System.out.println(data);

		}

		System.out.println("\n==done===");

	}

	static void readerWriter() throws IOException {
		File f = new File("d:\\Temp\\data2.txt");
		f.createNewFile();

		FileWriter fw = new FileWriter(f);
		String name = "royaleducation ahmedabad 123456";

		fw.write(name);// pure text
		fw.write("\n");
		fw.write(65);// int
		fw.write("\n");
		fw.write(12);// int -> byte data
		fw.write("\n");
		fw.write(65 + "");
		fw.close();

		FileReader fr = new FileReader(f);

		int size = (int) f.length();
		char c[] = new char[size];
		fr.read(c);
		System.out.println("file data\n");
		for (char x : c) {
			System.out.print(x);
		}

		fr.close();
		System.out.println("\n==done===");

	}
}
