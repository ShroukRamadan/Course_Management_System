
package studentgui;
import studentgui.Payment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;



public class CourseDetails extends JFrame implements ActionListener {
        JLabel l1,l2,l3,l4,l5;
        JButton b1,b2;
        
    public CourseDetails(){

            
            setTitle("Course Details"); 
            setSize(500,500);
            
            //setDefaultCloseOperation(EXIT_ON_CLOSE); 
            setResizable(false);
           // setVisible(true);
            setLayout(null);

            l1=new JLabel("Course Name :");
            l1.setBounds(100,25,150,50);
            l2=new JLabel("Pre Courses :");
            l2.setBounds(100,100,150,50);
            l3=new JLabel("Course Price :");
            l3.setBounds(100,175,150,50);
            l4=new JLabel("Starting Time :");
            l4.setBounds(100,250,150,50);
            l5=new JLabel("Ending Time :");
            l5.setBounds(100,325,150,50);
            
            b1=new JButton("Enroll Now");
            b1.setBounds(100,425,100,35);
            
            b2=new JButton("Cancel");
            b2.setBounds(300,425,100,35);        
            
            
            this.add(l1);
            this.add(l1);
            this.add(l2);
            this.add(l3);
            this.add(l4);
            this.add(l5);
            this.add(b1);
            this.add(b2);

    
 
     b1.addActionListener(this);
     b2.addActionListener(this);
    
              
    }
      /* @Override
    public void actionPerformed(ActionEvent ae) {
        
        
}           
            //String x= "   Please enter your visa card number to enroll   ";
            //int visaNumber =parseInt( JOptionPane.showInputDialog(x,"")); 
       if (ea.getSource()==b1){   
      /*      String x= "   Please enter your visa card number to enroll   ";
            int visaNumber =parseInt( JOptionPane.showInputDialog(x,""));    
         */

    @Override
    public void actionPerformed(ActionEvent e) {
          if (e.getSource()==b1){
               Payment P =new Payment();
                 
                   P.setVisible(true);
          
            }
          else if (e.getSource()==b2){
                 
              this.dispose();
          
          }  
    
          
          
          
          
          
          
          
          
          
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
