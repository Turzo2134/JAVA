import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form22 extends JFrame implements ActionListener
{
		JLabel l1;
		JButton b1,b2,b3; 
		JPanel p1;

	public Form22()
	{
		super(" Admin Login Page ");
		this.setSize(450,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1 = new JPanel();
		p1.setSize(new Dimension(450,400));
		p1.setBackground(Color.red);
		p1.setLayout(null);

		l1 = new JLabel("Are You Really Want To Remove");
		l1.setFont(new Font("Arial",Font.BOLD,20));
		l1.setForeground(Color.WHITE);
		l1.setBounds(30,30,400,50);
		p1.add(l1);

		
		b1 = new JButton("Yes");
		b1.setFont(new Font("Arial",Font.BOLD,15));
		b1.setForeground(Color.BLACK);
		b1.setBounds(150,200,100,25);
		b1.addActionListener(this);
		p1.add(b1);

		b2 = new JButton("No");
		b2.setFont(new Font("Arial",Font.BOLD,15));
		b2.setForeground(Color.BLACK);
		b2.setBounds(320,200,100,25);
		b2.addActionListener(this);
		p1.add(b2);

		b3 = new JButton("Done");
		b3.setFont(new Font("Arial",Font.BOLD,15));
		b3.setForeground(Color.BLACK);
		b3.setBounds(320,300,100,25);
		b3.addActionListener(this);
		p1.add(b3);

        this.add(p1);
	}

		public void actionPerformed(ActionEvent ae)
		{
			
			if (ae.getSource()==b1)
			{
				Form23 f= new Form23();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b2)
			{
				Form21 f= new Form21();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				Form23 f= new Form23();
				this.setVisible(false);
				f.setVisible(true);
			}	
		}
		


}

