import java.awt.*;
import java.awt.event.*;
class A extends Frame implements ActionListener
{ 
    static int i=0;
	Button b[];
	A()
	{
        b=new Button[9];
		setLayout(null);
		Font f=new Font("",Font.BOLD,40);
		setFont(f);
		int k=0;
		int x=200;
		int y=200;
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
			try
			{
			b[k].setBounds(x,y,100,100);
			add(b[k]);
			b[k].addActionListener(this);
			}
			catch(Exception e)
			{
				
			}
				x=x+100;
			}
			y=y+100;
			x=200;
		}
	}
		public void actionPerformed(ActionEvent e)
		{
		 Button bn=(Button)e.getSource();
		 if(i%2==0)
		 {
			bn.setLabel("X");
			i++;
		 }
		 else 
		 {
			 bn.setLabel("O");
			 i++;
		 }	 
			
		}
		
		
	
}
class tictak
{
	public static void main(String as[])
	{
		A a=new A();
		a.setVisible(true);
		a.setBounds(200,200,800,800);
	}
}