package makeSeleniumEasy;

import java.util.Stack;

public class String_Reverse_Stack {

	public static void main(String[] args) {
		String name="Shivateja";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<name.length();i++)
		{
			 st.push(name.charAt(i));
		}
//		for(int i=0;i<name.length();i++)
		while(!st.isEmpty()){
			 System.out.print(st.pop());
		}
	}

}
