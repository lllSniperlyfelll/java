import java.util.*;

class PATTERN
{

	int i=0;
	int k=0;
	int printjp(int max)
	{
		if(max>=0)
		{
			System.out.print("*");
			max-=1;
			printjp(max);
		}
		return(0);
	}
	int printp(int max)
	{
		int j=0;
		
		if(max>=0)
		{
			printjp(max);
			max-=1;
			System.out.println();
			printp(max);
		}

		else
		{
		
			return(0);
		}
		return(0);

	}

	int j_pattern(int m)
	{
		if(m>=0)
		{
			System.out.print("*");
			m-=1;
			j_pattern(m);
		}
		
		return(0);

	}
	int i_pattern(int max)
	{
		if(max>=1)
		{
			j_pattern(i);
			i+=1;
			max-=1;
			System.out.println();
			i_pattern(max);
		}
		return(0);

	}
}


class TRI_REC
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int m =sc.nextInt();
		new PATTERN().i_pattern(m);
		new PATTERN().printp(m);
	}
}