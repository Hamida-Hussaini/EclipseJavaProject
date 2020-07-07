package MathFuntions;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int x=console.nextInt();
		System.out.println("Enter second number: ");
		int y=console.nextInt();
		System.out.println("Select the Operator: ");
		char ch=console.next().charAt(0);
		int res;
		if(ch=='-')
		{
			Subtraction sub=new Subtraction();
			res=sub.sub(x,y);
			System.out.println("The diffrence is = "+res);
			
		}
		else if(ch=='+')
		{
			Addition add=new Addition();
			res=add.add(x,y);
			System.out.println("The sum is = "+res);
			
		}
		else if(ch=='*')
		{
			Multiplication mul=new Multiplication();
			res=mul.mul(x,y);
			System.out.println("The product is = "+res);
			
		}
		else if(ch=='/')
		{
			Division div=new Division();
			res=div.div(x,y);
			System.out.println("The division result is = "+res);
			
		}
		else
		{
			
			System.out.println("sorry invalid oprator enterd..");
		}
		
		

		
	}

}
