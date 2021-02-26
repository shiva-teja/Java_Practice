package code2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(54);
		al.remove(2);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		System.out.println(al.get(0));
		for(int i:al)
		{
			System.out.println(i);
		}
		Set<Integer> sl=new LinkedHashSet<Integer>(al);
		System.out.println(sl);
	}

}
