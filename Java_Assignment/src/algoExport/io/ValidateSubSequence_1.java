package algoExport.io;

public class ValidateSubSequence_1 {

	public static void main(String[] args) {

		int arr[]= {3,5,-4,8,11,1,-1,6};
		int seq[]= {3,8,-1,6};
		System.out.println(subseqvalidation(arr,seq));
		
		
	}
	public static boolean subseqvalidation(int[] a,int[] seq)
	{
		int seqidx=0;
		int aidx=0;
		while(aidx<a.length && seqidx<seq.length)
		{
			if(a[aidx]==seq[seqidx])
			{
				seqidx++;
			}
			aidx++;
		}
		return seqidx == seq.length;
	}

}
