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
import java.util.ArrayList;
public class Instructor extends User {
    int work_hour;
    ArrayList<Instructor>instructor=new ArrayList();
    

    public Instructor() {
    }

    
    

    public Instructor(int work_hour, String Uname, String E_mail, String Address, int ID, int Pnum, int pss) {
        super(Uname, E_mail, Address, ID, Pnum, pss);
        this.work_hour = work_hour;
    }

    

      
    
    
    public void SearchForInstructor(){
    
    }
    
    public void AddInstructor(){
    
    }
   public void DeleteInstructor(){
   
   }
   public void UpdataInstructor(){
   
   }
   
   public void ShowAllInstructors(){
   
   }
   public void ShowGrade(){
   
   }
   
   public void AddGrade(){
   
   }
   public void DeleteGrade(){
   
   
   }
   public void UpdateGrade(){
   
   }
   
}
