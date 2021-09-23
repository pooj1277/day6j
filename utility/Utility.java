package utility;
import java.util.Scanner;

public class Utility {
	//create scanner object
	Scanner scanner ;
	public Utility(){
		scanner = new Scanner(System.in);
		System.out.println("");
	}

	public int getIntValue() {

		return scanner.nextInt();
	}

	public void fibonacci(int n1, int n2, int count) {
		for(int i=2;i<count;i++) {
			int n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
	}

	public void perfectNumber(int number) {
		int i=1;
		long sum=0;
		while(i <= number/2){  
			if(number % i == 0) {  
				//calculates the sum of factors  
				sum = sum + i;  
			}
			i++;
		}
		if(sum==number)  
		{//prints if sum and number are equal  
			System.out.println(number+" is a perfect number.");  
		}  
		else  
			//prints if sum and n are not equal  
			System.out.println(number+" is not a perfect number.");   
	}

	public void primeNumber(int number1) {
		int i,m=0,flag=0;		      
		m=number1/2;      
		if(number1==0||number1==1){  
			System.out.println(number1+" is not prime number");      
		}else{  
			for(i=2;i<=m;i++){      
				if(number1%i==0){      
					System.out.println(number1+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(number1+" is prime number"); }  
		}

	}
}