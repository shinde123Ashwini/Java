
public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int a=371;
		int sum=0;
		int no=a;
		int rev=0;
		while(a!=0)
		{
			int rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
		}
		System.out.println(sum);
		if(no==sum)
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("ArmStrong  not Number");
		}
		

	}

}
