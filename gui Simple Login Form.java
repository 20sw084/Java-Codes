//gui1.java

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
public class gui1 extends JFrame implements ActionListener{ 
    JFrame jf;
    JLabel jl1,jl2;
    JTextField jtf;
    JPasswordField jpf;
    JButton jb;
    Container c;
    gui1(){
        jf=new JFrame("Login Form"); 
        c=jf.getContentPane();
        jf.setLocation(100,100);
        jf.setSize(400,300);
        c.setBackground(Color.ORANGE);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*
        Border blackline = BorderFactory.createTitledBorder("Login Page"); 
        JPanel jp=new JPanel();
        jp.setBorder(blackline);
        JPanel jp1=new JPanel();
        jp1.add(jp);
        jf.getContentPane().add(jp1, BorderLayout.CENTER);  */
        jl1=new JLabel("User Name"); 
        jl2=new JLabel("Password");
        jl1.setBounds(10,50,100,20);
        jl2.setBounds(10,70,100,20);
        c.add(jl1);
        c.add(jl2);
        jtf=new JTextField();
        jtf.setBounds(120,50,120,20);
        c.add(jtf);
        jpf=new JPasswordField();
        jpf.setBounds(120,70,120,20);
        c.add(jpf);
        jb=new JButton("Login");
        jb.setBounds(100,100,70,20);
        jb.addActionListener(this);
        c.add(jb);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) { 
        System.out.println("User Name is: "+jtf.getText());
        
        System.out.println("Password is: "+jpf.getText());
    }
}

//Main.java

public class Main {
    public static void main(String[] args) {
        new gui1(); 
      }
}
