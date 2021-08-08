package Wee1.Day1;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		int sum ,rem=0,total=0;
		System.out.println("Enter the value to find the sum:");
		sum=s.nextInt();
		System.out.println("The Given value is :"+ sum);
		while(sum>0)
		{
			
			rem=sum%10;
			total=total+rem;
			sum=sum/10;
		}
		System.out.println("The sum of value is:"+ total);
	}

}
