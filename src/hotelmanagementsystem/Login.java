package hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JTextField username;
    JPasswordField password;
    JButton login, cancel;

    Login() {
        setBounds(500, 200, 600, 300);
        setLayout(null);

        JLabel user = new JLabel("USERNAME : ");
        user.setBounds(50, 20, 100, 30);
        add(user);

        JLabel pass = new JLabel("PASSWORD :");
        pass.setBounds(50, 80, 100, 30);
        add(pass);

        username = new JTextField("");
        username.setBounds(130, 20, 150, 30);
        add(username);

        password = new JPasswordField("");
        password.setBounds(130, 80, 150, 30);
        add(password);

        login = new JButton("LOGIN");
        login.setBounds(60, 150, 100, 20);
        login.addActionListener(this);
        add(login);

        cancel = new JButton("CANCEL");
        cancel.setBounds(180, 150, 100, 20);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("\\icons\\login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(350, 20, 200, 200);
        add(image);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String user = username.getText();
            String pass = password.getText();

            try {
                Connector c = new Connector();

                String query = "select * from login where username = '" + user + "' and password = '" + pass + "'";
                c.s.execute(query);
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()){
                    setVisible(false);
                    new Dashboard();
                    
                }else {
                    JOptionPane.showMessageDialog(null, "invalid username or password");
                    setVisible(false);
                }
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == cancel) {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Login();
    }

}
