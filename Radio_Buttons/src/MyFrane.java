import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.*;
public class MyFrane extends JFrame implements ActionListener{
    JRadioButton pizza;
    JRadioButton pisang;
    JRadioButton rujak;
    //pakai gambar juga bole nanti setIcon
    MyFrane(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.getLayeredPane().setBackground(Color.green);
        this.setTitle("Fuckker");
        
        pizza = new JRadioButton();
        pizza.setText("PIZZA");
        pizza.addActionListener(this);
        pizza.setForeground(Color.black);
        pizza.setBackground(Color.DARK_GRAY);
        pizza.setFont(new Font("Arial",Font.BOLD,30));
        pizza.setFocusable(false);

        pisang= new JRadioButton();
        pisang.setText("PISANG");
        pisang.addActionListener(this);
        pisang.setForeground(Color.black);
        pisang.setBackground(Color.DARK_GRAY);
        pisang.setFont(new Font("Arial",Font.BOLD,30));
        pisang.setFocusable(false);
        
        rujak= new JRadioButton();
        rujak.setText("RUJAK");
        rujak.addActionListener(this);
        rujak.setForeground(Color.black);
        rujak.setBackground(Color.DARK_GRAY);
        rujak.setFont(new Font("Arial",Font.BOLD,30));
        rujak.setFocusable(false);
        //Button Group untuk menggroupkan button pada jradiobutton
        ButtonGroup grup = new ButtonGroup();
        grup.add(pizza);
        grup.add(pisang);
        grup.add(rujak);

        this.add(pizza);
        this.add(pisang);
        this.add(rujak);

        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizza){
            System.out.println("PIZZA IS COMING");
        }
        else if(e.getSource()==pisang){
            System.out.println("PISANG IS COMING");
        }
        else if(e.getSource()==rujak){
            System.out.println("RUJAK IS COMING");
        }
    }
}
