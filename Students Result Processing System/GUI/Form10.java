import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form10 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
//		JTextField t1,t2,t3,t4;
		JButton b1,b2,b3,b4; 
		JPanel p1;

	public Form10()
	{
		super(" Student Page ");
		this.setSize(450,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1 = new JPanel();
		p1.setSize(new Dimension(450,400));
		p1.setBackground(Color.red);
		p1.setLayout(null);

		l1 = new JLabel("Quiz: 24 October");
		l1.setFont(new Font("Arial",Font.BOLD,15));
		l1.setForeground(Color.WHITE);
		l1.setBounds(100,100,200,40);
		p1.add(l1);
		
		l2 = new JLabel("Syllabus: Classes");
		l2.setFont(new Font("Arial",Font.BOLD,15));
		l2.setForeground(Color.white);
		l2.setBounds(100,150,250,40);
		p1.add(l2);
		
		l3 = new JLabel("Question Pattern: MCQ");
		l3.setFont(new Font("Arial",Font.BOLD,15));
		l3.setForeground(Color.white);
		l3.setBounds(100,200,250,40);
		p1.add(l3);
		
		l4 = new JLabel("Time: 20 Mins");
		l4.setFont(new Font("Arial",Font.BOLD,15));
		l4.setForeground(Color.white);
		l4.setBounds(100,250,250,40);
		p1.add(l4);
		
/*		t1 = new JTextField();
		t1.setBounds(220,100,100,25);
		p1.add(t1);

		t2 = new JTextField();
		t2.setBounds(220,150,100,25);
		p1.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(220,150,100,25);
		p1.add(t3);
		
		t4 = new JTextField();
		t4.setBounds(220,150,100,25);
		p1.add(t4);*/
		
		b1 = new JButton("Homepage");
		b1.setFont(new Font("Arial",Font.BOLD,15));
		b1.setForeground(Color.BLACK);
		b1.setBounds(70,20,100,25);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Logout");
		b2.setFont(new Font("Arial",Font.BOLD,15));
		b2.setForeground(Color.BLACK);
		b2.setBounds(300,20,250,25);
		b2.addActionListener(this);
		p1.add(b2);

		b3 = new JButton("Exit");
		b3.setFont(new Font("Arial",Font.BOLD,15));
		b3.setForeground(Color.BLACK);
		b3.setBounds(60,320,100,25);
		b3.addActionListener(this);
		p1.add(b3);


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
				System.exit(0);
			}
			
		}


}

