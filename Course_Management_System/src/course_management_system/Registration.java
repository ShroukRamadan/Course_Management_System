
package studentgui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Registration extends JFrame{
//initialization
    JPanel p1,p2;
    JButton b1,b2;
    JTextField t1,t2,t3,t4,t5,t6;
    JLabel l1,l2,l3,l4,l5,l6;
    JComboBox date,month,year; 
    JRadioButton male,female;
    ButtonGroup g; 

    

    String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" }; 
    String years[] 
        = { 
            "1991", "1992", "1993", "1994",
            "1995", "1996", "1997", "1998", 
            "1999", "2000", "2001", "2002", 
            "2003", "2004", "2005", "2006", 
            "2007", "2008", "2009", "2010", 
            "2011", "2012", "2013", "2014", 
            "2015", "2016", "2017", "2018", 
            "2019" ,"2020"}; 


    public Reg(){
    //start
    this.setTitle("Login Form");
    this.setSize(800,600);
    this.setLocation(430,100);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLayout(null);
    
    p1 =new JPanel();p2 =new JPanel();
    b1 =new JButton("Login");
    b2 =new JButton("Register");
    t1 =new JTextField("");
    t2 =new JTextField("");
    t3 =new JTextField("First name");
    t4 =new JTextField("Surname");
    t5 =new JTextField("Email address");
    t6 =new JTextField("New password");
    l1 =new JLabel("Email:");
    l2 =new JLabel("Password:");
    l3 =new JLabel("Create a new account");
    l4 =new JLabel("It's quick and easy");
    l5 =new JLabel("Birthday");
    l6 =new JLabel("Udemy");
    male =new JRadioButton("Male");
    female =new JRadioButton("Female");
    g =new ButtonGroup();
    
    p1.setLayout(null);p2.setLayout(null);
    p1.setBounds(0,0,800,100);this.add(p1);
    p2.setBounds(0,100,800,500);this.add(p2);
    l1.setBounds(200,15,100,10);p1.add(l1);
    t1.setBounds(200,30,200,25);p1.add(t1);
    l2.setBounds(420,15,100,10);p1.add(l2);
    t2.setBounds(420,30,200,25);p1.add(t2);
    b1.setBounds(630,31,70,20);p1.add(b1);
    l3.setBounds(400,10,300,25);p2.add(l3);
    l3.setFont(new Font("atilic",Font.PLAIN,20));
    l4.setBounds(400,35,300,25);p2.add(l4);
    l4.setFont(new Font("atilic",Font.PLAIN,20));
    
    t3.setBounds(400,70,150,30);p2.add(t3);
    t4.setBounds(560,70,150,30);p2.add(t4);
    t5.setBounds(400,110,310,30);p2.add(t5);
    t6.setBounds(400,150,310,30);p2.add(t6);
    l5.setBounds(400,200,310,30);p2.add(l5);
    
    l6.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
    l6.setBounds(10,0,100,70);p1.add(l6);

    date = new JComboBox(dates);
    date.setFont(new Font("Arial", Font.PLAIN, 15)); 
    date.setBounds(400,230,60,20);
    p2.add(date);
    
    month = new JComboBox(months);
    month.setFont(new Font("Arial", Font.PLAIN, 15));
    month.setBounds(470,230,60,20);
    p2.add(month); 
  
    year = new JComboBox(years); 
    year.setFont(new Font("Arial", Font.PLAIN, 15));
    year.setBounds(540,230,60,20);
    p2.add(year); 
    
            male = new JRadioButton("Male"); 
        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
        male.setSelected(true); 
        male.setBounds(400,260,75,20);
        p2.add(male); 
  
        female = new JRadioButton("Female"); 
        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
        female.setSelected(false); 
        female.setBounds(480,260,80,20);
        p2.add(female); 

        g = new ButtonGroup(); 
        g.add(male); 
        g.add(female); 

        b2.setBounds(400,290,200,30);p2.add(b2);

    
    p1.setBackground(Color.CYAN);
    p2.setBackground(Color.white);

  
  
  
  
  }
  
  
  
  
  }
    
    
    
    
    
    
    
}
}