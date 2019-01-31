import java.io.*;

class CLUSTER
{


    void output_generator(int og_matrix[][],int K,int num_of_rows,int cur_avg[])    /*GENERATE FORMATTED OUTPUT*/
    {

        int m,n;
        for(m=0;m<K;m++)
        {
            System.out.print("K"+(m+1)+"= {");
            for(n=0;n<actual_size(og_matrix, m, num_of_rows);n++)
            {
                if(og_matrix[m][n]!=-99 || og_matrix[n][m]!=-99)
                    System.out.print("  "+og_matrix[n][m]);
                
            }
            
            System.out.print("} = "+cur_avg[m]);
            System.out.println();
        }
    }





    int[][] reset_matrix()      /*FLUSHING MATRIX*/
    {
        int reset_matrixx[][]=new int[100][100];
    for(int i=0;i<100;i++)
        {
            for(int j=0;j<100;j++)
            {
                reset_matrixx[i][j]=-99;
            }
        }
    return(reset_matrixx);
    }



    int[][] update_matrix(int val,int index,int proxy_matrix[][],int K,int num_of_rows) /*TO OVERWRITE THE ORIGINAL VALUES OF og_matrix*/
    {
    for(int i=0;i<num_of_rows;i++)
        {
            if(proxy_matrix[i][index]==-99)
                {
                    proxy_matrix[i][index]=val;
                    break;
                }
        }
        return(proxy_matrix);

    }




    void print_array(int array[],int K)     /*TO PRINT AVERAGE ARRAY'S*/
    {
        int i=0;
        
        for(;i<K;i++)
        {
            System.out.println(array[i]);
        }
    }

    


	int[] subtactor(int element,int cur_avg[],int K,int num_of_rows)    /*TO SUBTRACT ELEMENT TO FIND ITS SMALLEST DISTANCE*/
	{
		int subtraction_array[]=new int[10];
		for(int i=0;i<K;i++)
		{
			subtraction_array[i]=Math.abs(element-(cur_avg[i]));
		}
	return(subtraction_array);	
	}
	
    
    

	int distance_finder(int element,int cur_avg[],int K,int num_of_rows)        /*TO FIND ELEMENT NEAREST MEAN*/
	{
	int i,min_index,j,min;
	min_index=0;
	min=0;
	int distance_array[]=new int[10];
	if(element!=-99)
	{
	distance_array=subtactor(element,cur_avg,K,num_of_rows);
	min=distance_array[0];
	for (i=1;i<K;i++)
		{
		if(min>distance_array[i])
			{
				min=distance_array[i];
				min_index=i;
			}
		}
	}
	else
		min_index=0;
	return(min_index);
	}
	
    
    

    boolean terminator(int cur_avg[],int prev_avg[],int K)      /*TO FIND WEATHER THE CURRENT AND PREVIOUS MEANS ARE SAME AND END PROGRAM*/
    {
        int stat=0;
        for(int i=0;i<K;i++)
        {        
            if(cur_avg[i]==prev_avg[i])
            {
                stat=0;
            }
            else
            {
                stat=1;
                break;
            }
        }
        if(stat==0)
        {
            return(true);
        }

        return(false);
    }



    int actual_size(int og_matrix[][],int K,int num_of_rows)    /*TO GET THOSE ROW'S HAVING VALID VALUES i.e not -99*/
    {
        int rows=0;
        int act_size=0;
        for(;rows<num_of_rows;rows++)
            {
                if(og_matrix[rows][K]!=-99)
                    act_size++;
            }
        return(act_size);
    }



    int average(int og_matrix[][],int K,int num_of_rows)    /*FOR FINDING MEAN'S*/
    {
        int avg,sum,rows;
        sum=0;
        avg=0;
        int size=actual_size(og_matrix, K, num_of_rows);
        for(rows=0;rows<size;rows++)
        {
            sum+=og_matrix[rows][K];
        }
        if(sum!=0)
            avg=sum/size;
        else
            avg=0;
        System.out.println();
        return (avg);
    }

 

