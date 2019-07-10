import java.io.*;
import java.util.*;

class NUM_STAR
{
	public static void main(String [] args)
	{
		int max=0;
		Scanner sc= new Scanner(System.in);
		max=sc.nextInt();
		for(int i=1;i<=max;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=0;k<max-i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}