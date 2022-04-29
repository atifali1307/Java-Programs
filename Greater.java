import java.util.Scanner;

class Number
{
	int num1,num2,num3;
	void input()
	{
		System.out.println("Enter Number1: ");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter Number2: ");
		num2=sc.nextInt();
		System.out.println("Enter Number2: ");
		num3=sc.nextInt();
	}
	void getGreater()
	{
		if(num1>num2)
		{
			if(num1>num3)
				System.out.println(num1+" is Greatest among three");
			else
				System.out.println(num3+" is Greatest");
		}
		else
		{
			if(num2>num3)
			{
				System.out.println(num2+" is Greatest");
			}
			else
			{
				System.out.println(num3+" is Greatest");
			}
		}
	}
}
public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n=new Number();
		n.input();
		n.getGreater();
	}

}