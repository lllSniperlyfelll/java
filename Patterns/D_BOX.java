import java.util.*;
import java.io.*;

class D_BOX
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max=0;
		System.out.println("Input -> ");
		max=Integer.parseInt(br.readLine());
		int j_max=max-1/2;
		int jj_max=max;
		for(int i=0;i<max/2;i++)
		{

			for(int j=0;j<j_max;j++)
			{
				System.out.print("*");
			}
			j_max-=1;
			for(int k=0;k<(i*2)-1;k++)
			{
				
				System.out.print(" ");
			}
			for(int j=0;j<jj_max-1;j++)
			{
				System.out.print("*");
			}
			jj_max-=1;
/*			for(int j=0;j<(max-1)/2;j++)
			{
				if(j<j_max)
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");	
				}
			}
			j_max-=1;
			for(int j=(max-1)/2;j<max-1;j++)
			{
				if(j<max)
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");	
				}
			}*/
			System.out.println();
		}

	}
}