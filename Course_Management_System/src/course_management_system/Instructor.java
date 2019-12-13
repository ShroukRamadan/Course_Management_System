/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_management_system;

import java.util.ArrayList;

/**
 *
 * @author Shrouk
 */


public class Instructor extends User{
    
   private String work_time;
   private String Coursename;
   private double Grades;
   public static ArrayList<Instructor> instructors = new ArrayList<Instructor>();
   private final String FileInstructor= "Instructor.txt";
   FileManager filemanager = new FileManager();
   
   
    //1@Ayman@Ezzat@address@email@phonenumber@coursename@worktimes2pm to 4pm@username@password@
    private String Instructordata(){
      return super.ID+"@"+super.Lname+"@"+super.Lname+"@"+super.Address+"@"+super.E_mail+"@"+super.Pnum+"@"+this.Coursename+"@"+this.work_time+"@"+super.Uname+"@"+super.pss+"@";
   }
   
    
    private void ChangesFile(){
        filemanager.write(instructors.get(0).Instructordata(),FileInstructor,false);
        for(int i=1;i<instructors.size();i++){
            filemanager.write(instructors.get(i).Instructordata(),FileInstructor,true);
        }
    }
   
    //at this point i write every thing about instructors inside file
   
   //so in this section i read and made some operations on this data
    private int getinstructor(int id){
        for(int i=0;i<instructors.size();i++){
            if(instructors.get(i).getID()==id)
                return i;
        }
        return -1;
    }
    
    public void publish(){};///think about it;
    public void ReadFromFile(){
        instructors = (ArrayList<Instructor>)(Object)filemanager.read(FileInstructor);
    }
            
    
     public boolean AddInstructor(){
        if(filemanager.write(Instructordata(), FileInstructor, true))
            return true;
        else
            return false;
    }
   
    public void DeleteInstructors(int id){
        ReadFromFile();
        int index =getinstructor(id);
        instructors.remove(index);
        ChangesFile();
    }
    
    public void UpdateInstructor(int oldid,Instructor s){
       ReadFromFile();
       int index= getinstructor(oldid);
       instructors.set(index, s);
       ChangesFile();
    }
    public Instructor() {
    }

    public Instructor(String work_time, String Coursename, String Uname, String E_mail, String Address, int ID, int Pnum, int pss) {
        super(Uname, E_mail, Address, ID, Pnum, pss);
        this.work_time = work_time;
        this.Coursename = Coursename;
    }

    

    public void setWork_time(String work_time) {
        this.work_time = work_time;
    }

    public void setCoursename(String Coursename) {
        this.Coursename = Coursename;
    }

    public void setGrades(double Grades) {
        this.Grades = Grades;
    }

    public String getWork_time() {
        return work_time;
    }

    public String getCoursename() {
        return Coursename;
    }

    public double getGrades() {
        return Grades;
    }
    
   @Override
     public String toString() {
        return "\nI'm Eng : " + Fname + " " + Lname + "\n" + "ID : " + ID + 
                "\nUserName: " + Uname + "\t Password: " + pss + "\n";}
       
}
