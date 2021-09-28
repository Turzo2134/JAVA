import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form23 extends JFrame implements ActionListener
{
		JButton b1,b2,b3,b4,b5; 
		JPanel p1;
		
	public Form23()
	{
		super(" Admin Page ");
		this.setSize(450,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(450,400));
		p1.setBackground(Color.yellow);
		p1.setLayout(null);
		
		
		b1 = new JButton("ADD NEW STUDENT");
		b1.setFont(new Font("Arial",Font.BOLD,15));
		b1.setForeground(Color.BLACK);
		b1.setBounds(160,120,250,30);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("REMOVE STUDENT");
		b2.setFont(new Font("Arial",Font.BOLD,15));
		b2.setForeground(Color.BLACK);
		b2.setBounds(160,170,250,30);
		b2.addActionListener(this);
		p1.add(b2);

	
		
		b3 = new JButton("Homepage");
		b3.setFont(new Font("Arial",Font.BOLD,15));
		b3.setForeground(Color.BLACK);
		b3.setBounds(100,50,100,25);
		b3.addActionListener(this);
		p1.add(b3);	
		
		b4 = new JButton("Logout");
		b4.setFont(new Font("Arial",Font.BOLD,15));
		b4.setForeground(Color.BLACK);
		b4.setBounds(300,50,100,25);
		b4.addActionListener(this);
		p1.add(b4);	
		
		b5 = new JButton("Exit");
		b5.setFont(new Font("Arial",Font.BOLD,15));
		b5.setForeground(Color.BLACK);
		b5.setBounds(290,320,100,25);
		b5.addActionListener(this);
		p1.add(b5);
		
		
        this.add(p1);
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				Form19 f = new Form19();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Form22 f = new Form22();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				Form17 f = new Form17();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
				Form17 f = new Form17();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b5)
			{
             System.exit(0);
			}

			
		}


}

