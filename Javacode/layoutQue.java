import java.awt.Checkbox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class layoutQue {
    public static void main(String[] args){
        JButton b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,bcancel;
        JLabel  bl;

        Checkbox c1,c2,c3,c4;
    JFrame f = new JFrame("");
        f.setTitle("Layout Question");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1000, 500);
        f.setVisible(true);
        

      bl = new JLabel("Buttons: ");
      b2 = new JButton("hi");
      b3 = new JButton("long name");
      b4 = new JButton("bye");
      b5 = new JButton("1");
      b6 = new JButton("2");
      b7 = new JButton("3");
      b8 = new JButton("4");
      b9 = new JButton("5");
      b10 = new JButton("6");
      b11 = new JButton("7");
      bcancel = new JButton("Cancel");


      bl.setBounds(0,0,135,30);
      b2.setBounds(50,0,138,30);
      b3.setBounds(175,0,138,30);
      b4.setBounds(300,0,143,30);
      b5.setBounds(83,30,180,100);
      b6.setBounds(263,30,180,100);
      b7.setBounds(83,130,90,50);
      b8.setBounds(173,130,90,50);
      b9.setBounds(83,180,90,50);
      b10.setBounds(173,180,90,50);
      b11.setBounds(263,130,180,100);
      bcancel.setBounds(0, 230, 443, 30);

      f.add(bl);
      f.add(b2);
      f.add(b3);
      f.add(b4);
      f.add(b5);
      f.add(b6);
      f.add(b7);
      f.add(b8);
      f.add(b9);
      f.add(b10);
      f.add(b11);
      f.add(bcancel);
   

      c1 = new Checkbox("Bold");
    c2 = new Checkbox("Italic");
    c3 = new Checkbox("Underline");
    c4 = new Checkbox("Strikeout");

    c1.setBounds(10, 40, 50, 20);
    c2.setBounds(10, 60, 50, 20);
    c3.setBounds(10, 80, 70, 20);
    c4.setBounds(10, 100, 70, 20);

    f.add(c1);
    f.add(c2);
    f.add(c3);
    f.add(c4);

}
}
