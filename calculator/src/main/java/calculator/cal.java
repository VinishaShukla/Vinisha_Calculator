package calculator;

import java.util.Scanner;
class add 	{
	void addition(int a,int b)
	{
		System.out.print("Addition is  :"+ (a+b));
	}
}

 class sub {
	void subtract(int a,int b)
	{
		System.out.print("Subtract is  :"+ (a-b));		
	}
}
 class mul {
	void multiply(int a,int b)
	{
		System.out.print("Multiplication is  :"+ a*b);
	}
}
 class div {
	void divide(int a,int b)
	{
		System.out.print("Division is  :"+ a/(double)b);		
	}
}

 class cal {
	public static Scanner sc;
	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		System.out.print("Enter num1 :");
		int n1 = sc.nextInt();
		System.out.print("Enter num2 :");
		int n2 = sc.nextInt();
		System.out.print("Enter op :");
        char op = sc.next().charAt(0);
		switch (op) { 		
	    case '+':
	        add a = new add();
	        a.addition(n1, n2);
	        break;
	    case '-':
	        sub b = new sub();
	        b.subtract(n1, n2);
	        break;
	    case '*':
	        mul c = new mul();
	        c.multiply(n1, n2);
	        break;
	    case '/':
	        div d = new div();
	        d.divide(n1, n2);
	        break;
	    default:
	        System.out.printf("----");
	    }
	}


}
