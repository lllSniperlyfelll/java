import java.util.*;
import java.io.*;

class NUM_STAR2
{
	public static void main(String []args)
	{
		int i=0,j=0,count=0;
		int start=7;
		int last=start;
		String val="";
		String temp="";
		for(i=1;i<=start;i++)
		{
			count=i;
			temp="";
			for(j=last;count!=0;j++)	
			{
				System.out.print(j+" ");
				if(i<start)
				temp=temp+Integer.toString(j)+" ";
				count--;
			}			
			last=j;
			val = (temp+"\n"+val);

			if(i<start)
			System.out.println();
			else
			System.out.print(val);
		}
		
	}
}