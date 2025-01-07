package hotelmanagementsystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    Dashboard() {
        setBounds(0, 0, 1360, 735);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashbrd.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1360, 735);
        add(image);

       
        JLabel text = new JLabel("SDE GROUPS WELCOMES YOU");
        text.setBounds(350, 20, 1000, 50);
        text.setFont(new Font("serif", Font.BOLD, 40));
        text.setForeground(Color.white);
        image.add(text);

       
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1360, 20);
        image.add(mb);

        
        JMenu m = new JMenu("HOTEL MANAGEMENT ");
        mb.add(m);

        
        JMenuItem recp = new JMenuItem("RECEPTION");
        m.add(recp);

       
        JMenu a = new JMenu("ADMIN");
        mb.add(a);

        
        JMenuItem room = new JMenuItem("ADD ROOMS");
        a.add(room);

       
        JMenuItem employee = new JMenuItem("ADD EMPLOYEE");
        employee.addActionListener(this); 
        a.add(employee);

        
        JMenuItem driver = new JMenuItem("ADD DRIVERS");
        a.add(driver);

        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent ae) {
       
        if (ae.getActionCommand().equals("ADD EMPLOYEE")) {
            AddEmployee addEmployeePage = new AddEmployee(); 
            addEmployeePage.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Dashboard(); 
    }
}
