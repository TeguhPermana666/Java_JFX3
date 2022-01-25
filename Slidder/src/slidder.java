import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// import javax.swing.*;
// import javax.swing.event.*;
// import java.awt.*;
// import java.awt.event.*;

public class slidder implements ChangeListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    JOptionPane danger;
    slidder(){
        frame = new JFrame("HOW HOT YOU!!!");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);//min max start_point


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        slider.setPreferredSize(new Dimension(420,200));
        
        slider.setPaintTicks(true);//menyertakan paint ticks nya
        slider.setMinorTickSpacing(10);//membuat spasi per ticksnya

        slider.setPaintTrack(true);//menyertakan paints tracknya
        slider.setMajorTickSpacing(20);//membuat spasi per tick nya

        slider.setPaintLabels(true);//menyertakan paint label ukurannya
        slider.setFont(new Font("Arial",Font.PLAIN,18));
        
        slider.setOrientation(SwingConstants.VERTICAL);//membuat slider menjadi vertikal
        

        //menampilkan informasi mengenai slider di panel

        slider.setBackground(Color.lightGray);
        slider.addChangeListener(this);
        label.setText("^C = "+slider.getValue());
        label.setFont(new Font("Arial",Font.BOLD,30));

        panel.setBackground(Color.CYAN);

        panel.add(label);
        panel.add(slider);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("^C = "+slider.getValue());       
        if(slider.getValue()>50){
            label.setForeground(Color.red);       
            danger.showMessageDialog(null, "PANAS KLEE", "WARNING!!", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("DANGER Please COLLDOWN");
        }
        label.setForeground(Color.BLACK);
    }
}