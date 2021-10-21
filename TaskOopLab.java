package Pharamacy_Management_System;
import javax.swing.*;

public class Multithreading_gui extends Thread 
{
	public JFrame frame;
	int count=0;
	public JTextField tf1;
	String  names[] = { "Ali" ,"Ahmad", "Awais", "Musadiq" };
	String append="";
	
	public Multithreading_gui()
	{		
		frame = new JFrame("Task");
		tf1 = new JTextField();
		tf1.setBounds(20, 50, 300, 20);
		frame.add(tf1);		
		frame.setSize(400, 400);// 380 width and 700 height
		frame.setLayout(null);// using no layout managers
		frame.setVisible(true);// making the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public   void  run() 
	{ 
		
		while(true){
			for(int i=0; i<names.length; i++)
			{
				if(count==0) 
				{
					append="";
					append += names[i];
					count++;
				}
				else 
				{
					append+=" , "+names[i];
					count++;
				}
				tf1.setText(append);
				try 
				{
					Thread.sleep(2000);
				}
				catch(Exception e) {
					
				}

				
			}

            append="";
            count=0;
            try 
				{
					Thread.sleep(2000);
				}
				catch(Exception e) {
					
				}
			tf1.setText("");
		}
    }
}

