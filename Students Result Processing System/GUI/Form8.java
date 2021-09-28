import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form8 extends JFrame implements ActionListener
{
		JLabel l1,l2;
		//JTextField t1,t2;
		JButton b1,b2,b3,b4; 
		JPanel p1;

	public Form8()
	{
		super(" Student Page ");
		this.setSize(450,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1 = new JPanel();
		p1.setSize(new Dimension(450,400));
		p1.setBackground(Color.yellow);
		p1.setLayout(null);

		l1 = new JLabel("Mark");
		l1.setFont(new Font("Arial",Font.BOLD,30));
		l1.setForeground(Color.WHITE);
		l1.setBounds(180,90,200,32);
		p1.add(l1);
		
		l2 = new JLabel("Marks Obtained: 75");
		l2.setFont(new Font("Arial",Font.BOLD,15));
		l2.setForeground(Color.white);
		l2.setBounds(100,150,150,20);
		p1.add(l2);

		/*t1 = new JTextField();
		t1.setBounds(220,100,100,25);
		p1.add(t1);*/


		
		b1 = new JButton("Homepage");
		b1.setFont(new Font("Arial",Font.BOLD,15));
		b1.setForeground(Color.BLACK);
		b1.setBounds(100,25,100,25);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Logout");
		b2.setFont(new Font("Arial",Font.BOLD,15));
		b2.setForeground(Color.BLACK);
		b2.setBounds(300,25,100,25);
		b2.addActionListener(this);
		p1.add(b2);

		b3 = new JButton("Back");
		b3.setFont(new Font("Arial",Font.BOLD,15));
		b3.setForeground(Color.BLACK);
		b3.setBounds(60,320,100,25);
		b3.addActionListener(this);
		p1.add(b3);

		b4 = new JButton("Done");
		b4.setFont(new Font("Arial",Font.BOLD,15));
		b4.setForeground(Color.BLACK);
		b4.setBounds(290,320,100,25);
		b4.addActionListener(this);
		p1.add(b4);

        this.add(p1);
	}

		public void actionPerformed(ActionEvent ae)
		{
			
			if (ae.getSource()==b1)
			{
				Form1 f= new Form1();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b2)
			{
				Form1 f= new Form1();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				Form7 f= new Form7();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
				Form9 f= new Form9();
				this.setVisible(false);
				f.setVisible(true);
			}
		}


}

