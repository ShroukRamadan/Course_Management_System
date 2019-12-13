
package studentgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JTextField;


public class Payment extends JFrame implements ActionListener {
       
     JButton b11,b22;
     JLabel Name,Visa,Id;
     JTextField name,visa,id;
    public Payment(){

        JFrame paymentFrame = new JFrame("JOptionPane demo"); 
    
            this.setTitle("Course Payment"); 
            this.setSize(300,400);
            
            //setDefaultCloseOperation(EXIT_ON_CLOSE); 
            this.setResizable(false);
           this.setVisible(false);
           this.setLayout(null);
    
     b11=new JButton("Pay Now");
     b11.setBounds(15,300,120,30);    
     b22=new JButton("Cancle");
     b22.setBounds(160,300,120,30);
    
     
     Id=new JLabel("Enter Your Id");
     Id.setBounds(50,130,200,30);
     
     Name=new JLabel("Enter Your Name");
     Name.setBounds(50,80,200,30);
     
     Visa=new JLabel("Enter your Visa Card Number");
     Visa.setBounds(50,180,200,30);
 
     id=new JTextField();
     id.setBounds(50,110,200,30);
     name=new JTextField();
     name.setBounds(50,160,200,30);
     visa=new JTextField(); 
     visa.setBounds(50,210,200,30);
     
     this.add(Id);
     this.add(Name);
     this.add(Visa);
     this.add(id);
     this.add(name);
     this.add(visa);
     this.add(b11);
     this.add(b22);
     b22.addActionListener(this);
    }  
              
    
     


    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource()==b22){
                 
              this.dispose();
          
          }  
    
    
    }
        
        
    }