    void cluster(int og_matrix[][],int proxy_matrix[][],int num_of_members,int num_of_rows,int K)       /*THE MAIN FUNCTION WHICH DOES THE TASK OF CLUSTERING*/
    {
        int rows,cols,i;
        int og_matrix1[][]=new int[100][100];
        int cur_avg[]=new int[10];
        int prev_avg[]=new int[10];
        
        for(i=0;i<cur_avg.length;i++)       /*INIT OF AVERAGE MATRIX TO AVOID 1 EQUALITY ITERAITION CONFLICT*/
            {
                cur_avg[i]=-40;
                prev_avg[i]=-80;
            }
		for(int rc=0;rc<K;rc++)
            {
           cur_avg[rc]=average(og_matrix, rc, num_of_rows);	    
            }		
        int itr=1;
        System.out.println("---------------Iteration -> 0---------------\n");
        output_generator(og_matrix,K,num_of_rows,cur_avg);
        System.out.println();
        while((terminator(cur_avg,prev_avg,K)) !=true)      /*LOOPS UNTIL CURRENT AND PREVOIUS MEANS BECOMES SAME*/
        {
            System.out.print("\n\n---------------Iteration -> "+itr+"------------------------");
            itr++;
            for(int rc=0;rc<K;rc++)
            {
            prev_avg[rc]=cur_avg[rc];
            }
                for(rows=0;rows<num_of_rows;rows++)
                {
                    for(cols=0;cols<K;cols++)
                    {
                        int index=distance_finder(og_matrix[rows][cols],cur_avg,K,num_of_rows);
                        og_matrix1=update_matrix(og_matrix[rows][cols],index,proxy_matrix,K,num_of_rows);
                    }
                }
            og_matrix=reset_matrix();
            for(rows=0;rows<num_of_rows;rows++)
            {
                for(cols=0;cols<K;cols++)
                {
                og_matrix[rows][cols]=og_matrix1[rows][cols];
                }
            }
           
            og_matrix1=reset_matrix();
            proxy_matrix=reset_matrix();
            for(int rc=0;rc<K;rc++)
            {
                cur_avg[rc]=average(og_matrix, rc, num_of_rows);
            }
            output_generator(og_matrix,K,num_of_rows,cur_avg); 
        }
        System.out.println("\n\n___________________________FINAL CLUSTER____________________________\n ");
        output_generator(og_matrix,K,num_of_rows,prev_avg);
    }

}









class K_MEAN            /*THE MAIN CLASS*/
{
    public static void main(String args[])throws IOException
    {
    int og_matrix[][]=new int[100][100];
    int proxy_matrix[][]=new int[100][100];    
    int K,num_of_members,rows,cols,num_of_rows,i;
    
    for(i=0;i<100;i++)       /*Initial filling of matrice's with invalid values*/
        {
            for(int j=0;j<100;j++)
                {
                    og_matrix[i][j]=-99;
                    proxy_matrix[i][j]=og_matrix[i][j];
                }
        }
        i=0;


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter value of K = ");
    K=Integer.parseInt(br.readLine());
    System.out.println("");
    System.out.print("Enter total number of elements = ");
    num_of_members=Integer.parseInt(br.readLine());
    num_of_rows=num_of_members;
    System.out.println("<---- Start Entering elements ---->");
    System.out.println("Number of members -> "+num_of_members); 
    for(rows=0;rows<num_of_members;rows++)      /*LOOP TO ARRANGE THE INPUT INTO MATRIX*/
    {
        for(cols=0;cols<K;cols++)
        {
            i++; 
            if(i!=(num_of_members+1))
                {
                    og_matrix[rows][cols]=Integer.parseInt(br.readLine());
                }
            else if(i==num_of_members+1)
                break;
        }
        if(i==num_of_members+1)
        break;
    }
        CLUSTER CC=new CLUSTER();
        CC.cluster(og_matrix,proxy_matrix,num_of_members,num_of_rows,K);
    }
}