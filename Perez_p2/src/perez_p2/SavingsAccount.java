package perez_p1;

public class SavingsAccount {

	static private double annualInterestRate;
	private double savingsBalance;
		
	public SavingsAccount(double amt)
	{
		this.savingsBalance = amt;
	}
	
	public void calculateMonthlyInterest()
	{
		double interest;
		interest = (this.savingsBalance * (annualInterestRate/100)/12);
		this.savingsBalance += interest;
	}
	
	public void showBalance()
	{
		System.out.printf("%.2f", this.savingsBalance);
	}
	
	public static void modifyInterestRate(double newRate)
	{
		annualInterestRate = newRate;
	}
}

class TestClass
{
	public static void main(String[] args)
	{
		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);
		SavingsAccount.modifyInterestRate(4.0);
		System.out.println("Month \t\t Saver1  Saver2");
		
		for(int i=1; i<=12; ++i)
		{
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.print("Month " + i + ": \t");
			saver1.showBalance();
			System.out.print("\t");
			saver2.showBalance();
			System.out.println();
		}
		
		System.out.println();
		
		//Changing interest Rate
		System.out.println("Setting the Interest Rate to 5.0%");
		System.out.println();
		SavingsAccount.modifyInterestRate(5.0);
		
		//Calculating new Savings Balance
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		//Displaying final output.
		System.out.print("Month 13: \t");
		saver1.showBalance();
		System.out.print("\t");
		saver2.showBalance();
		System.out.println();
	}
}
