package MathFunctions;
import java.util.*;
public class Addition {

	public static void main(String []args)
	{
		Scanner console=new Scanner(System.in);  
		
		System.out.println("Enter a Number");
		int a=console.nextInt();
		System.out.println("Enter a Number");
		int b=console.nextInt();
		int sum=a+b;
		System.out.println("The sum is "+sum);
	}
}
