/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
/**
 *
 * @author DELL
 */

////////
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mail_gui extends JFrame implements ActionListener{
    JPanel p1,p2;
    JButton b1,b2,b3;
    JTextField t,t1,t2,t3;
    JTextField a;
    JLabel l,l1,l2,l3,l4;

public  Mail_gui (){
    this.setTitle("Report");
    this.setSize(800,600);
    this.setLocation(430,100);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLayout(null);
    
    p1 =new JPanel()   ;
    b1 =new JButton("Compose");
    b2 =new JButton("Sent mail");
    b3 =new JButton("Send");
    
    t =new JTextField("");
    t1 =new JTextField("");
    t2 =new JTextField("");
    t3 =new JTextField("");
    l =new JLabel("New message");
    l1 =new JLabel("To:");
    l2 =new JLabel("Cc:");
    l3 =new JLabel("Subject");
    l4 =new JLabel("Mail");
    a=new JTextField();
    
//    a =new JTextArea("dsda",10,20);
//            a.setLineWrap(true);
//
//          JScrollPane scrollPane = new JScrollPane(a);


    p1.setLayout(null);
    p1.setBounds(0,0,200,600);
    this.add(p1);
    
    b1.setBounds(25,100,150,40);p1.add(b1);
    b2.setBounds(25,200,150,40);p1.add(b2);
 
 
    p1.setBackground(Color.CYAN);
    //p2
    ;p2 =new JPanel();
    p2.setLayout(null);
    p2.setBounds(200,0,600,600);this.add(p2);
    
    l.setBounds(20,40,200,30);p2.add(l);
    l.setFont(new Font("atilic",Font.PLAIN,25));
    l1.setBounds(100,100,30,25);p2.add(l1);
    t1.setBounds(180,100,200,25);p2.add(t1);
    l2.setBounds(100,150,50,25);p2.add(l2);
    t2.setBounds(180,150,200,25);p2.add(t2);
    l3.setBounds(100,200,50,25);p2.add(l3);
    t3.setBounds(180,200,200,25);p2.add(t3);
    l4.setBounds(100,250,50,25);p2.add(l4);
    a.setBounds(180,250,200,100);p2.add(a);
    b3.setBounds(245,370,70,40);p2.add(b3);
    p2.setBackground(Color.white);
    //l3.setFont(new Font("atilic",Font.PLAIN,20));
    //p3 
    


    b3.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b3){
            String sn=JOptionPane.showInputDialog("Enter Spot Number");
            FWrite_gui.re("Abc.txt",sn);
            t1.setText(sn);
        }
    }

}
