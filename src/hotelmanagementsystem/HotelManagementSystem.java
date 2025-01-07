
package hotelmanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.URI;
public class HotelManagementSystem extends JFrame implements ActionListener{
         HotelManagementSystem(){
             setSize(1366,565);
             setLocation(0,100);
             ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first1.jpg"));
             JLabel image = new JLabel(i1);
             add(image);
             
              JLabel text=new JLabel("HOTEL MANAGEMENT SYSTEM");
                text.setBounds(25,450,1000,100);
                text.setBackground(Color.black);
                text.setFont(new Font("serif",Font.ROMAN_BASELINE,30));
                text.setForeground(Color.black);
                image.add(text);
                
              JButton next = new JButton("Next");
              next.setBounds(1150,450,150,50); 
              next.setBackground(Color.black);
              next.setForeground(Color.white);
              next.addActionListener(this);
              next.setFont( new Font("serif" ,Font.BOLD,24));
              image.add(next);
             
             setVisible(true);
         }
         
    public void actionPerformed (ActionEvent ae){
        setVisible(false);
        new Login();
    }
         
    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}
