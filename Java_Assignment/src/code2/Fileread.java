package code2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileread {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc =new Scanner(new File("C:\\Users\\shiva\\Desktop\\file.txt"));
		while(sc.hasNextLine())
		{
			System.out.println(sc.next());
		}
	}

}
