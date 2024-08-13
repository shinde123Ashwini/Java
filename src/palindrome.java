
public class palindrome {

	public static void main(String[] args) 
	{
		int no=1234;
		
		int rev=0;
		
	  while(no!=0)
	  {
		  int rem=no%10;//getting remainder
		  rev=rev*10+rem;
		  no=no/10;
		  	  
	  }
	  System.out.println(rev);
	  if(rev==no)
	  {
		  System.out.println("This the pallindromnumber");
	  }
	  else
	  {
		  System.out.println("This not palondrome Number");
	  }
		 

	}

}
