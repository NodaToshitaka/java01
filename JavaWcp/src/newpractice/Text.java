package newpractice;

import java.io.FileReader;
import java.io.IOException;

public class Text {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("resources/output.txt")) {
			int output = fr.read();
			while(output != -1) {
				System.out.print((char)output);
				output = fr.read();
			}
		} catch(IOException e) {
			System.out.println("IOException error");
		}
	}

}
