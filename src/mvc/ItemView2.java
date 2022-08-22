package mvc;

import java.awt.*;
import java.awt.Image.*;
import java.io.*;
import javax.swing.*;

public class ItemView2 {
     public void details2(String ItemName1, String ItemPrice1, String ItemName2, String ItemPrice2){
        
        JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(0,0,800,500);
            frame.setTitle("WATCH STORE");
            Container c = frame.getContentPane();
            c.setLayout(null);
            frame.getContentPane().setBackground(Color.WHITE);
            
            
            JPanel p = new JPanel();
            p.setBounds(0, 0, 800, 60);
            p.setBackground(Color.CYAN);
            c.add(p);
            JLabel label=new JLabel("WATCH STORE (Sale)");
            label.setFont(new Font("Serif", Font.BOLD, 40));
            p.add(label);
            
            JPanel p2 = new JPanel();
            p2.setBounds(30, 100, 300,300);
            c.add(p2);
            ImageIcon image = new ImageIcon("C://Users//Pictures//watch2.jpg");
            JLabel l2 = new JLabel(image);
            p2.add(l2);
            frame.add(p2);
            JLabel label2 = new JLabel("<html><br/>"+"Name: " +ItemName1+"<br/>"+"Price: " + ItemPrice1+"<br/>");
            label2.setFont(new Font("Verdana", Font.PLAIN, 20));
            p2.add(label2);
            p2.setBackground(Color.WHITE);
            
            
            JPanel p3 = new JPanel();
            p3.setBounds(450,100,300,500);
            c.add(p3);
            ImageIcon image2 = new ImageIcon("C://Users//Pictures//w.jpg");
            JLabel l3 = new JLabel(image2);
            p3.add(l3);
            frame.add(p3);
            JLabel label3 = new JLabel("<html><br/>"+"Name: " +ItemName2+"<br/>"+"Price: " + ItemPrice2+"<br/>");
            label3.setFont(new Font("Verdana", Font.PLAIN, 20));
            p3.add(label3);  
            p3.setBackground(Color.WHITE);
    }
        
}
