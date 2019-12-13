
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

/**
 *
 * @author lenovo
 */
public class StudentFrame extends JFrame {
        JPanel bLeft,bUP,bDown ;
        JScrollBar s;   
       
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
    l.setBounds(30,60,350,40);
    l.setFont(new Font("Arial", Font.PLAIN, 20));
    this.add(l);
    l1= new JLabel ("Role : Student");
    l1.setBounds(30,40,350,40);
    l1.setFont(new Font("Arial", Font.PLAIN, 20));
    this.add(l1);
   
    bUP =new JPanel();
    bUP.setLayout(null);
    bUP.setBounds(200,0,400,200);
    bUP.add(l);
    bUP.add(l1);
    this.add(bUP);
     // end up panel
     
     //down panel
    l3 =new JLabel("Registered Courses");
    l3.setBounds(150,20,300,50);
    l3.setFont(new Font("Arial", Font.PLAIN, 25));
        
  
    bDown=new JPanel ();
    bDown.setLayout(null);
    bDown.setBounds(200,200,400,400);
   
    bDown.add(l3);
    
    this.add(bDown);
   // end down panel
 ///////////////////////////////////////////////////////////////////////////
 // internal frame course details
    /*
      
 JInternalFrame internalF=new JInternalFrame();
            
            internalF.setTitle("Course Details"); 
            internalF.setSize(200,400);
            internalF.setLocation(200,400);
            internalF.setDefaultCloseOperation(EXIT_ON_CLOSE); 
            internalF.setResizable(false);
           // setVisible(true);
            internalF.setLayout(null);

            l1I=new JLabel("Course Name :");
            l1I.setBounds(100,25,150,50);
            l2I=new JLabel("Pre Courses :");
            l2I.setBounds(100,100,150,50);
            l3I=new JLabel("Course Price :");
            l3I.setBounds(100,175,150,50);
            l4I=new JLabel("Starting Time :");
            l4I.setBounds(100,250,150,50);
            l5I=new JLabel("Ending Time :");
            l5I.setBounds(100,325,150,50);
            
            b1I=new JButton("Enroll Now");
            b1I.setBounds(100,425,100,35);
            
            b2I=new JButton("Cancel");
            b2I.setBounds(300,425,100,35);        
            
            
            internalF.add(l1I);
            internalF.add(l1I);
            internalF.add(l2I);
            internalF.add(l3I);
            internalF.add(l4I);
            internalF.add(l5I);
            internalF.add(b1I);
            internalF.add(b2I);
   internalF.show();*/
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
    
    
    
    
    
    
    
    
    
    
    
    
