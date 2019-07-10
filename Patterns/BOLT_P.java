import java.io.*;

class BOLT_P
{
	public static void main(String []args)
	{
		int max=20;
		for(int i=0;i<max;i++)
		{

			if(i<=max-2)
			{
			for(int k=0;k<max-1;k++)
				System.out.print(" ");
			for(int j=0;j<i;j++)
				System.out.print("*");
			}
			else
			{
			for(int j=0;j<max*2-2;j++)
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<max;i++)
		{
			for(int j=-1;j<i;j++)
				System.out.print(" ");
			for(int k=1;k<max-1-i;k++)
				System.out.print("*");

			System.out.println();
		}

	}
}