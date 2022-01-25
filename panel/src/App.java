import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
        //create label
        JLabel label1= new JLabel();
        JLabel label2= new JLabel();
        JLabel label3= new JLabel();
        ImageIcon image1 = new ImageIcon("D:/Desktop Programing/jfx_latihan/panel/gemoy.gif");
        ImageIcon image2 = new ImageIcon("D:/Desktop Programing/jfx_latihan/panel/sepong.gif");
        ImageIcon image3 = new ImageIcon("D:/Desktop Programing/jfx_latihan/panel/trap.gif");
        //label1-red-panel
        label1.setText("NYAM NYAM YAMI");
        label1.setFont(new Font("Times New Roman",Font.BOLD,20));
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setForeground(Color.black);
        label1.setIconTextGap(-40);
        label1.setIcon(image1);
        //set ukuran label bisa pakai setBounds
        //label1.setBounds(100, 100, 75, 75);
        
        //label1-blue panel
        label2.setText("MUAH BEBEY");
        label2.setIcon(image2);
        //set layout secara manual
        //label2.setBounds(80, 80, 60, 60);
        label2.setFont(new Font("Arial",Font.BOLD,20));
        label2.setVerticalTextPosition(JLabel.TOP);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        
        label2.setAlignmentY(JLabel.TOP);
        label2.setAlignmentX(JLabel.CENTER);
        label2.setIconTextGap(-30);
        label2.setForeground(Color.black);
        //label3
        label3.setText("HYUNG");
        label3.setFont(new Font("Arial",Font.BOLD,20));
        label3.setIconTextGap(-20);
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setVerticalTextPosition(JLabel.TOP);
        label3.setIcon(image3);
        label3.setForeground(Color.black);
        //JPanel adalah sebuah GUI untuk menghold sebuah contain dari componen yg lain
        JPanel redPanel= new JPanel();
        redPanel.setBackground(Color.red);//set background panel ga usah getcontent
        redPanel.setBounds(0, 0, 250, 250);//set ukuran panel
        //                 x  y   p    l

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(255,0 , 250, 250);

        JPanel grenPanel = new JPanel();
        grenPanel.setBackground(Color.green);
        grenPanel.setBounds(0, 255, 505, 250);

        //create frame
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(525,550);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.orange);
        
        frame.add(redPanel);
        redPanel.add(label1);
        
        frame.add(bluePanel);
        bluePanel.add(label2);
        
        frame.add(grenPanel);
        grenPanel.add(label3);
        
        //frame.pack();//pack ukuran sesuai besaran label

    }
}
