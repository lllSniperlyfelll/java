import java.io.*;
import java.util.*;
import Timer.TIMER;

class ZIGZAG_PYD
{

	public static void main(String []args)
	{
		int max=10;
		int i=0,j=0,k=0,last=1,count=1;
		for(i=0;i<max;i++)
		{
			count=i+1;
			if(i%2==0)
			{
				for(j=last;count!=0;j++)
				{
					System.out.print((count>1)?(Integer.toString(j)+"*"):(Integer.toString(j)));
					count--;
				}
				last=j;
			}
			else
			{
				int cc=count-1;
				for(k=last+cc;count!=0;k--)
				{
					System.out.print((count>1)?(Integer.toString(k)+"*"):(Integer.toString(k)));
					count--;
				}
				last+=cc+1;
			}
			System.out.println();
		}
	}  
	
}