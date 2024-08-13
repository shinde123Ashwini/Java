
public class CountNumberOfDigit {
    //Reverse Program
	public static void main(String[] args) 
	{
		int no=12345;
		int count=0;
		int rev = 0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			count++;
		}
		System.out.println(rev);
		System.out.println(count);
		

	}

}
