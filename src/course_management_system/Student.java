/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Student extends User {
  //belong to class rather than object..
   public static ArrayList<Student> students = new ArrayList<Student>();
   
   private final String FileStudent= "Student.txt";
   
   FileManager filemanager = new FileManager();

    public Student() {}

    public Student(String fname, String lname, String E_mail, String Address, int ID, int Pnum, String password, String Username) {
        super(fname, lname, E_mail, Address, ID, Pnum, password, Username);
    }
    
    

   
    //201801001@esraa@Tamer@address@esraatamer022GAMIL.com@phone number@username@password@
   private String Studentdata(){
      return super.ID+"@"+super.fname+"@"+super.lname+"@"+super.Address+"@"+super.E_mail+"@"+super.Pnum+"@"+super.Username+"@"+super.password+"@";
   }
   
  
   
   private void ChangesFile(){
       filemanager.write(students.get(0).Studentdata(),FileStudent , false); //object number 0 in array will hava data from function then write it into file
       for(int i =1 ;i<students.size();i++){
           filemanager.write(students.get(i).Studentdata(),FileStudent, true);
       }
         
   }
   
   //at this point i write every thing about students inside file
   
   //so in this section i read and made some operations on this data
   
   private void ReadFromFile(){
      students=(ArrayList<Student>)(Object) filemanager.read(FileStudent);
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
    
   public String SurveySpecificcourse(){
   return"done";
   }
   
   public void ShowGradeOfSpecificCourse(){};
   
   
   public boolean AddStudent(){
       if(filemanager.write(Studentdata(),FileStudent, true)){
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
        return "\nI'm Eng : " + fname + " " + lname + "\n" + "ID : " + ID + 
                "\nUserName: " + Username + "\t Password: " + password + "\n";
    }
}
