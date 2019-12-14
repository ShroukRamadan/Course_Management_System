
package studentgui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class tables extends JFrame{
        // var for the table
        String [] A ={"Id","FName","LName","Adress" ,"Email"," Phone-Num ","Username","passwored"};
        String [][] C ={{"1235","pl2","Omar","cs&pl1","25","500","5","2"}};
        JTable t ;
        JScrollPane s;
        // the table 
       JTable t=new JTable(C,A);
        
        
        
        
        public tables(){
            setTitle("All Students"); 
            setSize(800,600); 
            setDefaultCloseOperation(EXIT_ON_CLOSE); 
            setResizable(false);
            setVisible(true);
            setLayout(null);

            this.add(s);
            
            
            
            
            t = new JTable(Component,Attribute);
             
             s =new JScrollPane(t);
     
        
        
        
        
        
        
        
        
        
        
        }
        
        
        
        
}
