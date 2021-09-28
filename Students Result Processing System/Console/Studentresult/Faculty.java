package Studentresult;
import java.util.Scanner;
public class Faculty
{
	public static void disp ()
	
	{
		
		
		
		System.out.println("          -----Faculty----------");
		System.out.println("          4.View faculty details");
		
		
		
		
		
		Scanner input = new Scanner (System.in);
		int b;
		System.out.print("Choose a option : ");
		b=input.nextInt();
		
		if(b>=1 && b<=9)
		{
			
			
			if(b==4) 
			{
				System.out.println("       -----Faculty-----");
				
				System.out.println("       1.View Personal Details");
				System.out.println("       2.Set Results");
				System.out.println("       3.Set Schedules");
				
				
				Scanner input0 = new Scanner (System.in);
				int b0;
				System.out.print("Choose your option : ");
				b0=input0.nextInt();
				
				if(b0==1) 
				{
					System.out.println("        Name:Md. Nazmul Hossain");
					System.out.println("        ID:165678-8920");
					System.out.println("        Department:CS");
					System.out.println("        Position:Lecturer");
					
					
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