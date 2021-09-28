import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form19 extends JFrame implements ActionListener
{
		JButton b1,b2,b3,b4; 
		JPanel p1;
		
	public Form19()
	{
		super(" Admin Page ");
		this.setSize(450,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(450,400));
		p1.setBackground(Color.yellow);
		p1.setLayout(null);
		
		
		b1 = new JButton("Personal Info");
		b1.setFont(new Font("Arial",Font.BOLD,15));
		b1.setForeground(Color.BLACK);
		b1.setBounds(160,120,200,25);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Contact Info");
		b2.setFont(new Font("Arial",Font.BOLD,15));
		b2.setForeground(Color.BLACK);
		b2.setBounds(160,170,200,25);
		b2.addActionListener(this);
		p1.add(b2);

		b3 = new JButton("Course Info");
		b3.setFont(new Font("Arial",Font.BOLD,15));
		b3.setForeground(Color.BLACK);
		b3.setBounds(160,220,200,25);
		b3.addActionListener(this);
		p1.add(b3);	
		
		b4 = new JButton("Next");
		b4.setFont(new Font("Arial",Font.BOLD,15));
		b4.setForeground(Color.BLACK);
		b4.setBounds(290,320,100,25);
		b4.addActionListener(this);
		p1.add(b4);
		
        this.add(p1);
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				Form20 f = new Form20();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Form21 f = new Form21();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				Form21 f = new Form21();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
				Form20 f = new Form20();
				this.setVisible(false);
				f.setVisible(true);
			}
		}


}

