//GUI.java

import javax.swing.*;
import java.awt.event.*;
public class GUI extends WindowAdapter{
  JFrame jf;
  GUI(){
    jf=new JFrame("My Frame");
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
        GUI gui=new GUI(); 
       }
}
