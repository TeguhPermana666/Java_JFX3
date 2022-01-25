import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.*;

import java.awt.*;
public class MyFrame extends JFrame implements ActionListener {
    JButton button = new JButton();
    JTextField textField = new JTextField();

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
    
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Times New Ronan",Font.PLAIN,30));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setText("Username");

        button.setText("Sumbit");
        button.setFont(new Font("Arial",Font.BOLD,24));
        button.setForeground(Color.black);
        button.setBackground(Color.red);    
        button.addActionListener(this);
        
        this.add(textField);
        this.add(button);
        
        this.pack();
        this.setVisible(true);

    }

    @Override//artinya memeasang sebuah methode,constrcut,atribut dari paret class di child clas
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            textField.setEditable(false);//sekali input langsung ga bisa ketik lagi
            button.setEnabled(false);//ga mencet sumbit
           System.out.println(textField.getText());
        }
        
    }
    
}
