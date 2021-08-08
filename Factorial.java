package Wee1.Day1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact,f1=1,i;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value to find the factorial:");
		fact=s.nextInt();
		for(i=1;i<=fact;i++)
		{
			
			f1=f1*i;
		}
		System.out.println("the factorial value of "+fact+" is:"+f1);
	}

}
