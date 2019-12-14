
package studentgui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author lenovo
 */
public class StudentFrame extends JFrame {
        
    // var for the table
        String [] Attribute ={"CId" ,"CName","Cduration","ParentCourses" ," MaxStudent"," Price "," Room "," Branch"};
        String [][] Component ={{"1235","pl2","2","cs&pl1","25","500","5","2"},
                                {"1235","pl2","2","cs&pl1","25","500","5","2"},
                                {"1235","pl2","2","cs&pl1","25","500","5","2"}};
        JTable t = new JTable(Component,Attribute);
        JScrollPane s =new JScrollPane(t);
    // the table 
    
    
     
    
    JPanel bLeft,bUP,bDown ;
           
       
        JButton b1,b2;// for each registered class
        JLabel l,l1,l2,l3;
        
      JComboBox ShowCourses;
        private String Courses[] 
             = { "Cs","IS","It" };//list for courses name 

   /////////////////////////////////////
      //  for internal frame
    JLabel l1I,l2I,l3I,l4I,l5I;
        JButton b1I,b2I;
        ////////////////////////////////
   public StudentFrame(){
    setTitle("Student"); 
    setSize(800,600); 
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    setResizable(false);
    setVisible(true);
    setLayout(null);
    // left panel
    l2=new JLabel("Our Cources");
    l2.setBounds(60,230,100,30);
    
    ShowCourses =new JComboBox(Courses);  
    ShowCourses.setFont(new Font("Arial", Font.PLAIN, 15)); 
    ShowCourses.setSize(120,30); 
    ShowCourses.setLocation(40,270); 
    
    bLeft =new JPanel();
    bLeft.setLayout(null);
    bLeft.setBounds(0,0,200,600);
    bLeft.setBackground(Color.CYAN);
    bLeft.add(ShowCourses);
    bLeft.add(l2);
    this.add(bLeft);
    //end Left panel

     // up panel
    l=new JLabel("Welcome !!");
    l.setBounds(30,20,350,30);
    l.setFont(new Font("Arial", Font.PLAIN, 20));
    this.add(l);
    l1= new JLabel ("Role : Student");
    l1.setBounds(30,60,350,30);
    l1.setFont(new Font("Arial", Font.PLAIN, 20));
    this.add(l1);

    l3 =new JLabel("Registered Courses");
    l3.setBounds(150,90,400,50);
    l3.setFont(new Font("Arial", Font.PLAIN, 25));
    
    
    
    bUP =new JPanel();
    bUP.setLayout(null);
    bUP.setBounds(200,0,400,150);
    bUP.add(l);
    bUP.add(l1);
    bUP.add(l3);
    this.add(bUP);
     // end up panel
     
     //down panel

    ///////// the table 
     
      
   //   this.add(s);
  //itis not important to add the obj of the table to the constractore if there is ascroll the as the table is aready added to the scroll then the scroll is added to the constractor
    t.setBounds(80,20,400,300);
   // t.setFillsViewportHeight(true); 
    



//s =new JScrollPane(t);
     
     
     
     
     
     
     
    bDown=new JPanel ();
    bDown.setLayout(null);
    bDown.setBounds(200,150,600,400);
 
    bDown.add(t);
    this.add(bDown);
   // end down panel          
 
   /////////////////////////////////////////////////////////
   //add actions
    ShowCourses.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
             CourseDetails cd=new CourseDetails(); 
               
              cd.setVisible(true);
                             
      }
    });
       }
   
   
   
   
   
    
    
    
    
    
    
    
    
    
    
}
    
