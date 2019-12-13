/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_management_system;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class MyException extends Exception{
    
    
     public MyException()
    {
        super();
    }
    public MyException(String s)
    {
        super(s);
    }
    @Override
    public String toString()
    {
        return "My Exception";
}
    
    
    
    
     int checkPositive(String x){
        int number;
        do {
            // will print to user message while input  into label
          number = Integer.parseInt(JOptionPane.showInputDialog("Enter Positive Number for "+x +" !"));
            if (number <= 0) {
                //will print this message when user input wrong data
                JOptionPane.showMessageDialog(null, "Not valid Input for Positive Int Tray Again :(");
            }
        } while (number <= 0);

        return number;
    }
     
      String checkPassLength(String x){
       String password;
        do {
            // will print to user message while input  into label
            password = JOptionPane.showInputDialog("Enter more than 8 char for "+x +" !");
            if (password.length()<8) {
                 //will print this message when user input wrong data
                JOptionPane.showMessageDialog(null, "Not valid Password length Tray Again :(");
            }
        } while (password.length()<8);

        return password;
    }

     
     
     
    String checkEmail(String x){
        String Email;
        do {
             // will print to user message while input  into label
            Email = JOptionPane.showInputDialog("Enter Valid input for "+x +" !");
            if (!Email.contains("@") || !Email.contains(".")) {
                 //will print this message when user input wrong data
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Tray Again :(");
            }
        } while (!Email.contains("@") || !Email.contains("."));
        

        return Email;
   }
    
    
    
    
    
}

