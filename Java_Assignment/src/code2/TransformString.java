package code2;

public class TransformString {
	
	static boolean transform(StringBuilder s)
	{
		char ch='a';
		if(s.length()<26)
			return false;
		for(int i=0;i<s.length();i++)
		{
//			if((int)ch>(int)'z')
//				break;
			if(s.charAt(i)<=ch)
			{
				s.setCharAt(i, ch);
				ch=(char)((int)ch+1);
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		 StringBuilder str =  
			        new StringBuilder("aaaaaaaaaaaaaaaaaaaaaaaaaa"); 
			           
			        if (transform(str)) 
			            System.out.println(str.toString()); 
			        else
			            System.out.println("Not Possible"); 
	}

}
