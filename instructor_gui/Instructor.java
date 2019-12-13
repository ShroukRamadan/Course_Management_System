/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instructor_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mail.FWrite;
/**
 *
 * @author DELL
 */
public class Instructor extends JFrame implements ActionListener{
    JButton b1,b2;
    JPanel p1,p2;
    JLabel l,l1,l2;
    JTextField t1,t2;
    
    public Instructor(){
    this.setTitle("Instructor");
    this.setSize(800,600);
    this.setLocation(430,100);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLayout(null);

    p1 =new JPanel();p2 =new JPanel();
    b1 =new JButton("Show grades");
    b2 =new JButton("Add grade");
    t1 =new JTextField("");
    t2 =new JTextField("");
    l1 =new JLabel("Student ID:");
    l2 =new JLabel("Grade:");
    l =new JLabel("Welcome Dr:Ahmed");
    
//    JMenuBar mb =new JMenuBar();
//    JMenu m1=new JMenu("Setting");
//    JMenuItem mi1=new JMenuItem("Update");
//    JMenuItem mi2=new JMenuItem("Log Out");
    
//      JMenu  m1=new JMenu("Setting");
//       m1.setFont(new Font("atilic",Font.ITALIC,18));
//       m1.setBounds(0,0,70, 30);
//
//      JMenuBar  bb1=new JMenuBar();
//      JButton  n1=new JButton("Logout");JButton n2=new JButton("Update");
    
    p1.setLayout(null);p2.setLayout(null);
    p1.setBounds(0,0,200,600);this.add(p1);
    p2.setBounds(200,0,600,600);this.add(p2);
    b1.setBounds(40,250,120,50);p1.add(b1);

    l .setBounds(160,30,300,30);p2.add(l);
    l.setFont(new Font("atilic",Font.ITALIC,30));
    l1.setBounds(200,150,100,10);p2.add(l1);
    t1.setBounds(200,165,200,25);p2.add(t1);
    l2.setBounds(200,195,100,10);p2.add(l2);
    t2.setBounds(200,210,200,25);p2.add(t2);
    b2.setBounds(200,240,200,25);p2.add(b2);
    
   // l4.setFont(new Font("atilic",Font.PLAIN,20));

//    m1.add(mi1);m1.add(mi2);
//    m1.add(m1);
//   this.setJMenuBar(mb);
//    mb.setBounds(0,0,50,50);p1.add(mb);
//       m1.add(n1);m1.add(n2);
//       bb1.add(m1);
//       bb1.setBounds(0, 0, 70, 30);
//       p1.add(bb1);
    p1.setBackground(Color.CYAN);
    p2.setBackground(Color.white);
    b2.addActionListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b2){
            String sn=JOptionPane.showInputDialog("Enter Spot Number");
            FWrite.re("Instructor_file.txt",sn);
            t2.setText(sn);
        }

    }
}
