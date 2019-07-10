

import java.io.*;
import java.util.*;
import static java.lang.System.out;
class Z_PATTERN
{
    public static void main(String [] args)
    {
        int max=0,i=0,j=0,k=0;
        Scanner sc= new Scanner(System.in);
        out.println("Enter no");
        max=sc.nextInt();
        for(i=0;i<max;i++)
        {
            if(i==0 || i==(max-1))
            {
                for(k=0;k<max;k++)
                {
                    out.print("*");
                }
                out.println();
            }
           else
            {
                for(j=0;j<max-1-i;j++)
                {
                    out.print(" ");
                }
                out.print("*");
                out.println();
            }
        }
        
/*        String strr="";
        Scanner sc=new Scanner(System.in);
        strr=sc.nextLine();
        int len=strr.length();
        int flag=0;
        for(int i=0;i<len;i++)
        {

            if((strr.charAt(i)!=strr.charAt(len-1-i)) || (len==1))
            {
                    System.out.println("NO");
                
                flag=1;
                break;
            }
            
        }
        if(flag==0)
        {
                if(len%2==0)
                {
                    System.out.println("YES EVEN");
                }
                else
                {
                    System.out.println("YES ODD");
                }
        }*/
/*            int max=0;
        ArrayList<String> laptops=new ArrayList<>();
        ArrayList<Integer> laptops_counts=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        max=sc.nextInt();
        //for(int i=0;i<max;i++)
        //{
          //  laptops_counts.add(0);
        //}
        for(int i=0;i<max;i++)
        {
            String val=sc.nextLine();
            if(laptops.contains(val))
            {
                int index=laptops.indexOf(val);
                int c_index=laptops_counts.get(index)+1;
                laptops_counts.set(index,c_index);
            }
            else
            {
                laptops_counts.add(0);
                laptops.add(val);
            }
        }
        int max_ele=Collections.max(laptops_counts);
        System.out.println("max_element -> "+max_ele);
        int max_index=laptops_counts.indexOf(max_ele);
        System.out.println("max_element index -> "+max_index);
        System.out.print(laptops.get(max_index));*/
        
        
    }
}