import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class JMenu_Bar  extends MouseAdapter implements MouseListener
{
	static JButton Click_button;
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Learning JMenuBar");
		
		Click_button = new JButton("Click_button");
		Click_button.setBounds(100, 150, 200, 60);
		frame.add(Click_button);
		Click_button.addMouseListener(new JMenu_Bar());
		
	//	Color clr = JColorChooser.showDialog(frame, "Select Color", Color.YELLOW);
		
		JLabel label1 = new JLabel("Enter");
		label1.setBounds(20, 20, 90, 20);// (int x, int y, int width, int height)
		frame.add(label1);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(220, 20, 120, 20); // (int x, int y, int width, int height)
		frame.add(tf1);

	//	tf1.setForeground(clr);
		//String str = String.valueOf(tf1.getText());
		
		
		
		//System.out.println(str);
		
		Click_button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					Process p=Runtime.getRuntime().exec(tf1.getText().trim());
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.getMessage();
				}

			}

		});
		
		
	/*	JMenuBar Bar = new JMenuBar();
		JSeparator Sep = new JSeparator();
		JMenu File_Menu = new JMenu("File");
		JMenu Edit_Menu = new JMenu("Edit");
		JMenu Source_Menu = new JMenu("Source");
		
		JMenuItem i1,i2,i3,i4,i5;
		i1=new JMenuItem("Item 1");  
        i2=new JMenuItem("Item 2");  
        i3=new JMenuItem("Item 3");  
        i4=new JMenuItem("Item 4");  
        i5=new JMenuItem("Item 5");  
        
        File_Menu.add(i1);
        Edit_Menu.add(Sep);
        File_Menu.add(i2);
        File_Menu.add(Sep);
        File_Menu.add(i3);
        Source_Menu.add(Sep);
        
        
        
        Bar.add(File_Menu);
        Bar.add(Edit_Menu);
        Bar.add(Source_Menu);
        
        frame.setJMenuBar(Bar);   
        */
		frame.setSize(380, 700);// 380 width and 700 height
		frame.setLayout(null);// using no layout managers
		frame.setVisible(true);// making the frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		Click_button.setText("Clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		Click_button.setText("Pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		Click_button.setText("Released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Click_button.setText("Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Click_button.setText("Exited");
	}
}
