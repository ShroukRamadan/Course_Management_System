/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_management_system;

import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author Shrouk
 */
public class Student extends User implements Ilogin {
    
    
     //belong to class rather than object..
   public static ArrayList<Student> students = new ArrayList<Student>();
   
   private final String FileStudent= "Student.txt";
   
   FileManager file= new FileManager();
   Student s;
    public Student()
    {
    
    }

    public Student(String Uname, String E_mail, String Address, int ID, int Pnum, int pss)
    {
        super(Uname, E_mail, Address, ID, Pnum, pss);
    }
 
   
   public void SignUp(int id,String Fname,String lname,String username,String Email,String address,int Pnum,int pass ,Gender gender)    ////////////////////////waiting
   {
       
   }
   public boolean Login(String Email, String Password) {
        ReadFromFile();
        for (Student x : students) {
            if (Email.equals(x.E_mail) && Password.equals(x.pss)) {
                return true;
            }
        }
        return false;
    }
    
    

   
    //ID $ Fname $ Lname $ Address $ E_mail $ Pnum $ Uname $ pss 
   
   private String Studentdata()
   {
      return super.ID+"$"+super.Fname+"$"+super.Lname+"$"+super.Address+"$"+super.E_mail+"$"+super.Pnum+"$"+super.Uname+"$"+super.pss+"$";
   }
   
  
   
   private void ChangesFile(){
       file.write(students.get(0).Studentdata(),FileStudent , false);                              //object number 0 in array will hava data from function then write it into file
       for(int i =1 ;i<students.size();i++){
           file.write(students.get(i).Studentdata(),FileStudent, true);
       }
         
   }
   
   //at this point i write every thing about students inside file
   
   //so in this section i read and made some operations on this data
   
   private void ReadFromFile(){
      students=(ArrayList<Student>)(Object) file.read(FileStudent);
   }
   
   
   // i will reach to specific student in arraylist by id
   private int getstudent(int id){
       for(int i=0;i<students.size();i++){
           if(students.get(i).getID()==id)
               return i;
       }
       return -1;
       
   }
   
   //just take object from class student inside function
    public String ShowAllStudent() {
        ReadFromFile();
        String S = "\nAll Student Data:\n";
        for (Student x : students) {
            S = S + x.toString();
        }
        return S;
    }
    
//   public String SurveySpecificcourse(){
//   return"done";
//   }
   
//   public void ShowGradeOfSpecificCourse(){};
   
   
   public boolean AddStudent(){
       if(file.write(Studentdata(),FileStudent, true)){
           return true;
       }
       else{
           return false;
       }
   }
   
    
    public void DeleteStudent(int id){
        ReadFromFile();
        int index =getstudent(id);
        students.remove(index);
        ChangesFile();
    }
    
    public void UpddateStudent(int oldid ,Student x){
        ReadFromFile();
        int index =getstudent(oldid);
        students.set(index, x);  //assign new value to new variable 
        ChangesFile();
    }
    public String SearchStudent(int id){
        ReadFromFile();
        int index = getstudent(id);
        if(index!=-1){
            return "Found\n";
        }
        else
            return"Not Found\n";
    }
     
   
     public String toString() {
        return "\nI'm Eng : " + Fname + " " + Lname + "\n" + "ID : " + ID + 
                "\nUserName: " + Uname + "\t Password: " + pss + "\n";
    }


    
    
}
