import java.util.LinkedList;
import java.util.Scanner;

class Employee
{
	String name;
	int age,yoe;
	String qual;
	float salary;
	Employee(String n,String qual, int age, int yoe,float salary)
	{
	name = n;
	this.age =age;
	this.yoe = yoe;
	this.qual = qual;
	this.salary = salary;
	}
}
public class TestEmployee {
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
   
    System.out.println("Enter the number of employees");
    int n1 = Integer.parseInt(sc.nextLine());
      System.out.println("N= "+n1);
     Employee e[]= new Employee[n1];
     LinkedList<Employee> emp= new LinkedList<Employee>();
     for(int i=0 ;i<n1;i++)
     {
    	 System.out.println("enter the "+(i+1)+" Employee detail");
    	 System.out.println("enter the "+(i+1)+" Employee name");
    	    String name = sc.next();
    	    System.out.println("enter the "+(i+1)+" Employee age>20 and <60");
	  	    int age=sc.nextInt();
	  	  System.out.println("enter the "+(i+1)+" Employee years of experience ");
    		int yoe=sc.nextInt();
    		System.out.println("enter the "+(i+1)+" Employees valid degree");
    		String qual=sc.next();
    		System.out.println("enter the "+(i+1)+" Employee's salary");
    		float salary=sc.nextFloat();
    	 e[i] = new Employee(name,qual,age,yoe,salary);
    	 emp.add(e[i]);
     }
     System.out.println("Employee details with years of experience > 5 are: ");
       
     for(Employee v : emp)
     {
    	 if(v.yoe>5)
    	 System.out.println("Employee details is "+v);
    	     	 
     }
     sc.close();
     
	}

}
