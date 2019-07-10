import java.io.*;
import java.util.*;
import Timer.TIMER;

class WEIRD_P
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int max=sc.nextInt();
		int max_c=max;
		for(int i=1;i<=max;i++)
		{
			for(int j=1;j<=max_c;j++)
				System.out.print(j);
			for(int j=max_c;j>=1;j--)
				System.out.print(j);
			max_c-=1;
			System.out.println();


		}

	}
}