import java.util.Scanner;
class Week
	{
		public static void main(String[] args)
		
		{
			
			System.out.println("enter when you want holidays...");
			
		
			System.out.println("1.monday  \n2.sunday  \n3.tuesday  \n4.thursday  \n5.wensday  \n6.nfriday \n7.saturday");
			System.out.println("enter your choice");
			int day;
		  Scanner sc=new Scanner(System.in);
		   day=sc.nextInt();
		   
	  
	  
	  switch(day)
	     {
		    case 1:System.out.println("sunday");
			     break;
				 
			case 2:System.out.println("monday");
                 break;
            
			case 3:System.out.println("tuesday");
				break;
				
			case 4:System.out.println("thursday");
				break;
				
		    case 5:System.out.println("wensday");
				break;
				
			case 6:System.out.println("friday");
				break;
					
		    case 7:System.out.println("Saturday");
				break;
				
			default:
                    System.out.println("\nWaiting for weekends......");			
		 }
		            System.out.println(".....");
		}
	}