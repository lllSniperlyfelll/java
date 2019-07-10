package Timer;
import java.io.*;
import java.util.*;
import java.lang.*;

public class TIMER
{
	int flag=0;
	long start=0 , stop=0;
	public void tick()
	{
		try
		{
			if(this.flag==0)
			{
				this.start= System.currentTimeMillis();
				this.flag=1;
			}
			else if(this.flag==1)
			{
				this.stop=System.currentTimeMillis();
				this.flag=0;
				System.out.println();
				System.out.print("Execution time is -> "+(this.stop-this.start)*0.001+" sec");
				System.out.println();
				this.start=0;
				this.stop=0;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception from timer -> "+e);
		}


	}
}