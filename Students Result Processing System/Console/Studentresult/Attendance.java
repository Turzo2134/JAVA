package Studentresult;
import java.util.Scanner;
public class Attendance
{
	public static void disp ()
	
	{
	
		
		System.out.println("      2.View attendance");
		
		
		
		Scanner input = new Scanner (System.in);
		int b;
		System.out.print("Choose a option : ");
		b=input.nextInt();
		
		if(b>=1 && b<=9)
		{
		
			
			if(b==2) 
			{
				System.out.println("         -----Attendance-----");
				System.out.println("Select a option");
				System.out.println("         1.Total class and attendence");
				System.out.println("         2.Absent");
				System.out.println("         3.Mark");
				
				Scanner input0 = new Scanner (System.in);
				int b0;
				System.out.print("Choose a option : ");
				b0=input0.nextInt();
				
				if(b0==1) 
				{
					
					System.out.println("        -----Total class-----");
					System.out.println("        10 days");
					System.out.println("        -----Attende-----");
					System.out.println("        8 Days");
					
					
				}
				else if(b0==2) 
				{
					System.out.println("       -----Absent-----");
					System.out.println("       Number Of absent : 2");
					
				}
				else if(b0==3) 
				{
					System.out.println("       -----Marks obtained-----");
					System.out.println("       8 mark");
					
					
					
				}
				else
				{
					System.out.println("!!! Program Crashed !!!");
				}
			}
			
			
			
			
		}
		
	}
}