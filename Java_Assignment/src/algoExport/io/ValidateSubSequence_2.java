package algoExport.io;

public class ValidateSubSequence_2 {

	public static void main(String[] args) {

		int arr[]= {3,5,-4,8,11,1,-1,6};
//		int seq[]= {3,8,-1,6};
		int seq[]= {3,-1,8,6};
		System.out.println(subseqvalidation(arr,seq));
	}
	public static boolean subseqvalidation(int[] a,int[] seq)
	{
		int seqidx=0;

		for(int i=0;i<a.length;i++)
		{
			if(seqidx==seq.length)
			{
				break;
			}
			if(seq[seqidx]==a[i])
			{
				seqidx++;
			}
		}
		return seqidx == seq.length;
	}

}
