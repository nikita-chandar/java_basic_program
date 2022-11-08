
import java.util.Scanner;
class Ex2
{
  public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	int ch;
	System.out.println(" Enter 1. For Addition \n Enter 2. For Multiplication  \n Enter 3. For Division  \n Enter 4. For Substraction   " );
	System .out.println("");
	ch=sc.nextInt();
	
	System.out.println("Enter no A");
	int a=sc.nextInt();
	System.out.println("Enter no b");
	int b=sc.nextInt();



	switch(ch)
	{ 
		case 1:
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case 2:
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case 3:
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		default:
			System.out.println("goodbye!!");
	}

 }
}