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
				System.out.println("\t\t\t\t-----Student-----");
				System.out.println("\t\tView Schedule");
				System.out.println("\t1.Exam");
				System.out.println("\t2.Class");
				System.out.println("\t3.Viva");
				
				Scanner input0 = new Scanner (System.in);
				int b0;
				System.out.print("Choose a option : ");
				b0=input0.nextInt();
				
				if(b0==1) 
				{
					System.out.println("Choose a department");
					System.out.println("\t\t1.Cs Department");
				System.out.println("\t\t2.English Department");
				System.out.println("\t\t3.BBA Department");
					
					Scanner input1 = new Scanner (System.in);
					int b1;
					System.out.print("Choose a option : ");
					b1=input1.nextInt();
					
					if(b1==1) 
					{
						System.out.println("\t\t -----Java-----");
						System.out.println("\tQuiz: 22 october");
						System.out.println("\tSyllabus : Classes");
						System.out.println("\tQuestion pattern:MCQ");
						System.out.println("\tTime : 20 min");
						System.out.println("\tNote:Cheating is strictly prohibited ");
			
					}
					else if(b1==2) 
					{
						System.out.println("\t\t-----English-----");
						System.out.println("\tQuiz: 21 october");
						System.out.println("\tSyllabus : Idioms and phrases");
						System.out.println("\tQuestion pattern:Fill in the gaps");
						System.out.println("\tTime : 20 min");
						System.out.println("\tNote:Cheating is strictly prohibited ");
					}
					else if(b1==3) 
					{
						System.out.println("\t\t-----Accounting-----");
						System.out.println("\tQuiz: 21 october");
						System.out.println("\tSyllabus : Balance Sheet");
						System.out.println("\tQuestion pattern:Written");
						System.out.println("\tTime : 20 min");
						System.out.println("\tNote:Cheating is strictly prohibited ");
					}
					else
					{
						System.out.println("!!! Program Crashed !!!");
					}
				}
				else if(b0==2) 
				{
					System.out.println("\t\t-----Classes-----");
					System.out.println("\tSunday to Wednesday");
					System.out.println("\tTime : 8.00am-3.00pm");
					System.out.println("\tBreak:2.00pm-2.20pm");
					
				}
				else if(b0==3) 
				{
					System.out.println("\t\t-----Viva-----");
					System.out.println("\tThe day before final term assesment");
					
				}
				else
				{
					System.out.println("!!! Program Crashed !!!");
				}
			}
			
		
			
			
		}
		
	}
}