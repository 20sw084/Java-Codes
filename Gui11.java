//GUI.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  public class GUI extends WindowAdapter{
    JFrame jf;
    public GUI(){
      jf=new JFrame("Window 1");
      jf.setLayout(new GridLayout(2,2,50,50));
      JButton b1=new JButton("B1");
      JButton b2=new JButton("B2");
      JButton b3=new JButton("B3");
      JButton b4=new JButton("B4");
      jf.add(b1);
      jf.add(b2);
      jf.add(b3);
      jf.add(b4);
      jf.addWindowListener(this);
      jf.setSize(600,600);
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
