import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Aloha {
	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			fw = new FileWriter("output.txt",true);
			pw = new PrintWriter(fw);

			String msg = new java.util.Scanner(System.in).nextLine();

			pw.println(msg);
		} catch(IOException e){
			System.out.println("IO Error");
		} finally {
			
			pw.close();
		}
	}
}