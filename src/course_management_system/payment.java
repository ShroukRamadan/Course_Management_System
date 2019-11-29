
package courses.management.system;

public class payment {
    private int C_id;     // id card 
    private boolean Paied; // true if student paied for enrolled course 
    
    
    
   private void setC_id(int id ){
       //method to  set card id 
       this.C_id=id;
   } 
   private int getc_id(){
       //method to get id
       return this.C_id;
   }
   private void pay(){
       //method turn true when it used from student to enroll new course 
       this.Paied=true;
   }
}
