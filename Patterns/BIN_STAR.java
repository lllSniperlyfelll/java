import java.io.*;
import java.util.*;
import Timer.TIMER;

class BIN_STAR
{
	public static void main(String [] args)
	{

/*		int max=10;
		int counter=0;
		int k=1;
		for(int i=0;i<max;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				if(j%2==0)
					{
					System.out.print("a");
					}
				else
				{
					System.out.print(k);
					k+=1;
				}
			}
			System.out.println();
		}*/
		int max=0;
		TIMER t= new TIMER();
		Scanner sc= new Scanner(System.in);
		max=sc.nextInt();
		System.out.println();
		t.tick();
		for(int i=0;i<max;i++)
		{
			for(int j=0;j<i;j+=2)
			{
				if(i%2==0 && i!=0)
				{
					System.out.print("10");

				}
 
				else
				{
					System.out.print("01");
				}
			}
			if(i%2==0 )
			System.out.print("1");

			System.out.println();
		}
		t.tick();

	}
}