import java.io.*;
import java.util.*;
public class Stream{
	public static void main(String[] args){
		String fileName = args[0];
		FileReader inFile;
		int data;
		int n = 0;
		try{
			inFile = new FileReader(fileName);
			while ((data = inFile.read()) != -1){
				System.out.print(n + (char) data);
				n++;
			}
			inFile.close();
		} catch (IOException e){
			System.err.println("err");
			System.exit(1);
		}
	}
}