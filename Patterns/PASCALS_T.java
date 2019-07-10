import java.io.*;
import java.util.*;
import static java.lang.System.out;
import Timer.TIMER;
class PASCALS_T
{
    public static void main(String [] args)
    {
        TIMER T =new TIMER();
        T.tick();
    	int max=0;
    	Scanner sc=new Scanner(System.in);
    	max=sc.nextInt();
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s1_cpy=new Stack<>();
        s1.push(1);
    	int j=0;
        int count=0;
    	for(int i=0;i<max;i++)
    	{
    		for(int k=0;k<max-1-i;k++)
    		{
    
    			System.out.print(" ");
    		}
            Iterator itr = s1.iterator();
            while(itr.hasNext())
            {
                System.out.print(itr.next().toString()+" ");
            }
            System.out.println();
            s1_cpy.push(1);
            int c=s1.pop();
            while(!s1.isEmpty())
            {
                int pop_val=s1.pop();
                int a=c+pop_val;
                c=pop_val;   
                s1_cpy.push(a);
                
            }
            s1_cpy.push(1);
            s1=(Stack<Integer>)s1_cpy.clone();
            s1_cpy.clear();
            /*while(!s1_cpy.isEmpty())
            {
                s1.push(s1_cpy.pop());
            }*/
            
    	}
        T.tick();
    }
}






/*import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        int bottle_no=0;
        int ip=0;
        Scanner sc= new Scanner(System.in);
        ip=sc.nextInt();
        //for(int j=0;j<ip;j++)
        //{
        while(ip>=1)
        {
            bottle_no=sc.nextInt();
            int counter=2;
            int i=2;
            while(i<bottle_no)
                {
                    if(bottle_no%i==0)
                    {
                        counter++;
                    }
                    i++;
    
                    
                }
                if(counter<4)
                    {
                        System.out.println("NO");
                    }
                else
                {
                    System.out.println("YES");
                }
            ip--;
       }
    }
}
*/