
import java.awt.*;
import java.awt.event.*;
public class SimpleCompound1 implements ActionListener
{
	float si,ci,c;
	Frame f=new Frame();
	Label l1=new Label("Principle");
	Label l2=new Label("Time");
	Label l3=new Label("Rate");
	Label l4=new Label("Number");
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	Button b1=new Button("Simple Interest");
	Button b2=new Button("Compound Interest");
	public void init()
	{
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int n3=Integer.parseInt(t3.getText());
		int n4=Integer.parseInt(t4.getText());
		
		if(e.getSource()==b1)
		{
			si=(n1*n2*n3)/100;
			
		}
			
		if(e.getSource()==b2)
		{
			ci=(1+n3/100)^(n4*n2);
			c=n1*ci;
		}
		
		
	}

	

}