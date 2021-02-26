package code2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Uniqueitemsfromarray {
	public static void main(String[] args) {
		Integer[] a= {1,1,2,3,4,4,5,5,1,2,1,2};
		Set<Integer> ar=new TreeSet<Integer>();
		ar.addAll(Arrays.asList(a));
		System.out.println(ar);
	}

}
