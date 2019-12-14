/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DELL
 */
public class Admin_gui extends JFrame implements ActionListener{
    JPanel p1,p2,p3,p4;
    JButton b1,b2,b4,b5,b7,b8;
    JTextField t,t1,t2,t3,t4,t6,t7,t8,t9,t10;
    JPasswordField t5,t11;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JComboBox Subject;
        String Subjects[] = { "CS", "IS", "Phusics", "PL2", "Logic"}; 

public Admin_gui(){
        this.setTitle("Login Form");
    this.setSize(800,600);
    this.setLocation(430,100);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLayout(null);
       // p4 =new JPanel();
     p1 =new JPanel()   ;
    b1 =new JButton("Add New Student");
    b2 =new JButton("List All Student");
    
    b4 =new JButton("Add new instructor");
    b5 =new JButton("List all instructor");
    
    b7 =new JButton("Add Student");
    b8 =new JButton("Add instructor");    
    
    t =new JTextField("");
    t1 =new JTextField("");
    t2 =new JTextField("");
    t3 =new JTextField("");
    t4 =new JTextField("");
    t5 =new JPasswordField("");
    l =new JLabel("Add new student...");
    l1 =new JLabel("ID:");
    l2 =new JLabel("Fname:");
    l3 =new JLabel("Lname");
    l4 =new JLabel("Email");
    l5 =new JLabel("password");
   //  p3.setLayout(null);p4.setLayout(null);
     //p1
    p1.setLayout(null);
    p1.setBounds(0,0,200,600);this.add(p1);
    
    b1.setBounds(25,100,150,40);p1.add(b1);
    b2.setBounds(25,200,150,40);p1.add(b2);
 
    b4.setBounds(25,300,150,40);p1.add(b4);  
    b5.setBounds(25,400,150,40);p1.add(b5);
 
    p1.setBackground(Color.CYAN);
    //p2
    ;p2 =new JPanel();
    p2.setVisible(false);
    p2.setLayout(null);
    p2.setBounds(200,0,600,600);this.add(p2);
    
    l.setBounds(20,50,200,25);p2.add(l);
    l.setFont(new Font("atilic",Font.PLAIN,20));
    l1.setBounds(100,100,30,25);p2.add(l1);
    t1.setBounds(180,100,200,25);p2.add(t1);
    l2.setBounds(100,150,50,25);p2.add(l2);
    t2.setBounds(180,150,200,25);p2.add(t2);
    l3.setBounds(100,200,50,25);p2.add(l3);
    t3.setBounds(180,200,200,25);p2.add(t3);
    l4.setBounds(100,250,50,25);p2.add(l4);
    t4.setBounds(180,250,200,25);p2.add(t4);
    l5.setBounds(100,300,70,25);p2.add(l5);
    t5.setBounds(180,300,200,25);p2.add(t5);
    b7.setBounds(200,380,150,40);p2.add(b7);
    p2.setBackground(Color.white);
    //l3.setFont(new Font("atilic",Font.PLAIN,20));
    b1.addActionListener(this);
    //p3 
    p3 =new JPanel();
    p3.setVisible(false);
    p3.setLayout(null);
    p3.setBounds(200,0,600,600);this.add(p3);
    
    t6 =new JTextField("");
    t7=new JTextField("");
    t8 =new JTextField("");
    t9 =new JTextField("");
    t10 =new JTextField("");
    t11 =new JPasswordField("");
    l6 =new JLabel("Add new instructor...");
    l7 =new JLabel("ID:");
    l8 =new JLabel("Fname:");
    l9 =new JLabel("Lname");
    l10 =new JLabel("Email");
    l11 =new JLabel("password");
    l12 =new JLabel("Subject");
    
    l6.setBounds(20,50,200,25);p3.add(l6);
    l6.setFont(new Font("atilic",Font.PLAIN,20));
    l7.setBounds(100,100,30,25);p3.add(l7);
    t7.setBounds(180,100,200,25);p3.add(t7);
    l8.setBounds(100,150,50,25);p3.add(l8);
    t8.setBounds(180,150,200,25);p3.add(t8);
    l9.setBounds(100,200,50,25);p3.add(l9);
    t9.setBounds(180,200,200,25);p3.add(t9);
    l10.setBounds(100,250,50,25);p3.add(l10);
    t10.setBounds(180,250,200,25);p3.add(t10);
    l11.setBounds(100,300,70,25);p3.add(l11);
    t11.setBounds(180,300,200,25);p3.add(t11);
    l12.setBounds(100,350,70,25);p3.add(l12);
    Subject = new JComboBox(Subjects);
    Subject.setFont(new Font("Arial", Font.PLAIN, 15)); 
    Subject.setBounds(180,350,100,25);
    p3.add(Subject);
    b8.setBounds(200,410,150,40);p3.add(b8);
    p3.setBackground(Color.white);
    b4.addActionListener(this);


}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            p2.setVisible(true);
            p3.setVisible(false);
        }
        else if(e.getSource()==b4){
        p2.setVisible(false);
        p3.setVisible(true);
    }
        
    }
    
}
