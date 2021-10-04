import javax.swing.*;
import java.awt.*;
public class GUI{
    public static void main(String[] args) {
    JFrame jf=new JFrame();//"First HomeMade Practice Frame");
    JLabel jl=new JLabel("User name");
    JButton jb =new JButton("Unclickable Click");
    jl.setBounds(2,2,2,2);
    jf.setSize(580,500);   
    jf.setContentPane(jl);
     jb.setBounds(400, 400, 150, 50);
    jf.setBackground(Color.BLACK);
    jf.setForeground(Color.BLUE);
  //  jf.setFont(30);
    jf.setLayout(null);
    jf.setTitle("First HomeMade Practice Frame");
    jf.setVisible(true);
    jf.add(jb);
    jf.add(jl);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
