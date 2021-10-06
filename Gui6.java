//GUI.java

import javax.swing.*;
import java.awt.event.*;
public class GUI extends WindowAdapter{
  JFrame jf;
  JRadioButton jrb1;
  JRadioButton jrb2;
  ButtonGroup bg;
  GUI(){
    jf=new JFrame("My Frame");
    jrb1 =new JRadioButton("Male");
    jrb2 =new JRadioButton("Female");
    jrb1.setBounds(75,50,100,30);    
    jrb2.setBounds(75,100,100,30);   
    bg=new ButtonGroup();
    bg.add(jrb1);
    bg.add(jrb2);
    jf.add(jrb1);
    jf.add(jrb2);
   jf.addWindowListener(this);
    jf.setSize(300,300);
    jf.setLayout(null);
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
