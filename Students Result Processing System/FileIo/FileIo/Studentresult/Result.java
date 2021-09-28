package Studentresult;
import java.util.Scanner;
//javac ProjectHome.java
public class Result
{
	public static void disp ()
	
	{
		
		System.out.println("\t\t\t\t-----Student-----");
		System.out.println("\t\t1.View result");
	System.out.println("\t\t2.View attendance");
		System.out.println("\t\t3.View schedule");
		
		System.out.println("\t\t\t\t-----Faculty----------");
		System.out.println("\t\t4.View faculty details");
		
		
		System.out.println("\t\t\t\t-----Admin----------");
		System.out.println("\t\t5.View admin details");
		
		
		Scanner input = new Scanner (System.in);
		int b;
		System.out.print("Choose a option : ");
		b=input.nextInt();
		
		if(b>=1 && b<=9)
		{
			if(b==1) //Student
			{
				System.out.println("\t\t\t\t-----Student-----");
				System.out.println("Select a option");
				System.out.println("\t\t1.Cs Department");
				System.out.println("\t\t2.English Department");
				System.out.println("\t\t3.BBA Department");
				
				Scanner input0 = new Scanner (System.in);
				int b0;
				System.out.print("Choose a option : ");
				b0=input0.nextInt();
				
				if(b0==1) //Result
				{
					System.out.println("Choose a subject");
					System.out.println("\t\t1.C++");
					System.out.println("\t\t2.Java");
					System.out.println("\t\t3.Database");
					
					Scanner input1 = new Scanner (System.in);
					int b1;
					System.out.print("Choose a option : ");
					b1=input1.nextInt();
					
					if(b1==1) 
					{
						System.out.println("\t\t-----C++-----");
						System.out.println("\tStudent Name : Ajoy Roy");
						System.out.println("\tSection : B");
						System.out.println("\tID: 19-40403-1");
						System.out.println("\tRoll:1");
						System.out.println("\tMarkes obtained:88");
						System.out.println("\tPass");
					}
					else if(b1==2) 
					{
						System.out.println("\t\t-----Java-----");
						System.out.println("\tStudent Name : Turzo Roy");
						System.out.println("\tSection : CC");
						System.out.println("\tID: 19-40403-1");
						System.out.println("\tRoll:3");
						System.out.println("\tMarkes obtained:92");
						System.out.println("\tPass");
						
					}
					else if(b1==3) 
					{
						System.out.println("\t\t-----Database-----");
						System.out.println("\tStudent Name : Ajoy Roy");
						System.out.println("\tSection : A");
						System.out.println("\tID: 19-40403-1");
						System.out.println("\tRoll:6");
						System.out.println("\tMarkes obtained:95");
						System.out.println("\tPass");
					}
					else
					{
						System.out.println("!!! Program Crashed !!!");
					}
				}
				else if(b0==2) 
				{
					System.out.println("\t\t-----English-----");
					System.out.println("\tStudent Name : Ajoy Roy");
						System.out.println("\tSection : G");
						System.out.println("\tID: 19-40403-1");
						System.out.println("\tRoll:6");
						System.out.println("\tMarkes obtained:78");
						System.out.println("\tPass");
				}
				else if(b0==3)
				{
					System.out.println("\t\t-----Accounting-----");
					System.out.println("\tStudent Name : Ajoy Roy");
						System.out.println("\tSection : G");
						System.out.println("\tID: 19-40403-1");
						System.out.println("\tRoll:11");
						System.out.println("\tMarkes obtained:76");
						System.out.println("\tPass");
				}
				else
				{
					System.out.println("!!! Program Crashed !!!");
				}
			}
			
			
		}
		
	}
}