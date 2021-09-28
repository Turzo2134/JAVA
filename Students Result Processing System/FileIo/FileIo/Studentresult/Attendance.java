package Studentresult;
import java.util.Scanner;
public class Attendance
{
	public static void disp ()
	
	{
	
		
		System.out.println("\t\t\t\t2.View attendance");
		
		
		
		Scanner input = new Scanner (System.in);
		int b;
		System.out.print("Choose a option : ");
		b=input.nextInt();
		
		if(b>=1 && b<=9)
		{
		
			
			if(b==2) 
			{
				System.out.println("\t\t\t\t-----Attendance-----");
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
					
					System.out.println("\t\t-----Total class-----");
					System.out.println("\t10 days");
					System.out.println("\t\t-----Attende-----");
					System.out.println("\t8 Days");
					
					
				}
				else if(b0==2) 
				{
					System.out.println("\t\t-----Absent-----");
					System.out.println("\tNumber Of absent : 2");
					
				}
				else if(b0==3) 
				{
					System.out.println("\t\t-----Marks obtained-----");
					System.out.println("\t8 mark");
					
					
					
				}
				else
				{
					System.out.println("!!! Program Crashed !!!");
				}
			}
			
			
			
			
		}
		
	}
}