import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form15 extends JFrame implements ActionListener
{
		JButton b1,b2,b3,b4,b5; 
		JPanel p1;
		
	public Form15()
	{
		super(" Home Page ");
		this.setSize(450,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(450,400));
		p1.setBackground(Color.yellow);
		p1.setLayout(null);
		
		
		b1 = new JButton("Personal details");
		b1.setFont(new Font("Arial",Font.BOLD,15));
		b1.setForeground(Color.BLACK);
		b1.setBounds(160,120,150,25);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Set Results");
		b2.setFont(new Font("Arial",Font.BOLD,15));
		b2.setForeground(Color.BLACK);
		b2.setBounds(160,170,150,25);
		b2.addActionListener(this);
		p1.add(b2);

		b3 = new JButton("Set Schedules");
		b3.setFont(new Font("Arial",Font.BOLD,15));
		b3.setForeground(Color.BLACK);
		b3.setBounds(160,220,200,25);
		b3.addActionListener(this);
		p1.add(b3);	
		
		b4 = new JButton("Homepage");
		b4.setFont(new Font("Arial",Font.BOLD,15));
		b4.setForeground(Color.BLACK);
		b4.setBounds(200,50,100,25);
		b4.addActionListener(this);
		p1.add(b3);	
		
		b5 = new JButton("Logout");
		b5.setFont(new Font("Arial",Font.BOLD,15));
		b5.setForeground(Color.BLACK);
		b5.setBounds(250,50,100,25);
		b5.addActionListener(this);
		p1.add(b3);	
		
		
        this.add(p1);
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				Form14 f = new Form14();
				this.setVisible(false);
				f.setVisible(true);
			}
			/*else if(ae.getSource()==b2)
			{
				Form16 f = new Form16();
				this.setVisible(false);
				f.setVisible(true);
			}*/
			else if(ae.getSource()==b3)
			{
				Form11 f = new Form11();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
				Form11 f = new Form11();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b5)
			{
				Form11 f = new Form11();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		}


}

