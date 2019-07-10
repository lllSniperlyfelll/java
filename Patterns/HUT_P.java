import java.io.*;
import java.util.*;
import Timer.TIMER;

class HUT_P
{
	public static void main(String args[])
	{
		int max=7;
		int i=0,j=0,k=0;
		for(i=0;i<max;i++)
		{
			for(int l=max-i-1;l>0;l--)
				System.out.print(" ");
			for(j=0;j<i*2+1;j++)
				System.out.print("*");
			System.out.println();
		}
		for(i=0;i<max-2;i++)
		{
			for(j=0;j<max*2-1;j++)
			{
				if(j<=2 || j>=(max*2)-4)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}