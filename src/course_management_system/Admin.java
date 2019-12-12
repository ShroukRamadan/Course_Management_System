/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author hp
 */
public class Admin  extends User{
    
    
   /* public void AddStudent(){
        Student x= new Student();
        if(x.AddStudent()==true)
            x.toString();
        else
            System.out.println("error in insertion");
    }*/

    
   public void DeleteStudent(){
       Student x= new Student();
       x.DeleteStudent(ID);
       System.out.println("Deleted Successfully :)");
   }
   
   public void UpdateStudent(int oldid,Student newvalue){
       Student x= new Student();
       x.UpddateStudent(oldid, newvalue);
       System.out.println("Updated successfully");
   }
   
   public void AddInstructor(){
       Instructor i = new Instructor();
       if(i.AddInstructor()==true)
           i.toString();
       else
            System.out.println("error in insertion");
      
   }
   
   public void DeleteInstructor(){
        Instructor i = new Instructor();
        i.DeleteInstructors(ID);
         System.out.println("Deleted Successfully :)");
   }
   
    public void UpdateInstructor(int oldid,Instructor newvalue){
       Instructor i = new Instructor();
       i.UpdateInstructor(oldid, newvalue);
       
   }
   @Override
    public void setPassword(String password) {
        this.password = password;
    }

   @Override
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return Username;
    }
    
    
}
