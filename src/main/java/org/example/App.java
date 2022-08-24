package org.example;
import java.util.Scanner;

import org.example.operations.Operations;
public class App 
{
	private static void checkChoice(int choice,float a,float b) {
		Operations op = new Operations();
		float result;
		switch(choice) {
		case 1:
			result=op.add(a, b);
			System.out.println("Addition: "+result);
			break;
		case 2:
			result=op.subtract(a, b);
			System.out.println("Subtraction : "+result);
			break;
		case 3:
			result = op.multiply(a, b);
			System.out.println("Multiplication : "+result);
			break;
		case 4:
			result=op.divide(a, b);
			System.out.println("Division: "+result);
			break;
		case 5:
			System.out.println("Exiting.................");
			System.exit(0);
			break;
		default:
			System.out.println("---Wrong Input------");
			System.exit(0);
			break;
				
		}
	}
    public static void main( String[] args )
    {
    	Scanner sc =new Scanner(System.in);
		float num1,num2;
		int select=0;
		System.out.println("----New Title Added---");
		while(true) {
			System.out.println("Calculator:  ");
			System.out.println("Enter two Numbers: ");
			System.out.println("Number 1: " );
			num1=sc.nextFloat();
			System.out.println("Number 2: " );
			num2=sc.nextFloat();
			System.out.println("Enter choice :1.Add 2.Sub 3.Multiply 4.Divide 5.exit" );
			select=sc.nextInt();
			checkChoice(select,num1,num2);
    }
}
    }
    
