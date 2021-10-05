import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame{
    public static void main(String[] args) {
      JFrame jf=new JFrame("My Frame");
      JDialog jd=new JDialog(jf,"My Dialog");
      //String[] s = new String ("J----y","U----r","N----d","A----a");
      jf.setBackground(Color.CYAN);
      JButton jb=new JButton("Click Me");
      jf.add(jb);
      jf.setSize(400,400);
      jd.setSize(200,200);
      jf.setVisible(true);
      jd.setVisible(true);
      JOptionPane.showMessageDialog(jf, "Invalid Input : Enter Correct Name ", "ERROR", JOptionPane.WARNING_MESSAGE);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.CANCEL_OPTION);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.CLOSED_OPTION);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.DEFAULT_OPTION);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.ERROR_MESSAGE);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.NO_OPTION);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.OK_CANCEL_OPTION);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.QUESTION_MESSAGE);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.PLAIN_MESSAGE);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.OK_OPTION);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.YES_NO_CANCEL_OPTION);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.YES_NO_OPTION);
      JOptionPane.showMessageDialog(jf, "Any Message", "ERROR", JOptionPane.YES_OPTION);
      JOptionPane.showInputDialog(jf, "Enter Your Name");
      
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
  }
