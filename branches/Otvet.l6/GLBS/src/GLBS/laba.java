package GLBS; 

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;


public class laba { 
public static void main(String args[]) { 
	String sh = JOptionPane.showInputDialog("������ (�)");
	String dl = JOptionPane.showInputDialog("����� (��)");
Font font = new Font(null, Font.ITALIC, 23); 
JFrame frame = new JFrame(); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
JPanel panel = (JPanel) frame.getContentPane(); 
Dimension size = new Dimension(200, 200); 
frame.setLayout(null); 

JLabel label0 = new JLabel("�������� ��������������� ����������� ����������� �����������");
JLabel label12 = new JLabel("����� ��");
panel.add(label0); 
label0.setFont(font); 
label12.setBounds(0, 0, size.width+1000, size.height); 
panel.add(label12); 
label12.setFont(font); 
label0.setBounds(200, 0, size.width+1000, size.height);


JLabel label1 = new JLabel("��-218"); 
panel.add(label1); 
label1.setFont(font); 
label1.setBounds(150, 30, size.width, size.height); 


JLabel label2 = new JLabel("��������� �.�."); 
panel.add(label2); 
label2.setFont(font); 
label2.setBounds(50, 100, size.width, size.height); 

JLabel label3 = new JLabel("161"); 
panel.add(label3); 
label3.setFont(font); 
label3.setBounds(300, 100, size.width, size.height); 

JLabel label4 = new JLabel("����������� �.�."); 
panel.add(label4); 
label4.setFont(font); 
label4.setBounds(50, 200, size.width, size.height); 

JLabel label5 = new JLabel("022"); 
panel.add(label5); 
label5.setFont(font); 
label5.setBounds(300, 200, size.width, size.height); 

JLabel label6 = new JLabel("��������� �.�."); 
panel.add(label6); 
label6.setFont(font); 
label6.setBounds(50, 300, size.width, size.height); 

JLabel label7 = new JLabel("434"); 
panel.add(label7); 
label7.setFont(font); 
label7.setBounds(300, 300, size.width, size.height); 

JLabel label8 = new JLabel("Шайхуллин Т.Р."); 
panel.add(label8); 
label8.setFont(font); 
label8.setBounds(50, 400, size.width, size.height); 

JLabel label88 = new JLabel("Downhill4x5@mail.ru); 
panel.add(label88); 
label88.setFont(font); 
label88.setBounds(50, 400, size.width, size.height); 

JLabel label9 = new JLabel("470"); 
panel.add(label9); 
label9.setFont(font); 
label9.setBounds(300, 400, size.width, size.height); 

JLabel label11 = new JLabel("������ ���������� ���������"); 
panel.add(label11); 
label11.setFont(font); 
label11.setBounds(850, 50, size.width+1000, size.height); 

JLabel link = new JLabel("������ �� ���� �����");
link.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
link.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     if (e.getClickCount() > 0) {
         if (Desktop.isDesktopSupported()) {
               Desktop desktop = Desktop.getDesktop();
               try {
                   URI uri = new URI("https://www.ugatu.su/");
                   desktop.browse(uri);
               } catch (IOException ex) {
                   ex.printStackTrace();
               } catch (URISyntaxException ex) {
                   ex.printStackTrace();
               }
       }
     }
  }
}
);
panel.add(link);
link.setBounds(150, 450, size.width+1000, size.height); 

JLabel label10 = new JLabel("V=" + 5*100*Double.parseDouble(dl)*Double.parseDouble(sh)*100 +" c�^3"); 
panel.add(label10); 
label10.setFont(font); 
label10.setBounds(150, 500, size.width+1000, size.height); 
label10.setBounds(150, 500, size.width+1000, size.height); 
ImageIcon imgIco = new ImageIcon("./src/GLBS/logo.jpg"); 
Image image = imgIco.getImage(); 
Image newimg = image.getScaledInstance(450, 200, java.awt.Image.SCALE_SMOOTH); 
imgIco = new ImageIcon(newimg); 
JLabel img = new JLabel(imgIco); 
panel.add(img); 

JLabel label115 = new JLabel("������ �������� ��������"); 
panel.add(label115); 
label115.setFont(font); 
label115.setBounds(750, 240, size.width+300, size.height); 


img.setBounds(400,0, size.width+250,size.height+250);
        
        ImageIcon imgIco21 = new ImageIcon("./src/GLBS/������11.jpg");
        Image image2 = imgIco21.getImage();
        Image newimg2 = image2.getScaledInstance(450, 300,  java.awt.Image.SCALE_SMOOTH);
        imgIco21 = new ImageIcon(newimg2);
        JLabel img2 = new JLabel(imgIco21);
        img2.setBounds(650,280, size.width+250,size.height+250);
        panel.add(img2);
        img2.setVisible(false);
          
        JButton button1 = new JButton("����������");
        panel.add(button1);
        button1.setBounds(400, 450, size.width, size.height);
        button1.setSize(200, 40);
        button1.setVisible(true);
        
        JButton button = new JButton("����������");
        panel.add(button);
        button.setBounds(400, 400, size.width, size.height);
        button.setSize(200, 40);
        button.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                img2.setVisible(true);
            }
        });
        frame.setPreferredSize(new Dimension(300, 300));
      
        frame.setSize(1300, 700);
        frame.setVisible(true);    
   }
}
