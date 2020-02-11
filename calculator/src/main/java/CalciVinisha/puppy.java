package CalciVinisha;
import java.util.Scanner;



public class puppy
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers in which the operations need to be performed: ");
		// Scanning input from the user.
		int first = s.nextInt();
		
		int second = s.nextInt(); 
		
		oper operation=new oper(); // creating object to perform operations.
		
		// Setting the operands in the OperationsOfCalculator class Setter Method to perform operations.
		operation.setOperands(first, second);
		
		System.out.println("Choose the operation need to be performed: ");
		
		System.out.println("1. Addition.\n2. Subtraction.\n3. Multiplication.\n4. Division.\n");
		
		int choose_Operation = s.nextInt();
		
		switch(choose_Operation)
		{
			case 1:
				operation.additionOfTwoNumbers();
				break;
				
			case 2:
				operation.subtractionOfTwoNumbers();
				break;
			
			case 3:
				operation.multiplicationOfTwoNumbers();
				break;
				
			case 4:
				operation.divisionOfTwoNumbers();
				break;
			
			default:
				System.out.println("Choose operations from 1-4 only");
		}
	}

}