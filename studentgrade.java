StudentPackage:
import java.util.*;

class RegisterStudent 
{
   
    void total(int cd)
    {
              int TotalCredits=cd;
	try
		{
			if(TotalCredits>30)
		    {
			throw new CreditLimit(TotalCredits);
		    }
			else
			{
				System.out.println("The Total credit is:"+TotalCredits);
			}
		}
		catch(Exception e)
		{
			System.out.println("Total Credits is more than 30");
		}
     }
}
class CreditLimit extends Exception
{
	CreditLimit(int i)
   {
	   System.out.println("The Total credit is:"+i);
   }
}
public class student {

	static Scanner s;
	public static void main(String[] args) 
	{
		s = new Scanner(System.in);
		System.out.println("Enter the total credit:");
		int c=Integer.parseInt(s.next());
		RegisterStudent  r=new RegisterStudent ();
 r.total(c);
	}
}

ResultPackage:
import java.io.*;
import java.util.Scanner;
class grade 
{
	String sub1,sub2,sub3;
	Scanner s=new Scanner(System.in);
	void getGrade() 
	{
		 sub1="A";
		 sub2="A";
		 sub3="S";
	}
	void display()
	{
		System.out.println("Grade of Registered subject");
		System.out.println(" Grade of subject1:"+sub1);
		System.out.println(" Grade of subject2:"+sub2);
		System.out.println(" Grade of subject3:"+sub3);
	}
	void cgpa()
	{
		 double input;
	  	 Scanner scan = new Scanner(System.in); 
	        System.out.println("Enter an CGPA: ");
	        try
	        {
	        	input = Double.parseDouble(scan.next());
	        	if(input > 10)
	            	System.out.println("Not a valid CGPA!!");
	            else
	            System.out.println("CGPA is: " + input);	        	
	        }
	        catch (NumberFormatException e) 
	        {
	            System.out.println("Not a valid CGPA!!");
	        }
	}
}  
public class Result {

	public static void main(String[] args)
	{		
      grade g=new grade();
      g.getGrade();
      g.display();
      g.cgpa();
	}

}
