//GUI.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  public class GUI extends WindowAdapter{
    JFrame jf;
    Container c;
    public GUI(){
      jf=new JFrame("Window 1");
      c=jf.getContentPane();
      JPanel jp=new JPanel();
      jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
      jp.add(new JButton("B1"));
      jp.add(new JButton("B2"));
      jp.add(new JButton("B3"));     
      jp.add(new JButton("B4"));
      jp.add(new JButton("B5"));
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
