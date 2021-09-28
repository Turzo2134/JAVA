import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form2 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JTextField t1,t2;
		JButton b1,b2,b3,b4; 
		JPanel p1;

	public Form2()
	{
		super(" Student Login Page ");
		this.setSize(450,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1 = new JPanel();
		p1.setSize(new Dimension(450,400));
		p1.setBackground(Color.red);
		p1.setLayout(null);

		l1 = new JLabel("Login Page");
		l1.setFont(new Font("Arial",Font.BOLD,30));
		l1.setForeground(Color.WHITE);
		l1.setBounds(180,30,200,32);
		p1.add(l1);
		
		l2 = new JLabel("User ID");
		l2.setFont(new Font("Arial",Font.BOLD,15));
		l2.setForeground(Color.white);
		l2.setBounds(100,100,150,20);
		p1.add(l2);
		
		l3 = new JLabel("Password");
		l3.setFont(new Font("Arial",Font.BOLD,15));
		l3.setForeground(Color.white);
		l3.setBounds(100,150,150,20);
		p1.add(l3);
		
		t1 = new JTextField();
		t1.setBounds(220,100,100,25);
		p1.add(t1);

		t2 = new JTextField();
		t2.setBounds(220,150,100,25);
		p1.add(t2);
		
		b1 = new JButton("REGISTER");
		b1.setFont(new Font("Arial",Font.BOLD,15));
		b1.setForeground(Color.BLACK);
		b1.setBounds(250,220,150,35);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Login");
		b2.setFont(new Font("Arial",Font.BOLD,15));
		b2.setForeground(Color.BLACK);
		b2.setBounds(60,220,100,25);
		b2.addActionListener(this);
		p1.add(b2);

		b3 = new JButton("Back");
		b3.setFont(new Font("Arial",Font.BOLD,15));
		b3.setForeground(Color.BLACK);
		b3.setBounds(60,320,100,25);
		b3.addActionListener(this);
		p1.add(b3);

		b4 = new JButton("Exit");
		b4.setFont(new Font("Arial",Font.BOLD,15));
		b4.setForeground(Color.BLACK);
		b4.setBounds(290,320,100,25);
		b4.addActionListener(this);
		p1.add(b4);

        this.add(p1);
	}

		public void actionPerformed(ActionEvent ae)
		{
			
			/*if (ae.getSource()==b1)
			{
				Form3 f= new Form3();
				this.setVisible(false);
				f.setVisible(true);
			}*/
			
			if(ae.getSource()==b2)
			{
				Form3 f= new Form3();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				Form1 f= new Form1();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
				System.exit(0);
			}
		}


}

