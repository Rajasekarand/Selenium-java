package Wee1.Day1;
import java.util.*;
import java.io.*;

public class Statements {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int value= 50;
		if (value%2==0)
		{
			
			System.out.println("the number is even and the even number between given value is");
			for(int i=0;i<=50;i++)
			{
				if(i % 2==0)
				System.out.println("Even number:" +i);
			}
		}
		else
		{
			System.out.println("the number is odd");
		}
	}

}
