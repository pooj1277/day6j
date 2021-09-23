package com.Day6LogicalProgram;

import utility.Utility;

public class LogicalProgram 
{
	public static void main( String[] args )
	{
		Utility utility = new Utility();
		int select;		
		boolean exit=false;
		do {
			//User Menu
			System.out.println("\n1. Fibonacci Series");
			System.out.println("2. Perfect Number");
			System.out.println("3. Prime Number");
			System.out.println("4. Reverse A Number");
			System.out.println("5. Coupan Numbers");
			System.out.println("6. Simulate Stopwatch Program");
			System.out.println("7. Exit");
			System.out.println("Slect Program to Run From Above: ");
			//call method using object
			select = utility.getIntValue();
			//taking menu option from the user to pass to switch
			if( select > 0 && select <= 5)
			{
				switch(select)
				{
				case 1:
					int n1=0,n2=1,count=10;
					System.out.println("The fibonacci Series is:");
					System.out.println(+n1+""+n2);
					utility.fibonacci(n1,n2,count);
					break;

				case 2:
					System.out.print("Enter the number : ");
					int number = utility.getIntValue();
					utility.perfectNumber(number);
					break;

				case 3:
					//calculating Euclidean distance using distance=sqrt(x*x + y*y)
					System.out.println("Enter value of 1st number: ");
					int x = utility.getIntValue();
					System.out.println("Enter value of 2nd number: ");
					int y = utility.getIntValue();
					//utility.euclideanDistance(x,y);
					break;

				case 4:
					System.out.println("Enter value of 1st number: ");
					double a = utility.getIntValue();
					System.out.println("Enter value of 2nd number: ");
					//double b = functionalutilty.getIntValue();
					System.out.println("Enter value of 3rd number:  ");
					//double c = functionalutilty.getIntValue();
					//functionalutilty.quadraticRoots(a,b,c);
					break;

				case 5:
					System.out.println("In progress...");
					break;
					
				case 6:
					break;

				case 7:
					exit=true;
					System.out.println("EXIT");
					break;
				}//switch

			}//if
			else
			{
				System.out.println("Invalid Selection");
			}
		}while(!exit);

	}
}
