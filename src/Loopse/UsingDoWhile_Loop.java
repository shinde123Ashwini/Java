package Loopse;

public class UsingDoWhile_Loop {

	public static void main(String[] args)
	{
		int a=12345; int rev=0; int rem;
		do
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			System.out.println(a);	
		}
		while(a!=0);
	}

}
