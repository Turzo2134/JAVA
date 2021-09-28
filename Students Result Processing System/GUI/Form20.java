import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form20 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JButton b1,b2; 
		JPanel p1;

	public Form20()
	{
		super(" Admin Homepage ");
		this.setSize(450,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1 = new JPanel();
		p1.setSize(new Dimension(450,400));
		p1.setBackground(Color.red);
		p1.setLayout(null);

		l1 = new JLabel("Developers");
		l1.setFont(new Font("Arial",Font.BOLD,30));
		l1.setForeground(Color.WHITE);
		l1.setBounds(180,100,200,32);
		p1.add(l1);
		
		l2 = new JLabel("TURZO ROY)");
		l2.setFont(new Font("Arial",Font.BOLD,15));
		l2.setForeground(Color.white);
		l2.setBounds(100,150,150,20);
		p1.add(l2);
		
		l3 = new JLabel("AJOY ROY");
		l3.setFont(new Font("Arial",Font.BOLD,15));
		l3.setForeground(Color.white);
		l3.setBounds(150,200,150,20);
		p1.add(l3);
		


		b1 = new JButton("Next");
		b1.setFont(new Font("Arial",Font.BOLD,15));
		b1.setForeground(Color.BLACK);
		b1.setBounds(290,320,100,25);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Back");
		b2.setFont(new Font("Arial",Font.BOLD,15));
		b2.setForeground(Color.BLACK);
		b2.setBounds(60,320,100,25);
		b2.addActionListener(this);
		p1.add(b2);


        this.add(p1);
	}

		public void actionPerformed(ActionEvent ae)
		{
			
			if (ae.getSource()==b1)
			{
				Form21 f= new Form21();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Form19 f= new Form19();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		}


}
