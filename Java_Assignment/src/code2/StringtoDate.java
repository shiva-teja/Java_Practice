package code2;

import java.util.Hashtable;

public class StringtoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip="15011990";
		char[] op=ip.toCharArray();
		Hashtable<String,String> dict=new Hashtable<String, String>();
		
		dict.put("01", "Jan");
		dict.put("02", "Feb");
		dict.put("03", "Mar");
		dict.put("04", "Apr");
		dict.put("05", "May");
		dict.put("06", "Jun");
		dict.put("07", "Jul");
		dict.put("08", "Aug");
		dict.put("09", "Sep");
		dict.put("10", "Oct");
		dict.put("11", "Nov");
		dict.put("12", "Dec");
		
		String mon=""+op[2]+op[3];
		System.out.println(mon);
		System.out.println(ip.substring(0, 2)+"th"+" "+dict.get(mon)+" "+ip.substring(4));
	}

}
