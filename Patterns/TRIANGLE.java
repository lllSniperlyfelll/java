import java.util.*;
import java.io.*;
import Timer.TIMER;

class TRIANGLE
{
	public static void main(String args[])throws Exception
	{
		TIMER t= new TIMER();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max=0;
		System.out.println("Input -> ");
		max=Integer.parseInt(br.readLine());
		t.tick();
		int i=0,j=0,k=0;
		for(i=0;i<max;i++)
		{
			for(k=0;k<(max-1)-i;k++)
				System.out.print(" ");
			for(j=0;j<(i*2)-1;j++)
			{
				if(j==0|| j==(i*2)-2 || i==max-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}
		t.tick();
	}
}