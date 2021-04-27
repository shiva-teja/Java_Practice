package makeSeleniumEasy;

public class String_WithoutTrim {
static String str="    Shivateja    ";
	public static void main(String[] args) {
		int startnonspaceindex=0;
		int endnonspaceindex=str.length()-1;
		char[] val =str.toCharArray();
		while(startnonspaceindex<str.length() && 	val[startnonspaceindex]== ' ')
		{
			startnonspaceindex++;
		}
		while(startnonspaceindex<endnonspaceindex && val[endnonspaceindex]== ' ')	
		{
			endnonspaceindex--;
		}
		str=str.substring(startnonspaceindex, endnonspaceindex+1);
		System.out.print(str);
		
	}

}
