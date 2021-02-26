package code2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fileextract {

	public static void main(String[] args) throws IOException {
		String match="teja";
		// TODO Auto-generated method stub
		String s=readfile("C:\\Users\\shiva\\Desktop\\Filetext.txt");
		if(s.contains(match))
		{
			System.out.println(s);
		}

	}
	public static String readfile(String path) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(path)));
	}

}
