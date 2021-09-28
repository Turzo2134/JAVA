import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form1 extends JFrame implements ActionListener
{
		JButton b1,b2,b3,b4; 
		JPanel p1;
		
	public Form1()
	{
		super(" Home Page ");
		this.setSize(450,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(450,400));
		p1.setBackground(Color.yellow);
		p1.setLayout(null);
		
		

		
		
		b1 = new JButton("Student");
		b1.setFont(new Font("Arial",Font.BOLD,15));
		b1.setForeground(Color.BLACK);
		b1.setBounds(160,120,150,25);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Faculty");
		b2.setFont(new Font("Arial",Font.BOLD,15));
		b2.setForeground(Color.BLACK);
		b2.setBounds(160,170,150,25);
		b2.addActionListener(this);
		p1.add(b2);

		b3 = new JButton("Admin");
		b3.setFont(new Font("Arial",Font.BOLD,15));
		b3.setForeground(Color.BLACK);
		b3.setBounds(160,220,150,25);
		b3.addActionListener(this);
		p1.add(b3);	
		
		b4 = new JButton("Exit");
		b4.setFont(new Font("Arial",Font.BOLD,15));
		b4.setForeground(Color.BLACK);
		b4.setBounds(300,330,150,25);
		b4.addActionListener(this);
		p1.add(b4);
		
        this.add(p1);
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				Form2 f = new Form2();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Form12 f = new Form12();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				Form18 f = new Form18();
				this.setVisible(false);
				f.setVisible(true);
			}
				else if(ae.getSource()==b4)
			{
				System.exit(0);
			}
			
		}
		


}



