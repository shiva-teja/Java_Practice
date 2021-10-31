package example;

public class Char_Frequency {

	public static void main(String[] args) {

		int ASCII=256;
		int[] frq_arr=new int[ASCII];
		String s="shivateja";
		char[] ch=s.toCharArray();
		
		int max=1;
		char mfc=ch[0];
		for(int i=1;i<ch.length;i++)
		{
			frq_arr[(int)ch[i]]++;
			if(max<frq_arr[(int)ch[i]])
			{
				max=frq_arr[(int)ch[i]];
				mfc=ch[i];
			}
		}
		System.out.println("Character "+mfc+" has occured "+max+" number of times");
		
	}

}
