import java.io.*;
class INV_DIAMOND
{
	public static void main(String []args)

	{
		int m=10;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<=m-1-i;j++)
				System.out.print("*");
			for(int j=0;j<i*2+1;j++)
				System.out.print(" ");
			for(int j=0;j<=m-1-i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<m-1;i++)
		{
			for(int j=0;j<i+2;j++)
				System.out.print("*");
			for(int j=0;j<2*(m-1-i)-1;j++)
				System.out.print(" ");
			for(int j=0;j<i+2;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}