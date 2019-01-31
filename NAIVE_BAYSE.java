import java.io.*;
import java.util.Scanner;

class PREDICTOR
{
	int len=0;
	float prob_class_yes,prob_class_no;
	float sum_no=0,sum_yes=0;
	int itr=0;
	
	boolean checker(String age,String income,String student,String credit_rating)
	{
		
		if( !(age.equals("youth")) && !(age.equals("senior")) && !(age.equals("middle")) )
				return (false);
		if( !(income.equals("low")) && !(income.equals("medium")) && !(income.equals("high")) )
				return (false);
		if( !(student.equals("yes")) && !(student.equals("no")) )
				return (false);
		if( !(credit_rating.equals("excel")) && !(credit_rating.equals("fair")) )
				return (false);
		
		return(true);
	}
	
	
	float probability_calculator(String array[],String tupple_value,String yes_no,String class_comp[])
	{
		float sum=0;
		for(itr=1;itr<len;itr++)
		{
			//System.out.println("array -> "+array[itr]+" class value ->"+class_comp[itr]+" YES no value ->"+yes_no);
			if( array[itr].equals(tupple_value) && class_comp[itr].equals(yes_no) )
			{
				sum+=1;
			//	System.out.println("sum value "+sum);
			}				
		}
		if(yes_no.equals("yes"))
			
			sum/=sum_yes;
		else if(yes_no.equals("no"))

			sum/=sum_no;
						

				return(sum);
	}




	
	PREDICTOR(String age[],String income[],String student[],String credit_rating[],String class_comp[],int len)throws IOException
	{
		this.len=len;
		
		int i;
		float age_probability_yes,student_probability_yes,credit_rating_probability_yes,income_probability_yes;
		float age_probability_no,student_probability_no,credit_rating_probability_no,income_probability_no;
		float total_no_probability,total_yes_probability;
		String _age,_income,_student,_credit_rating,_class_comp;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		for (i=0;i<len;i++)
		{
			
			if(class_comp[i].equals("no"))
			{
				this.sum_no+=1;
			}
			else if(class_comp[i].equals("yes"))
			{
				this.sum_yes+=1;
			}

			
		}
			this.prob_class_no=sum_no/(len-1);/*replace this with (len-1)=len and also change dataset*/
			this.prob_class_yes=sum_yes/(len-1);
			
			System.out.println("Probability of yes -> "+prob_class_yes);
			System.out.println("Probability of no -> "+prob_class_no);
		System.out.println("<__________________________Enter Tupples__________________________>");
		
		System.out.print("Age ->  ");
		_age=br.readLine();
		if(_age.equals("middle_aged"))
			_age="middle";
		
		System.out.print("Income ->  ");
		_income=br.readLine();
		

		System.out.print("Student ->  ");
		_student=br.readLine();
		

		System.out.print("Credit Rating ->  ");
		_credit_rating=br.readLine();

		if(_credit_rating.equals("excellent"))
			_credit_rating="excel";
		

		System.out.println("");
					System.out.println("Predicting...");
		if(checker(_age,_income,_student,_credit_rating)==false)
		{
			System.out.println("Error ! Some Values Are Wrong ");
		}
		else
		{
				//System.out.println("Probability of -> "+tupple_value+" with yes/no -> "+yes_no+" is ->  "+sum);	
			age_probability_yes=probability_calculator(age,_age,"yes",class_comp);
			age_probability_no=probability_calculator(age,_age,"no",class_comp);
			
			income_probability_yes=probability_calculator(income,_income,"yes",class_comp);
			income_probability_no=probability_calculator(income,_income,"no",class_comp);
			
			student_probability_yes=probability_calculator(student,_student,"yes",class_comp);
			student_probability_no=probability_calculator(student,_student,"no",class_comp);
			
			credit_rating_probability_yes=probability_calculator(credit_rating,_credit_rating,"yes",class_comp);
			credit_rating_probability_no=probability_calculator(credit_rating,_credit_rating,"no",class_comp);
			
			
			total_yes_probability= (age_probability_yes*income_probability_yes*student_probability_yes*credit_rating_probability_yes);
			total_no_probability= (age_probability_no*income_probability_no*student_probability_no*credit_rating_probability_no);
			
			total_yes_probability*=prob_class_yes;
			total_no_probability*=prob_class_no;
			System.out.println("");		
			if(total_no_probability>total_yes_probability)
			{
				System.out.print( "Prediction of buying a computer for Tupples (Age = "+_age+", Income = "+_income+", Student = "+_student+", Credit Rating = "+_credit_rating+") is = NO   ,with Probability of -> "+total_no_probability);
			}
			else if(total_no_probability<total_yes_probability)
			{
				System.out.print( "Prediction of buying a computer for Tupples (Age = "+_age+", Income = "+_income+", Student = "+_student+", Credit Rating = "+_credit_rating+") is = YES  ,with Probability of -> "+total_yes_probability);
			}
			
		}
		
	}
}

class NAIVE_BAYSE
{
    public  static void main(String args[])throws FileNotFoundException,IOException
    {
        String file="naive_bayse_dataset.csv";
		String temp[]=new String[10];
		String income[]=new String[50000];
		String age[]=new String[50000];
		String student[]=new String[50000];
		String credit_rating[]=new String[50000];
		String class_comp[]=new String[50000];
		int i=0;
        File f= new File(file);
            Scanner sc= new Scanner(f);
            while(sc.hasNext())
            {
                String data=sc.next();
				temp=data.split(",");
				
				age[i]=temp[0];
				income[i]=temp[1];
				student[i]=temp[2];
				credit_rating[i]=temp[3];
				class_comp[i]=temp[4];
				i++;
                
            }
            sc.close();

			PREDICTOR P=new PREDICTOR(age,income,student,credit_rating,class_comp,i);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String n=br.readLine();
			/*P.array_printer(age,i);
			P.array_printer(income,i);
			P.array_printer(student,i);
			P.array_printer(credit_rating,i);
			P.array_printer(class_comp,i);*/
        }
        
}
