package javalab;
import java.lang.Thread;
import javax.swing.*;
import java.util.Date;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;

/**
 *
 * @author user
 */
public class JavaLab extends Thread implements KeyListener{
    JFrame jf;
    JLabel jl;
    String str;
    SimpleDateFormat format;
    Date d;
    int x,y;
    JavaLab(){
        
        jl = new JLabel();
        x=30;
        y=30;
        jl.setBounds(x,y,500,400);
        jl.setFont(new Font("Serif",Font.BOLD,30));

        jf=new JFrame("MultiThreading");
         
    jf.setSize(500,500);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
                
                jf.add(jl);

    
    }
    @Override
    public void run(){
        try{
                while(true){
                    d=new Date();
                     format=new SimpleDateFormat("E,MM/dd/yyyy HH:mm:ss");
                     str=format.format(d);
                     jl.setText("Date   "+str);   
                 }
        }
        catch(Exception E){
            E.printStackTrace();
        }
         }
     public static void main(String[] args) {
        JavaLab j=new JavaLab();
        j.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
        }

    @Override
    public void keyPressed(KeyEvent e) {
         switch(e.getKeyCode()){
             case KeyEvent.VK_LEFT:{
                 x-=10;
            
             }
             case KeyEvent.VK_RIGHT:{
                 x+=10;
//              break;   
             }
             case KeyEvent.VK_UP:{
                 y-=10;
//              break;   
             }
             case KeyEvent.VK_DOWN:{
                 y+=10;
//              break;   
             }
             
         }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
