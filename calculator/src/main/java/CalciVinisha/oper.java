package CalciVinisha;

public class oper {
	static int first;
	static int second;
	
	public void setOperands(int first, int second)
	{
		this.first = first;
		this.second = second;	
	}
	
	public void additionOfTwoNumbers() 
	{
		System.out.println("The Addition operation between the two numbers "+first+" and "+second+" is: "+(first+ second));
	}
	
	public void subtractionOfTwoNumbers()
	{
		System.out.println("The Subtraction operation between the two numbers "+first+" and "+second+" is: "+(first - second));
	}
	
	public void multiplicationOfTwoNumbers()
	{
		System.out.println("The Multiplication operation between the two numbers "+first+" and "+second+" is: "+(first * second));
	}
	
	public void divisionOfTwoNumbers()
	{
		try {
			System.out.println("The Division operation between the two numbers "+first+" and "+second+" is: "+(first / second));
		}
		catch(Exception e)
		{
			System.out.println("Second Number cannot be 0");
		}
	}
}
