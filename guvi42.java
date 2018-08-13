import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
Scanner sc = new Scanner(System.in);
				/* Display message for user to take first 
		string input from keyboard */
		System.out.println("Enter First String :");
		String firstStr = sc.next();
		
		/* Display message for user to take first 
		string input from keyboard */
		System.out.println("Enter Second String :");
		String secondStr = sc.next();
		
		/* Display message for displaying result */
		System.out.println("Result after concatenation:");
		
		/* '+' operator concatenate string */
		System.out.println(firstStr+ " " + secondStr);
	}
}
