//GUI.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  public class GUI extends WindowAdapter{
    JFrame jf;
    public GUI(){
      jf=new JFrame("Window 1");
      jf.setLayout(new GridBagLayout());
      JPanel jp=new JPanel();
      GridBagConstraints gbc=new GridBagConstraints();
      gbc.gridx=0;
      gbc.gridy=0;
      jp.add(new JButton("B1"),gbc);
      gbc.gridx=1;
      gbc.gridy=0;
      jp.add(new JButton("B2"),gbc);
      gbc.gridx=0;
      gbc.ipady=20;
      gbc.gridy=1;
      jp.add(new JButton("B3"),gbc);
      gbc.gridx=1;
      gbc.gridy=1;      
      jp.add(new JButton("B4"),gbc);
      gbc.gridx=0;
      gbc.gridy=2;  
      gbc.gridwidth=2;  
      gbc.fill=GridBagConstraints.VERTICAL;
      jp.add(new JButton("B5"),gbc);
      jf.add(jp);
      jf.addWindowListener(this);
     // jf.setSize(600,600);
     jf.pack();
      jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      jf.setVisible(true);
    }      
    public void windowClosing(WindowEvent we){
    
      int a=JOptionPane.showConfirmDialog(jf,"Are u Sure?");
      if(a==JOptionPane.YES_OPTION){
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      else if(a==JOptionPane.NO_OPTION){
        jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      }
      else if(a==JOptionPane.CANCEL_OPTION){
        jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      }
    }
  }

//Main.java

public class Main {
    public static void main(String[] args) {
        new GUI(); 
      }
}
