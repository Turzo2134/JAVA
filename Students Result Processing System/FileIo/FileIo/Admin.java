//import flush.*;
//import java.lang.*;
//import fileio.*;
//import Studentresult.*;
import java.util.Scanner;

public class Admin extends StartProject
{
	//public static void main(String [] args)
	public void showAdmin() throws Exception
	
	{
		//FileInputOutput  frwd = new FileInputOutput ();
	
		/*ProjectMenu obj = new ProjectMenu();
		Result obj1 = new Result();
		Attendance obj2 = new Attendance();
		Schedule obj3 = new Schedule();
		Faculty obj4 = new Faculty();
		
		obj.disp();
		obj1.disp();
		obj2.disp();
		obj3.disp();
		obj4.disp();*/
        	
		
		
		System.out.println("\t\t-----Admin----------");
		System.out.println("           5.View admin details");
		
		
		Scanner input = new Scanner (System.in);
		int b;
		System.out.print("Choose a option : ");
		b=input.nextInt();
		
		if(b>=1 && b<=9)
		{
			
			
			
			
			if(b==5) 
			{
				System.out.println("          -----Admin-----");
				
				System.out.println("          1.Personal Details");
				System.out.println("          2.Add student");
				System.out.println("          3.Remove Student");
				
				Scanner input0 = new Scanner (System.in);
				int b0;
				System.out.print("Choose a option : ");
				b0=input0.nextInt();
				
				if(b0==1) 
				{
					System.out.println("       Developers");
					System.out.println("       Ajoy Roy");
					System.out.println("       Turzo Roy");
					
				}
				else if(b0==2) 
				{
					Scanner input00 = new Scanner (System.in);
					String b00;
					System.out.println("Students name");
					System.out.print("- ");
					b00=input00.nextLine();
					
					Scanner input000 = new Scanner (System.in);
					String b000;
					System.out.println("Student's Id");
					System.out.print("- ");
					b000=input000.nextLine();
					System.out.println("*****Student added succesfully!*****");
				}
				else if(b0==3) 
				{
					Scanner input00 = new Scanner (System.in);
					String b00;
					System.out.println("Students Name");
					System.out.print("- ");
					b00=input00.nextLine();
					
					Scanner input000 = new Scanner (System.in);
					String b000;
					System.out.println("Students Id");
					System.out.print("- ");
					b000=input000.nextLine();
					System.out.println("*****Student removed succesfully!*****");
				}
				else
				{
					System.out.println("!!! Program Crashed !!!");
				}
			}
			
			
		}
		
	}
}