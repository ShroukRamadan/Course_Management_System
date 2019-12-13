/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creator;

/**
 *
 * @author DELL
 */
///
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

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author DELL
 */
public class CourseCreate  extends JFrame{
        JPanel p1,p2,p3;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    JLabel l1,l2;
    JComboBox date,month,year; 
    JRadioButton male,female;
    ButtonGroup g; 

    public CourseCreate(){
            this.setTitle("Courses");
    this.setSize(800,600);
    this.setLocation(430,100);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLayout(null);

        p1 =new JPanel();p2 =new JPanel();p3 =new JPanel();
        
    b1 =new JButton("Add course");
    b2 =new JButton("Update course");
    b3 =new JButton("Delete course");
    b4 =new JButton("Show course");
    b5 =new JButton("Graphics");
    b6 =new JButton("Multi Media");
    b7 =new JButton("Electronics");
    b8 =new JButton("DataBase");
    b9 =new JButton("LogicDesign");
    b10 =new JButton("Ethics");
    b11 =new JButton("Physics");
    b12 =new JButton("Programming");
    b13 =new JButton("Java");
    b14 =new JButton("C#");

    
    l1 =new JLabel("Welcome Ahmed");
    l2 =new JLabel("Our courses:");

            
    p1.setLayout(null);p2.setLayout(null);p3.setLayout(new FlowLayout(FlowLayout.CENTER));
    p1.setBounds(0,0,200,600);this.add(p1);
    p2.setBounds(200,0,600,600);this.add(p2);
    
    b1.setBounds(40,120,120,50);p1.add(b1);
    b2.setBounds(40,190,120,50);p1.add(b2);
    b3.setBounds(40,260,120,50);p1.add(b3);
    b4.setBounds(40,330,120,50);p1.add(b4);


    l1.setBounds(100,20,200, 30);p2.add(l1);
    l1.setFont(new Font("atilic",Font.PLAIN,25));
    l2.setBounds(65,80,200, 100);p2.add(l2);
    l2.setFont(new Font("atilic",Font.PLAIN,25));

    p3.setBounds(100,150,400,350);p2.add(p3);
    b5.setFont(new Font("atilic",Font.PLAIN,20));
    b5.setSize(220,100);p3.add(b5);
    b6.setSize(220,100);p3.add(b6);
    b6.setFont(new Font("atilic",Font.PLAIN,20));
    b7.setSize(220,100);p3.add(b7);
    b7.setFont(new Font("atilic",Font.PLAIN,20));
    b8.setSize(220,100);p3.add(b8);
    b8.setFont(new Font("atilic",Font.PLAIN,20));
    b9.setSize(220,100);p3.add(b9);
    b9.setFont(new Font("atilic",Font.PLAIN,20));
    b10.setSize(220,100);p3.add(b10);
    b10.setFont(new Font("atilic",Font.PLAIN,20));
    b11.setSize(220,100);p3.add(b11);
    b11.setFont(new Font("atilic",Font.PLAIN,20));
    b12.setSize(220,100);p3.add(b12);
    b12.setFont(new Font("atilic",Font.PLAIN,20));
    b13.setSize(220,100);p3.add(b13);
    b13.setFont(new Font("atilic",Font.PLAIN,20));
    b14.setSize(220,100);p3.add(b14);
    b14.setFont(new Font("atilic",Font.PLAIN,20));


    
    p1.setBackground(Color.CYAN);
    p2.setBackground(Color.white);   
    //p3.setBackground(Color.white);


    

    }
}
