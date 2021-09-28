package Studentresult;
import java.util.Scanner;
public class Schedule
{
	public static void disp ()
	
	{
		
		
		System.out.println("               3.View schedule");
		
		
		
		
		Scanner input = new Scanner (System.in);
		int b;
		System.out.print("Choose a option : ");
		b=input.nextInt();
		
		if(b>=1 && b<=9)
		{
			
			
			if(b==3) 
			{
				System.out.println("           -----Student-----");
				System.out.println("           View Schedule");
				System.out.println("           1.Exam");
				System.out.println("           2.Class");
				System.out.println("           3.Viva");
				
				Scanner input0 = new Scanner (System.in);
				int b0;
				System.out.print("Choose a option : ");
				b0=input0.nextInt();
				
				if(b0==1) 
				{
					System.out.println("Choose a department");
					System.out.println("          1.Cs Department");
				System.out.println("              2.English Department");
				System.out.println("              3.BBA Department");
					
					Scanner input1 = new Scanner (System.in);
					int b1;
					System.out.print("Choose a option : ");
					b1=input1.nextInt();
					
					if(b1==1) 
					{
						System.out.println("       -----Java-----");
						System.out.println("       Quiz: 22 october");
						System.out.println("       Syllabus : Classes");
						System.out.println("       Question pattern:MCQ");
						System.out.println("       Time : 20 min");
						System.out.println("       Note:Cheating is strictly prohibited ");
			
					}
					else if(b1==2) 
					{
						System.out.println("          -----English-----");
						System.out.println("          Quiz: 21 october");
						System.out.println("          Syllabus : Idioms and phrases");
						System.out.println("          Question pattern:Fill in the gaps");
						System.out.println("          Time : 20 min");
						System.out.println("          Note:Cheating is strictly prohibited ");
					}
					else if(b1==3) 
					{
						System.out.println("             -----Accounting-----");
						System.out.println("             Quiz: 21 october");
						System.out.println("             Syllabus : Balance Sheet");
						System.out.println("             Question pattern:Written");
						System.out.println("             Time : 20 min");
						System.out.println("             Note:Cheating is strictly prohibited ");
					}
					else
					{
						System.out.println("!!! Program Crashed !!!");
					}
				}
				else if(b0==2) 
				{
					System.out.println("     -----Classes-----");
					System.out.println("     Sunday to Wednesday");
					System.out.println("     Time : 8.00am-3.00pm");
					System.out.println("     Break:2.00pm-2.20pm");
					
				}
				else if(b0==3) 
				{
					System.out.println("        -----Viva-----");
					System.out.println("     The day before final term assesment");
					
				}
				else
				{
					System.out.println("!!! Program Crashed !!!");
				}
			}
			
		
			
			
		}
		
	}
}