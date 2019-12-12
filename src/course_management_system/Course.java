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
import java.io.Serializable;
enum Branch{Cairo};


public class Course implements Serializable{
    
  private String Cname,CID;
  private float C_Hour;
  private float price;
  private Branch branch;
  private int maxstudent;
  private int Room_Num; 
  ParentCourse PCour;
  
  
  
  FileManager FM=new FileManager();
  private final String CourseFileName = "Courses.txt";
  Course C=new Course();
  public static ArrayList<Course> Courses = new ArrayList<Course>();
   
   
  public Course()                                                           ////////defult constructor////////////////
  {
  
  }

  public Course(String Cname, String CID, float C_Hour, float price, Branch branch, int maxstudent,int room_num, ParentCourse PCour) {
        this.Cname = Cname;
        this.CID = CID;
        this.C_Hour = C_Hour;
        this.price = price;
        this.branch = branch;
        this.maxstudent=maxstudent;
        this.Room_Num = room_num;
        this.PCour = PCour;
    }
    

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public void setC_Hour(float C_Hour) {
        this.C_Hour = C_Hour;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setRoom_Num(int Room_Num) {
        this.Room_Num = Room_Num;
    }
    
    

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void setMaxstudent(int maxstudent) {
        this.maxstudent = maxstudent;
    }

    public String getCname() {
        return Cname;
    }

    public String getCID() {
        return CID;
    }

    public float getC_Hour() {
        return C_Hour;
    }

    public float getPrice() {
        return price;
    }

    public Branch getBranch() {
        return branch;
    }

    public int getMaxstudent() {
        return maxstudent;
    }

    public int getRoom_Num() {
        return Room_Num;
    }
    
  @Override
    public String toString()
    {
        return "CourseName" + Cname + "CourseID" + CID +"parent course" + PCour +"CourseHour" + C_Hour + "max_num_students" + maxstudent + 
               "price" + price + "Room" + Room_Num + "Branch" + branch ; 
    }

    public void ChengesFile() 
    {
         FM.write(Courses.get(0).toString(),CourseFileName, false); //object number 0 in array will hava data from function then write it into file
       for(int i =1 ;i<Courses.size();i++){
           FM.write(Courses.get(i).toString(),CourseFileName, true);
       }
    }

    
    private void  ReadFromFile()
    {
         Courses = (ArrayList<Course>)(Object) FM.read(CourseFileName);
    }

    private int getCourseIndex(String id) {
        for (int i = 0; i < Courses.size(); i++) {
            if (Courses.get(i).getCID().equals(id)) {
                return i;
            }
        }

        return -1;
    }

    public Course searchCourseById(String id) {
        Course temp = new Course();
        ReadFromFile();
        int index = getCourseIndex(id);
        if (index != -1) {
            return Courses.get(index);
        } else {
            return temp;
        }
    }

    public ArrayList<Course> ShowCourses() {
        ReadFromFile();
        return Courses;
    }

    public void UpddateStudent(String C_Old_ID , Course c){
        ReadFromFile();
        int index =c.getCourseIndex(C_Old_ID);
        Courses.set(index, c);
        C.ChengesFile();
    }

      public void AddCourse()
      {
        ReadFromFile();
        Courses.add(this);
        C.ChengesFile();
      }
      
    public void DeleteCourse(String id) {
        ReadFromFile();
        int index = getCourseIndex(id);

        if (index != -1) {
            Courses.remove(index);
            C.ChengesFile();
        }
        
    }

   
    
}
