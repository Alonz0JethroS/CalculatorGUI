import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel1 panel1 = new MyPanel1();
    MyPanel2 panel2 = new MyPanel2();
    MyFrame(){
        ImageIcon image = new ImageIcon("logo.png");
        this.setTitle("Calculator ni Jet");
        this.getContentPane().setBackground(new Color(0x05090E));
        this.setIconImage(image.getImage());
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(panel1);
        this.add(panel2);
        this.setVisible(true);
    }
}
class MyLabel extends JLabel{
    MyLabel(){
        this.setText("1234567890");
    }
}

class MyPanel1 extends JPanel{
    MyLabel label = new MyLabel();
    MyPanel1(){
        this.setLayout(new FlowLayout());
        this.setBackground(Color.lightGray);
        this.setBounds(10,20,460,100);
        this.add(label);
    }
}

class MyPanel2 extends JPanel{
    MyPanel2(){
        this.setLayout(new GridLayout(5,4,5,5));
        this.setBackground(Color.DARK_GRAY);
        this.setBounds(10,140,460,300);
        this.add(new JButton("AC"));
        this.add(new JButton("Back"));
        this.add(new JButton("%"));
        this.add(new JButton("/"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
        this.add(new JButton("x"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("-"));
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("+"));
        this.add(new JButton("0"));
        this.add(new JButton("."));
        this.add(new JButton("="));
        this.add(new JButton("="));
    }
}
