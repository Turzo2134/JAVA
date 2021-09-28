package Studentresult;
import java.util.Scanner;

public class ProjectMenu
{
	@SuppressWarnings("resource")
	public void disp ()
	{
	
		System.out.println("\t\t\t\t_____Student's Result Processing System____");
		Scanner input = new Scanner (System.in);

		int a;
		System.out.println("Enter 0 to LOG-IN");
		System.out.println("Enter 1 to Register");
		a=input.nextInt();

		if(a==0)
		{
			Scanner input0 = new Scanner (System.in);
			System.out.print("\tEnter User ID :       ");
			input0.nextLine();

			Scanner input00 = new Scanner (System.in);
			System.out.print("\tEnter Password :       ");
			input00.nextLine();
		}
		 if(a==1)
		{
			Scanner input1 = new Scanner (System.in);
			System.out.print("\tEnter User ID: ");
			input1.nextLine();

			Scanner input11 = new Scanner (System.in);
			System.out.print("\tEnter Password : ");
			input11.nextLine();
		}
		
		else if(a==2)
		{
			Scanner input22 = new Scanner (System.in);
			System.out.print("\tEnter User ID: ");
			a=input22.nextInt();

			new Scanner (System.in);
			System.out.print("\tEnter Password : ");
			input22.nextLine();
		}
		else
		{
			System.out.print("\t!!! INVALID !!!");
		}
	}
}

