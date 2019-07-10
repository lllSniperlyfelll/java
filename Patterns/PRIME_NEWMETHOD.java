import java.io.*;
import java.util.*;
import Timer.TIMER;

class ISPRIME
{
	boolean isPrimeNew(int    num)
	{
	int end=(int)Math.round(Math.sqrt(num));
	//System.out.println("sqrt of -> "+num+" is "+Math.sqrt(num)+" round to "+end);
		for(int    i=2;i<=end;i++)
		{
			if(num%i==0)
			{
				return(false);			
			}
		}
		return(true);
	}
	boolean isPrime(int    num)
	{
		for(int    i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return(false);
			}
		}
		return(true);
	}
}
class PRIME_NEWMETHOD
{
public static void main(String args[])
{
	ISPRIME ip=new ISPRIME();
	TIMER t=new TIMER();
	int    count=0;

		TIMER tt=new TIMER();
	count=0;
	tt.tick();
	for(int    i=2;i<=1000009;i++)
	{
	if(ip.isPrimeNew(i)==true)
		count+=1;
	}
	System.out.println("Toatal primes are -> "+count);
	tt.tick();

	t.tick();
	count=0;
	for(int    i=2;i<=1000009;i++)
	{
	if(ip.isPrime(i)==true)
		count+=1;
	}
	System.out.println("Toatal primes are -> "+count);
	t.tick();



}
}