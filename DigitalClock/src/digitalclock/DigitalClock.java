/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitalclock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author admin
 */
public class DigitalClock extends JFrame {
    
    JLabel jlabClock;
    ClockThread ct;
    
    public DigitalClock() {
        jlabClock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabClock.setFont(new Font("Arial",Font.CENTER_BASELINE,80));
        jlabClock.setOpaque(true);
        jlabClock.setBackground(Color.BLACK);
        jlabClock.setForeground(Color.WHITE);
        add(jlabClock);
        setSize(1200,120);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);
    
    
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new DigitalClock();
        // TODO code application logic here
    }
    
}
