import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GoodThingIStudied {
    
    JLabel label;
    JFrame frame;
    JButton b1,b2,b3,b4,b5,b6,b7;

    GoodThingIStudied(){
        

        frame = new JFrame();
        frame.setTitle("Good thing I studied!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("Type stuff: ");
        label.setForeground(Color.blue);
        label.setBounds(80, 250, 100, 30);
 JTextField stuff = new JTextField("");
stuff.setBounds(150, 250, 170, 30);

        b1 = new JButton("Button1");
        b1.setBounds(0, 0, 135, 30);

        b2 = new JButton("Button2");
        b2.setBounds(135, 0, 135, 30);

        b3 = new JButton("Button3");
        b3.setBounds(270, 0, 135, 30);

        b4 = new  JButton("Button4");
        b4.setBounds(0, 30, 200, 100);

        b5 = new JButton("Button5");
        b5.setBounds(195, 30, 210, 100);

        b6 = new JButton("Button6");
        b6.setBounds(0, 130, 200, 100);

        b7 = new JButton("Button7");
        b7.setBounds(200, 130, 205, 100);

        frame.add(label);
      
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
  frame.add(stuff);

        frame.setSize(456, 350);
        frame.setLayout(null);
        frame.setVisible(true);
       
    }
 public static void main(String[] args){
           new GoodThingIStudied();
        }
}