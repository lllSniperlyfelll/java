import java.io.*;
import java.util.*;
import Timer.TIMER;

class ODD_ALPHA
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int max=sc.nextInt();
		//int count=0;
		int j=0;
		int last=97;
		for(int i=0;i<max;i++)
		{
			for(j=0;j<=i+1;j+=1)
			{
				/*if(j==0)
				System.out.print((char)('A'+i));
				else*/
					if(j%2==0 || j==0)
					System.out.print((char)(last+j));
			}
			last+=j;

		/*	for(int j=max_c;j>=1;j--)
				System.out.print(j);
			max_c-=1;*/
			//count+=1;
			System.out.println();


		}

	}
}