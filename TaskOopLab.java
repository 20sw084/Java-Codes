import java.lang.*;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Thread_Task extends Thread 
{
	public JFrame frame;
	int count=0;
	public JTextField tf1;
	String  names[] = { "Ali" ,"Ahmad", "Awais", "Musadiq" };
	String append="";
	
	public Thread_Task()
	{
		
		frame = new JFrame("Task");
		tf1 = new JTextField();
		tf1.setBounds(20, 50, 300, 20);
		frame.add(tf1);
		
	
		
		frame.setSize(400, 400);// 380 width and 700 height
		frame.setLayout(null);// using no layout managers
		frame.setVisible(true);// making the frame visible
	}
	
	public   void  run() 
	{ 
		
		
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

			tf1.setText("");
		}
	
}


//Main.java


import javax.swing.JFrame;
import javax.swing.JTextField;

public class Thread_Task_Main
{

	public static void main(String[] args)
	{
		Thread_Task t1 = new Thread_Task();
		t1.start();
	}

}


