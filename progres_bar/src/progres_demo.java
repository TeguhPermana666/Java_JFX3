import java.awt.*;
import javax.swing.*;
public class progres_demo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,100);//min max value

    progres_demo(){
        
        bar.setValue(0);//default value
        bar.setBounds(0,0,420,50);//karena frame layout null harus di bounds biar ada kayak layer/ panel
        bar.setStringPainted(true);
        bar.setFont(new Font("Times New Roman",Font.BOLD,20));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(420,420));
        frame.getContentPane().setBackground(Color.blue);
        // frame.pack();
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill(){
        int Count=0;
        while(Count<=100){
            bar.setValue(Count);
            try {
                Thread.sleep(100L);//jika tidak exception maka akan delay thread akan pause 1 detik(1000L) kelamaan
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Count++;
        }
        bar.setString("FINISH!!!");
    }
}
