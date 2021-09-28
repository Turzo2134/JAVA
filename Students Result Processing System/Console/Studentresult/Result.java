package Studentresult;
import java.util.Scanner;
//javac ProjectHome.java
public class Result
{
	public static void disp ()
	
	{
		
		System.out.println("         -----Student-----");
		System.out.println("         1.View result");
	System.out.println("             2.View attendance");
		System.out.println("         3.View schedule");
		
		System.out.println("         -----Faculty----------");
		System.out.println("         4.View faculty details");
		
		
		System.out.println("         -----Admin----------");
		System.out.println("         5.View admin details");
		
		
		Scanner input = new Scanner (System.in);
		int b;
		System.out.print("Choose a option : ");
		b=input.nextInt();
		
		if(b>=1 && b<=9)
		{
			if(b==1) //Student
			{
				System.out.println("         -----Student-----");
				System.out.println("Select a option");
				System.out.println("         1.Cs Department");
				System.out.println("         2.English Department");
				System.out.println("         3.BBA Department");
				
				Scanner input0 = new Scanner (System.in);
				int b0;
				System.out.print("Choose a option : ");
				b0=input0.nextInt();
				
				if(b0==1) //Result
				{
					System.out.println("Choose a subject");
					System.out.println("        1.C++");
					System.out.println("        2.Java");
					System.out.println("        3.Database");
					
					Scanner input1 = new Scanner (System.in);
					int b1;
					System.out.print("Choose a option : ");
					b1=input1.nextInt();
					
					if(b1==1) 
					{
						System.out.println("       -----C++-----");
						System.out.println("       Student Name : Ajoy Roy");
						System.out.println("       Section : B");
						System.out.println("       ID: 19-40403-1");
						System.out.println("       Roll:1");
						System.out.println("       Markes obtained:88");
						System.out.println("       Pass");
					}
					else if(b1==2) 
					{
						System.out.println("       -----Java-----");
						System.out.println("       Student Name : Ajoy Roy");
						System.out.println("       Section : CC");
						System.out.println("       ID: 19-40403-1");
						System.out.println("       Roll:3");
						System.out.println("       Markes obtained:92");
						System.out.println("       Pass");
						
					}
					else if(b1==3) 
					{
						System.out.println("         -----Database-----");
						System.out.println("         Student Name : Ajoy Roy");
						System.out.println("         Section : A");
						System.out.println("         ID: 19-40403-1");
						System.out.println("         Roll:6");
						System.out.println("         Markes obtained:95");
						System.out.println("         Pass");
					}
					else
					{
						System.out.println("!!! Program Crashed !!!");
					}
				}
				else if(b0==2) 
				{
					System.out.println("          -----English-----");
					System.out.println("          Student Name : Ajoy Roy");
						System.out.println("      Section : G");
						System.out.println("      ID: 19-40403-1");
						System.out.println("      Roll:6");
						System.out.println("      Markes obtained:78");
						System.out.println("      Pass");
				}
				else if(b0==3)
				{
					System.out.println("             -----Accounting-----");
					System.out.println("             Student Name : Ajoy Roy");
						System.out.println("         Section : G");
						System.out.println("         ID: 19-40403-1");
						System.out.println("         Roll:11");
						System.out.println("         Markes obtained:76");
						System.out.println("         Pass");
				}
				else
				{
					System.out.println("!!! Program Crashed !!!");
				}
			}
			
			
		}
		
	}
}