 import javax.swing.*;
import java.awt.*;
 import java.awt.event.*;
 class Structure extends JFrame implements ActionListener
 {
 JButton Button[]=new JButton[9];
	 int i=0;
	Structure()
	 {
		 Font f1=new Font(Font.SANS_SERIF,Font.BOLD,70);
		 setFont(f1);
		 setLayout(null);
		 int a=150;
		 int b=200;
		 for(int i=0;i<9;i++)
		 {
		   Button[i]=new JButton();
		   Button[i].setSize(150,150);
		   Button[i].setLocation(a,b);
		   Button[i].addActionListener(this);
		   Button[i].setFont(f1);
           a=a+150;		  
		   if((i+1)%3==0) 
		   {
			  b=b+150;
			  a=150;
		   }
		   add(Button[i]);	
		 }
		
	 }
	
	 public void actionPerformed(ActionEvent e)
	 {
		 JButton bn=(JButton)e.getSource();
		
		 if(i%2==0)
		 {
			 bn.setLabel("O");
			 i++;
			 check();
		 }
		 else
		 {
			 bn.setLabel("X");
			 i++;
			 check();
		 }
	 }
	
     public void check()
	 {
	
		 if(
		 Button[0].getLabel().equals("X") && Button[1].getLabel().equals("X") && Button[2].getLabel().equals("X") ||
		 Button[3].getLabel().equals("X") && Button[4].getLabel().equals("X") && Button[5].getLabel().equals("X") ||
		 Button[6].getLabel().equals("X") && Button[7].getLabel().equals("X") && Button[8].getLabel().equals("X") ||
		 Button[0].getLabel().equals("X") && Button[3].getLabel().equals("X") && Button[6].getLabel().equals("X") ||
		 Button[1].getLabel().equals("X") && Button[4].getLabel().equals("X") && Button[7].getLabel().equals("X") ||
		 Button[2].getLabel().equals("X") && Button[5].getLabel().equals("X") && Button[8].getLabel().equals("X") ||
		 Button[0].getLabel().equals("X") && Button[4].getLabel().equals("X") && Button[8].getLabel().equals("X") ||
		 Button[2].getLabel().equals("X") && Button[4].getLabel().equals("X") && Button[6].getLabel().equals("X"))
         {
	   System.out.println("X is Winner");
		 }
	     if(
		 Button[0].getLabel().equals("O") && Button[1].getLabel().equals("O") && Button[2].getLabel().equals("O") ||
		 Button[3].getLabel().equals("O") && Button[4].getLabel().equals("O") && Button[5].getLabel().equals("O") ||
		 Button[6].getLabel().equals("O") && Button[7].getLabel().equals("O") && Button[8].getLabel().equals("O") ||
		 Button[0].getLabel().equals("O") && Button[3].getLabel().equals("O") && Button[6].getLabel().equals("O") ||
		 Button[1].getLabel().equals("O") && Button[4].getLabel().equals("O") && Button[7].getLabel().equals("O") ||
		 Button[2].getLabel().equals("O") && Button[5].getLabel().equals("O") && Button[8].getLabel().equals("O") ||
		 Button[0].getLabel().equals("O") && Button[4].getLabel().equals("O") && Button[8].getLabel().equals("O") ||
		 Button[2].getLabel().equals("O") && Button[4].getLabel().equals("O") && Button[6].getLabel().equals("O"))
         {
			 System.out.println("O is Winner");
		 }
		 else 
		 {
			 int p=0;
			 for(int i=0;i<9;i++)
			 {
				 if(!Button[i].getLabel().equals(""))
				 {
					 p++;
					 }
			 }
			 if(p==9)
			 System.out.println("Draw match");
		 }
	 }
    
   	 public void paintComponent(Graphics g)
	 {
		
		 g.drawString("hellogfewfgfdt",900,500);
	 }
	
 }
 public class oxgame 
 {
	 public static void main(String[]a)
	 {
		 Structure st=new Structure();
		 st.setVisible(true);
		st.setResizable(false);
		 st.setSize(800,800);
		 st.setLocation(550,200);
		 st.setDefaultCloseOperation(st.EXIT_ON_CLOSE);
		
	 }
  }
