package CodSoft;
import java.util.*;
public class Task3_ATM_Interface {	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("THE ATM");
		System.out.print("Enter name of the Account Holder : ");
		String name=in.nextLine();
		System.out.print("Enter Balance : ");
		double bal=in.nextDouble();
		
		BankAccount a= new BankAccount(name,bal); 
		while (true)
		{
			System.out.println("\nATM MENU");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("\nPlease choose an option : ");
			int ch=in.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.print("Enter amount to Withdraw : ");
				double wdAmt=in.nextDouble();
				a.withdraw(wdAmt);
				break;
			}
			case 2: 
			{
				System.out.print("Enter amount to Deposit : ");
				double dpAmt=in.nextDouble();
				a.deposit(dpAmt);
				break;
			}
			case 3: 
			{
				System.out.print("\nChecking the Balance : ");
				a.checkBalance();
				break;
			}
			case 4: {
				System.out.println("\nThank you for using the ATM. Have a Good Day. ");
				return;
			}
			default:System.out.println("Invalid choice. please choose the correct option.");
		}
	}
}

public static class BankAccount
{
	String accHolder;
	double balance;
	 BankAccount(String name,double bal)
	{
		accHolder=name;
		balance=bal;
	}
	 void deposit (double amount)
	 {
		 if (amount>0)
		 {
			 balance+=amount;
			 System.out.println("\nSuccessfully deposited : "+amount);
		 }
		 else 
		 {
			 System.out.println("\nInvalid amount! ");
		 }
	 }
	 void withdraw(double amount)
	 {
		 if(amount>0&&amount<=balance)
		 {
			 balance-=amount;
			 System.out.println("\nSuccessfully withdrawn : "+amount);
		 }
		 else if(amount>balance)
		 {
			 System.out.println("\nInsufficient balance.");
		 }
		 else
		 {
			 System.out.println("Invalid amount.");
		 }
	 }
	 void checkBalance()
	 {
		 System.out.println("\nCurrent Balance: "+balance);
	 }
	}
}

