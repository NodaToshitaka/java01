package newpractice;

import java.io.IOException;

public class Error3 {
	public static void main(String[] args) throws IOException{
		System.out.println("エラーが発生しました");
		throw new IOException();
	}

}
