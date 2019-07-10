import java.io.*;
import java.util.*;
class TWO_P
{
	public static void main(String []rags)
	{
		int max =3;
		int start=3;
		int i=0,j=0;
		int count=2;
		System.out.println(" "+start);
		for(i=0;i<max;i++)
		{
			int c=count;
			c*=2;
			start*=2;
			for(j=start;count!=0;j+=1)
			{
				System.out.print(" "+j);

				count--;
			}
			count=c;
			System.out.println();
		}
	}
}