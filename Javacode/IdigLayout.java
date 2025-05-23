import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IdigLayout {
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
   JTextField tf;
   JLabel label;
    IdigLayout(){

        JFrame f = new JFrame("");
        f.setTitle("I Dig Layout");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1 = new JButton("2");
        b1.setBounds(0, 0, 400, 40);
        b2 = new JButton("1");
        b2.setBounds(0,40,50,40);
        tf = new JTextField("text");
        tf.setBounds(50, 40, 350, 40);
        b3 = new JButton("3");
        b3.setBounds(0, 80, 400, 40);
        b4 = new JButton("4");
        b4.setBounds(0, 120, 200, 100);
        b5 = new JButton("5");
        b5.setBounds(200, 180, 200, 40);
        b6 = new JButton("6");
        b6.setBounds(40, 225, 50, 40);
        b7 = new JButton("7");
        b7.setBounds(100, 225, 50, 40);
        b8 = new JButton("8");
        b8.setBounds(200, 225, 200, 100);
        label = new JLabel("Pretty tricky!");
        label.setForeground(Color.MAGENTA);
        label.setBounds(0, 350, 90, 40);


        f.add(b1);
        f.add(b2);
        f.add(tf);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(label);
      

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new IdigLayout();
    }
}
