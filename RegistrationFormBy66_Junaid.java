import javax.swing.*;
import java .awt.*;
import java.awt.event.*;


    public class Registration extends JFrame implements ActionListener{
        JRadioButton male,female; 
        JComboBox comboBox;
        JCheckBox checkBox;
        JButton button;
        JButton button1;
        JTextField textField,textField2,textField3,textField4;
        JPasswordField password;
        JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,msg,label9,label0;
        JPanel panel,panel1,panel2;
        JFrame frame,frame1;
        JTextArea screen;
    Registration(){
        screen = new JTextArea();
        screen.setBounds(320, 25, 250, 250);
       
        
        msg = new JLabel("");
        msg.setForeground(Color.white);
        msg.setBackground(Color.black);
        msg.setOpaque(false);
        msg.setBounds(30, 280, 250, 20);
        
        
        male = new JRadioButton();
        male.setText("MALE");
        male.setBounds(130, 100, 70, 20);
        
        female = new JRadioButton();
        female.setText("FEMALE");
        female.setBounds(220, 100, 70, 20);
        
        
      
        String[] city={"Jamshoro","Karachi","Hyderabad"};
        comboBox = new JComboBox(city);
        comboBox.setBounds(150, 130,  100, 20);
        
      
        checkBox = new JCheckBox();
      
        checkBox.setFocusable(false);
        checkBox.setBounds(20, 220, 20, 20);
        
        button = new JButton("REGISTER");
        button.setBounds(30, 250, 100, 20);
        button.addActionListener(this);
       
        button1 = new  JButton("CLEAR");
        button1.setBounds(170, 250, 100, 20);
        button1.addActionListener(this);

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        
        textField = new JTextField();//for name
        textField.setBounds(150, 10,  100, 20);
        
        password = new JPasswordField();//for password
        password.setBounds(150, 40,  100, 20);
        
        textField2 = new JTextField();//for email
        textField2.setBounds(150, 70,  100, 20);

        
        textField3 = new JTextField();//for country
        textField3.setBounds(150, 160,  100, 20);
        
        textField4 = new JTextField();//for phone number
        textField4.setBounds(150, 190,  100, 20);
        
        ImageIcon image = new ImageIcon("leaf.jpg");
        label0 = new JLabel();
        label0.setBounds(200, 30,  30, 30);
        label0.setIcon(image);
        
        label = new JLabel();
        label.setText("APPLICATION REGISTRATION");
        // Label.setFont(new Font("MV Boli",Font.PLAIN,50));
        label.setBounds(250, 10,  300, 70);
        
        label1 = new JLabel();
        label1.setText("NAME :");
        label1.setBounds(10, 10,  100, 20);

        label2 = new JLabel();
        label2.setText("PASSWORD : ");
        label2.setBounds(10, 40,  100, 20);
       
        label3 = new JLabel();
        label3.setText("EMAIL : ");
        label3.setBounds(10, 70,  100, 20);
        
        label4 = new JLabel();
        label4.setText("GENDER : ");
        label4.setBounds(10, 100, 100, 20);
        
        label5 = new JLabel();
        label5.setText("CITY : ");
        label5.setBounds(10, 130,  100, 20);
       
        label6 = new JLabel();
        label6.setText("COUNTRY : ");
        label6.setBounds(10, 160,  150, 20);
        
        label7 = new JLabel();
        label7.setText("PHONE NUMBER : ");
        label7.setBounds(10, 190,  150, 20);
       
        label8 = new JLabel();
        label8.setText("TERMS AND CONDITIONS");
        label8.setBounds(60, 220, 150, 20);
       
        // label9 = new JLabel();//for error msg to enter  numeric values 
        // label9.setText("");
        // label9.setBackground(Color.BLACK);
        // label9.setForeground(Color.white);
        // label9.setBounds(30, 300, 250, 20);
        // label9.setOpaque(false);
       
        panel2 = new JPanel();
        panel2.setBackground(new Color(225,225,225,100));
        panel2.setBounds(100,100,600,350);
        panel2.setLayout(null);
        panel2.add(label1);
        panel2.add(label2);
        panel2.add(label3);
        panel2.add(label4);
        panel2.add(label5);
        panel2.add(label6);
        panel2.add(label7);
        panel2.add(label8);
        panel2.add(textField);
        panel2.add(password);
        panel2.add(textField2);
        panel2.add(textField3);
        panel2.add(textField4);       
        panel2.add(button);       
        panel2.add(button1);       
        panel2.add(checkBox);       
        panel2.add(comboBox);       
        panel2.add(male);       
        panel2.add(female);       
        panel2.add(screen);
        panel2.add(msg);
        // panel2.add(label9);
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,70));
        panel.setBackground(new Color(27,161,226));  
        panel.setLayout(null);
        panel.add(label);
        panel.add(label0);
       
        panel1 = new JPanel(); 
        panel1.setPreferredSize(new Dimension(250,250));
        panel1.setBackground(new Color(227,200,0));
        panel1.setLayout(null);
        panel1.add(panel2);
       
        frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,700);
        frame.setLayout(new BorderLayout(5,10));
        frame.setBackground(new Color(100,123,44));
        frame.add(panel,BorderLayout.NORTH);
        frame.add(panel1,BorderLayout.CENTER);
        
        textField4.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyPressed(KeyEvent ke){
                String value = textField4.getText();
                int l = value.length();
                if (ke.getKeyChar()>='0' && ke.getKeyChar()<='9'|| ke.getKeyChar()<= KeyEvent.VK_BACK_SPACE  ){
                    textField4.setEditable(true);

                }
                else{
                    textField4.setEditable(false);
                    JOptionPane.showMessageDialog(null,"Only enter numeric values ", "", JOptionPane.INFORMATION_MESSAGE);

                    
                }
            }
        });    
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//********for registration************** */
        if(e.getSource()==button)
       {
        if (checkBox.isSelected()  )
        {         
            if(textField2.getText().contains("@")){
            msg.setText("Registeration Successfull!");
            msg.setOpaque(true);
            String name = textField.getText();
            String pass = String.valueOf(password.getText());          
            String eMail = textField2.getText();
            
            String gender = "male";
            if(female.isSelected())
            {
               gender="female";
            }
            String cty = (String)comboBox.getSelectedItem();
          
            String country =textField3.getText();
            String pNumber =textField4.getText();
            screen.setText("Name : "+name+"\n"+"Password : "+pass+"\n"+"email : "+eMail+"\n"+"Gender : "+
                   gender+"\n"+"City : "+cty+"\n"+"Country : "+country+"\n"+"Phone Number : "+pNumber);
            }
            
            else
            {
                JOptionPane.showMessageDialog(null,"There should be '@'sign in the email ", "", JOptionPane.INFORMATION_MESSAGE);

            }
        }
        else
        {   
            msg.setOpaque(true);
            msg.setText("Accept terms and conditons to submit.");
            screen.setText("");
        }
    }
//**********for clearing the registration form */
    if(e.getSource()==button1)
    {
        textField.setText("");
        password.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        screen.setText("Name : "+"\n"+"Password : "+"\n"+"email : "+"\n"+"Gender : "+
                   "\n"+"City : "+"\n"+"Country : "+"\n"+"Phone Number : ");
                   msg.setText("");            
     }      
  }
}
