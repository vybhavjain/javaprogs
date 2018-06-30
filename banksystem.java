import java.util.Scanner;
			
	class Account
	{
		int accno;
		String name;
		long phone;
		float balance_amt;
		Scanner s = new Scanner(System.in);
		void getinput()
		{
			System.out.println("Enter the accno");
			accno = s.nextInt();
			System.out.println("Enter name");
			name = s.nextLine();
			System.out.println("Enter phone");
			phone = s.nextLong();
			System.out.println("Enter balance amount");
			balance_amt = s.nextFloat();
		}
		void deposit(float amount)
		{
			balance_amt+=amount;
		}
		void withdraw(float amount)
		{ float val = balance_amt-amount;
			if(val>1000 && val > balance_amt)
			{
				balance_amt -=val;
				
			}
			else
				System.out.println("Insufficient Balance");
		}
		void print()
		{
			System.out.println("The amount in "+name+" with phone no "+phone+ "has "+balance_amt+" in the account "+accno);
			
		}
	}
	public class BankInfo {
	
		
		
		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    Account ac = new Account();
	    ac.getinput();
	    System.out.println("enter the amount to be deposited");
	    float amount = s.nextFloat();
	    ac.deposit(amount);
	    System.out.println("enter the amount to be withdrawn");
	    amount = s.nextFloat();
	    ac.withdraw(amount);
	    ac.print();
	    
		}
	
	}
