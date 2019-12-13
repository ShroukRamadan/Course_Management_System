    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_management_system;

/**
 *
 * @author Shrouk
 */
public class Payment {
    
    private int C_id;    
    private boolean Paied; 
    
    
    
   private void setC_id(int id ){
       
       this.C_id=id;
   } 
   private int getc_id(){
      
       return this.C_id;
   }
   private void pay(){
       
       this.Paied=true;
   }
    
}
