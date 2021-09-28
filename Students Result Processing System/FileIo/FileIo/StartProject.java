import java.io.*;
import java.util.Scanner;

public class StartProject
{
    public static void main(String[] args) throws Exception
	{
        User User = new User();
		Admin Admin= new Admin();
		String adminCode = "012345";
        String adminId = "19-40403-1";
		String adminPass = "20421741";
        String country, name="Bangladesh", email, mobile, pass="12345";
        Scanner sc = new Scanner (System.in);

        for(;;)
		{
            System.out.println("Press 1 to access Admin");
            System.out.println("Press 2 to Sign-up");
            System.out.println("Press 3 to Log-in");
			System.out.println("Press 4 to Exit");
            System.out.print("Press: ");
			String press = sc.nextLine();
            
			destroy();                                                   
			
            if(press.equals("1"))
			{
				File f = new File("Menu.txt");
				f.createNewFile();
				FileWriter w = new FileWriter(f);
				
				System.out.println("\nWarning! Authorized Personnel Only");
				System.out.print("Code: "); //012345
				String s = sc.nextLine();
				destroy();                                                   
				if(s.equals(adminCode))
				{
					System.out.println("\nWelcome Sir!");
					System.out.print("ID: "); 
					String s1 = sc.nextLine();
					System.out.print("Password: "); 
					String s2 = sc.nextLine();
					destroy();                                                   
					if(s1.equals(adminId) && s2.equals(adminPass))
					{
						System.out.println("\nWelcome! "+adminId);
						Admin.showAdmin();
					}
				}
				else
				{
					System.out.println("Invalid input! Try again\n");
				}
            }
			
            else if(press.equals("2"))
			{
				File f = new File("Menu.txt");
				f.createNewFile();
				FileWriter w = new FileWriter(f);
			
                System.out.print("Name: ");
                name = sc.nextLine();
				w.write(name+"\n");
				
                System.out.print("Email: ");
                email = sc.nextLine();
				w.write(email+"\n");
				
				System.out.print("Password: ");
                pass = sc.nextLine();
				w.write(pass+"\n");
				
                System.out.print("Mobile: ");
                mobile = sc.nextLine();
				w.write(mobile+"\n");
				
                System.out.print("Country: ");
                country = sc.nextLine();
				w.write(country+"\n");
				w.close();
				
				destroy();                                                   
            }
			
            else if(press.equals("3"))
			{
                System.out.print("Name: "); 
                String str1 = sc.nextLine();
                System.out.print("Password: "); 
                String str2 = sc.nextLine();
				destroy();                                                   
                if(str1.equals(name) && str2.equals(pass))
				{
					System.out.println("Welcome!"+name);
                    User.showUser();
                }
            }
			
			else if(press.equals("4"))
			{
				destroy();                                                  
				System.out.println("Exiting...");
				System.exit(0);
			}
            else
			{
                System.out.println("Invalid input! Try again\n");
            }
        }
    }
	
	public static void destroy() //edit start
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	} //edit end
}