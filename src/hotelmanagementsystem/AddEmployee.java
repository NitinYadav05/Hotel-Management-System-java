
package hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class AddEmployee extends JFrame implements ActionListener {
JLabel name ,age ,gender ,jobs ,eslry ,pno ,mail ;
JTextField ename,eage,eno,email;
JRadioButton mgender,fgender;
JComboBox ejob, slry;
JButton submit;
    AddEmployee(){
        setBounds(250,100,850,550);
        setLayout(null);
        
        ImageIcon i2 = new ImageIcon (ClassLoader.getSystemResource("icons/bg.jpg"));
        JLabel bg = new JLabel(i2);
        bg.setBounds(0,0,850,550);
        add(bg);
        
        
        name = new JLabel("NAME :");
        name.setForeground(Color.BLACK);
        name.setBounds(500,30,100,20);
        name.setFont(new Font ("serif", Font.PLAIN,20));
        bg.add(name);
        
        ename = new JTextField();
        ename.setBounds(630,30,150,25);
        bg.add(ename);
        
        age = new JLabel("AGE :");
        age.setForeground(Color.BLACK);
        age.setBounds(500,80,100,20);
        age.setFont(new Font ("serif", Font.PLAIN,20));
        bg.add(age);
        
        eage = new JTextField();
        eage.setBounds(630,80,150,25);
        bg.add(eage);
        
        gender = new JLabel("SEX :");
        gender.setForeground(Color.BLACK);
        gender.setBounds(500,130,100,20);
        gender.setFont(new Font ("serif", Font.PLAIN,20));
        bg.add(gender);
        
        mgender = new JRadioButton("MALE");
        mgender.setBounds(630,130,70,20);
        bg.add(mgender);
        
        fgender = new JRadioButton("FEMALE");
        fgender.setBounds(700,130,80,20);
        bg.add(fgender);
        
        ButtonGroup but = new ButtonGroup();
        but.add(mgender);
        but.add(fgender);
        
        
        jobs = new JLabel("JOBS :");
        jobs.setBounds(500,180,100,20);
        jobs.setFont(new Font ("serif", Font.PLAIN,20));
        bg.add(jobs);
        
        String a[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
        ejob = new JComboBox(a);
        ejob.setBounds(630,180,150,20);
        ejob.setFont(new Font ("serif",Font.PLAIN,15));
        bg.add(ejob);
        
        eslry = new JLabel ("SALARY :");
        eslry.setBounds(500,230,150,20);
        eslry.setFont(new Font ("serif", Font.PLAIN,20));
        bg.add(eslry);
        
        String b[] = {"10000","5000","20000","15000","20000","15000","50000","60000","30000"};
        slry = new JComboBox(b);
        slry.setBounds(630,230,150,20);
        slry.setFont(new Font ("serif",Font.PLAIN,15));
        bg.add(slry);
        
        pno = new JLabel("PHONE NO :");
        pno.setBounds(500,280,150,20);
        pno.setFont(new Font ("serif", Font.PLAIN,20));
        bg.add(pno);
        
        eno = new JTextField();
        eno.setBounds(630,280,150,25);
        bg.add(eno);
        
        mail = new JLabel("EMAIL :");
        mail.setBounds(500,330,150,20);
        mail.setFont(new Font ("serif", Font.PLAIN,20));
        bg.add(mail);
        
        email = new JTextField();
        email.setBounds(630,330,150,25);
        bg.add(email);
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(550,420,150,50);
        submit.addActionListener(this);
        bg.add(submit);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
       String name =ename.getText();
       String age =eage.getText();
       String phone =eno.getText();
       String gmail =email.getText();
       
       String gender = null;
       if (mgender.isSelected()){
           gender = "male";
       }else if (fgender.isSelected()){
           gender = "female";
       }
       
       String j =  (String) ejob.getSelectedItem();
       String salary = (String) slry.getSelectedItem();
       
       try{
            Connector c = new Connector();
            String query = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+j+"','"+salary+"','"+phone+"','"+gmail+"')";
            
            c.s.executeUpdate(query);
           
       }catch (Exception e){
           e.printStackTrace();
       }
       
       
        setVisible (false);
        JOptionPane.showMessageDialog(null, "Employee Added Successfully");
        new Dashboard();
    }
    
    
     
    public static void main(String[] args){
      new AddEmployee();
}
}


