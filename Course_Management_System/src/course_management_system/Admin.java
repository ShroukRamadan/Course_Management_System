
package studentgui;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Admin extends JFrame{
        JPanel bLeftA,bUPA,bDownA ;
        JComboBox instractorName;//for instractor to search instractor with name
           private String instractors[] 
             = {"Esraa","Shrouk","Esraa"  };
       // private ArrayList <String> instractors =new ArrayList<String>();
        JButton b4,b2,b1 ,b3,b5;
        JLabel l,l1,l2,l3;
        JComboBox studentId ;//for students to make the admin search student with ids 
           private String studentIds [] 
             = {"Esraa","shrouk","Esraa" };  
  public Admin(){ 
    setTitle("Admin"); 
    setSize(800,600); 
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    setResizable(false);
    //setVisible(true);
    setLayout(null);
    // left panel
    b1=new JButton("Add Instractor");
    b1.setBounds(25,150,150,40);
     
    b2=new JButton("Update Instractor");
    b2.setBounds(25,200,150,40);
 
    b3=new JButton("Update Student");
    b3.setBounds(25,250,150,40);

    b4=new JButton("Delete Student");
    b4.setBounds(25,300,150,40);
   
    b5=new JButton("Delete Instractor");
    b5.setBounds(25,350,150,40);
      
    bLeftA =new JPanel();
    bLeftA.setLayout(null);
    bLeftA.setBounds(0,0,200,600);
    bLeftA.setBackground(Color.CYAN);

    bLeftA.add(b1);
    bLeftA.add(b2);
    bLeftA.add(b3);
    bLeftA.add(b4);
    bLeftA.add(b5);
    
    
   this.add(bLeftA);
            //end Left panel

     // up panel
    l=new JLabel("Welcome : Mohamed ");
    l.setBounds(30,10,200,40);
    l.setFont(new Font("Arial", Font.PLAIN, 20));
    
    l1= new JLabel ("Role : Admin");
    l1.setBounds(30,40,200,40);
    l1.setFont(new Font("Arial", Font.PLAIN, 20));
    
   
    bUPA =new JPanel();
    bUPA.setLayout(null);
    bUPA.setBounds(200,0,600,100);
    bUPA.add(l);
    bUPA.add(l1);
    this.add(bUPA);
     // end up panel
     
     //down panel
    instractorName=new JComboBox(instractors);  
    instractorName.setSize(100,50);
    instractorName .setLocation(50,50); 
    
    studentId=new JComboBox(studentIds); 
    studentId.setSize(100,50);
    studentId.setLocation(200,50); 
    
    bDownA=new JPanel ();
    bDownA.setLayout(null);
    bDownA.setBounds(205,205,390,390);
   
    bDownA.add(studentId); 
    bDownA.add(instractorName);
    this.add(bDownA);
   // end down panel  
   }
}

////////////////////////////////////////////////////////////////////////
  // action listener
    
     /*   StudentId.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
             CourseDetails cd=new CourseDetails(); 
               
              cd.setVisible(true);
                             
      }
    });
    
    */// need files


