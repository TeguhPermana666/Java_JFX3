import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.FlowLayout;

public class BukaFile extends JFrame implements ActionListener{
    JButton button;
    BukaFile(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button= new JButton("Tekan Aku");
        button.addActionListener(this);
        button.setSelected(false);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();
            int result =fileChooser.showOpenDialog(null);//select file to open, null karena ga ada nanti dibuka manual
            if(result==fileChooser.APPROVE_OPTION){//int 0=approve aption
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
            //fileChooser.showSaveDialog(parent;)//save file
        }
        
    }
}
