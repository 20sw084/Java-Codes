//GUI.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  public class GUI extends WindowAdapter implements ActionListener{
    JFrame jf;
    CardLayout cd;
    Container c;
    public GUI(){
      jf=new JFrame("Window 1");
      c=jf.getContentPane();
      cd=new CardLayout(10,5);
      jf.setLayout(cd);
      JButton jb1=new JButton("B1");
      jb1.addActionListener(this);
      c.add("B1",jb1);
      JButton jb2=new JButton("B2");
      jb2.addActionListener(this);
      c.add("B2",jb2);
      JButton jb3=new JButton("B3");
      jb3.addActionListener(this);     
      c.add("B3",jb3);

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
    public void actionPerformed(ActionEvent ae){
      cd.next(c);
    }    
  }
  
  //Main.java

public class Main {
    public static void main(String[] args) {
        new GUI(); 
      }
}
