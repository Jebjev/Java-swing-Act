import javax.swing.*;
import java.awt.*;

public class title extends JFrame {

    public title() {
        JFrame frame = new JFrame();
        frame.setTitle("Title");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JRadioButton b1 = new JRadioButton("Huey");
        JRadioButton b2 = new JRadioButton("Duey");
        JRadioButton b3 = new JRadioButton("Louie");
        ButtonGroup group = new ButtonGroup();

        group.add(b1);
        group.add(b2);
        group.add(b3);

        b1.setBounds(20, 20, 60, 20);
        b2.setBounds(90, 20, 60, 20);
        b3.setBounds(160, 20, 60, 20);
        b3.setSelected(true);

        String[] fonts = {"Monospaced", "SansSerif", "Serif"};
        JList<String> fontList = new JList<>(fonts);
        fontList.setSelectedIndex(1);
        JScrollPane scrollPane = new JScrollPane(fontList);
        scrollPane.setBounds(20, 50, 100, 60);

        JLabel nameLabel = new JLabel("Louie");
        nameLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        nameLabel.setBounds(140, 65, 100, 30);
        nameLabel.setForeground(Color.BLUE);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(scrollPane);
        frame.add(nameLabel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new title();
    }
}
