import Studentresult.*;
import java.util.Scanner;
public class User extends StartProject
{
	//public static void disp ()
	public void showUser() throws Exception
	
	{
		ProjectMenu obj = new ProjectMenu();
		Result obj1 = new Result();
		Attendance obj2 = new Attendance();
		Schedule obj3 = new Schedule();
		//Faculty obj4 = new Faculty();
		
		obj.disp();
		obj1.disp();
		obj2.disp();
		obj3.disp();
		//obj4.disp();
		
		
		System.out.println("\t\t\t\t-----Faculty----------");
		System.out.println("\t\t4.View faculty details");
		
		
		
		
		
		Scanner input = new Scanner (System.in);
		int b;
		System.out.print("Choose a option : ");
		b=input.nextInt();
		
		if(b>=1 && b<=9)
		{
			
			
			if(b==4) 
			{
				System.out.println("\t\t-----Faculty-----");
				
				System.out.println("\t1.View Personal Details");
				System.out.println("\t2.Set Results");
				System.out.println("\t3.Set Schedules");
				
				
				Scanner input0 = new Scanner (System.in);
				int b0;
				System.out.print("Choose your option : ");
				b0=input0.nextInt();
				
				if(b0==1) 
				{
					System.out.println("\tName:Md. Nazmul Hossain");
					System.out.println("\tID:165678-8920");
					System.out.println("\tDepartment:CS");
					System.out.println("\tPosition:Lecturer");
					
					
				}
				else if(b0==2) 
				{
					Scanner input00 = new Scanner (System.in);
					String b00;
					System.out.println("Student Name");
					System.out.print("- ");
					b00=input00.nextLine();
					
					Scanner input000 = new Scanner (System.in);
					String b000;
					System.out.println("Mark");
					System.out.print("- ");
					b000=input000.nextLine();
					System.out.println("*****Result updated successfully!*****");
				}
				else if(b0==3) 
				{
					Scanner input00 = new Scanner (System.in);
					String b00;
					System.out.println("Enter 4 digit Class Code");
					System.out.print("- ");
					b00=input00.nextLine();
					
					Scanner input000 = new Scanner (System.in);
					String b000;
					System.out.println("Set Time");
					System.out.print("- ");
					b000=input000.nextLine();
					System.out.println("*****Schedule updated successfully!*****");
				}
				else
				{
					System.out.println("!!! Program Crashed !!!");
				}
			}
			
			
		
			
			
		}
		
	}
}