class palindrome
{
   public static void main(String[] args)
      {
	    int num=212;
		int rev=0;
		for(int i=num;i!=0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		
		if(rev==num)
		{
			
			System.out.println("the given no is palindrome");
		}
		else
		{
			System.out.println("the given no is not palindrome");
		}
		
		  
	  }
}