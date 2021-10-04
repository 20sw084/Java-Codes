import javax.swing.*;
import java.awt.*;
public class GUI{
    public static void main(String[] args) {
    JFrame jf=new JFrame("First HomeMade Practice Frame");    
    JPanel jp=new JPanel();
    jf.setLocationRelativeTo(null);
    jf.setResizable(false);
    ImageIcon ii=new ImageIcon("C:/Users/Lenovo/Desktop/JA.png");
    JLabel jl=new JLabel("JA Developers",ii,SwingConstants.HORIZONTAL);
      jp.add(jl);
    jf.setSize(580,500);   
   
     // set layout of frame
   // jf.setLayout(new FlowLayout());

    // array of string containing cities
    String s1[] = { "Hyderabad", "Karachi", "Nawabshah", "Naushahro-Feroze", "Sukkur", "Sanghar", "MirpurKhas", "Larkana", "Kashmore", "Shikarpur" };
      JComboBox jcb = new JComboBox(s1);
      jcb.setBounds(300,300,180,40);
      jcb.setForeground(Color.RED);
    
    // create labels
    jl = new JLabel("Select your Test Centre ");
    
   
    jp.add(jl);

    // add combobox to panel
    jp.add(jcb);


    // add panel to frame
    jf.add(jp);

    

    jf.show();                //Deprecated. Replaced by setVisible()


    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
