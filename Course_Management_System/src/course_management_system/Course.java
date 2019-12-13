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


enum Branch{Cairo,Giza}
//enum PCour{is,it,pl,cs}
public class Course implements Serializable{
    
  private String Cname,CID;
  private float C_Hour;
  private int start_time;
  private int end_time;
  private float price;
  private Branch branch;
  private int maxstudent;
  private int Room_Num; 
  ParentCourse PCour;
 
  User ins=new Instructor();

  
  
  FileManager FM=new FileManager();
  private final String CourseFileName = "Courses.txt";
  Course C=new Course();
  public static ArrayList<Course> Courses = new ArrayList<Course>();
   
   
  public Course()                                                           ////////defult constructor////////////////
  {
  
  }

    public Course(String Cname, String CID, int start_time, int endt_time, float price, Branch branch, int maxstudent, int Room_Num, ParentCourse PCour) {
        this.Cname = Cname;
        this.CID = CID;
        this.start_time = start_time;
        this.end_time = endt_time;
        this.price = price;
        this.branch = branch;
        this.maxstudent = maxstudent;
        this.Room_Num = Room_Num;
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

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public void setEndt_time(int endt_time) {
        this.end_time = endt_time;
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

    public int getStart_time() {
        return start_time;
    }

    public int getEndt_time() {
        return end_time;
    }
 
    
  @Override
    public String toString()
    {
        return "CourseName" + Cname + "CourseID" + CID +"parent course" + PCour+ "start_time" +start_time + "end_time" + end_time +"CourseHour"
               + C_Hour + "max_num_students" + maxstudent +  "price" + price + "Room" + Room_Num + "Branch" + branch+ "instructor" 
               + ins.getUname(); 
    }

 public boolean addCourse() {
        if (FM.write(getCourseData(), CourseFileName, true)) {
            return true;
        } else {
            return false;
        }
    }

    private String getCourseData() {
        return this.Cname + "$" + this.CID+ "$" + this.PCour + "$" + this.start_time + "$" + this.end_time + "$" + this.C_Hour + "$" 
                + this.maxstudent + "$" + this.price + "$" + this.Room_Num + "$" + this.branch + "$" + this.ins.getUname();
    }

      
    private void ChangeFile() {
        FM.write(Courses.get(0).getCourseData(), CourseFileName, false);
        for (int i = 1; i < Courses.size(); i++) {
            FM.write(Courses.get(i).getCourseData(), CourseFileName, true);
        }

    }

    private int getCourseIndex(String id){
        for (int i = 0; i < Courses.size(); i++)
            if(Courses.get(i).getCID().equals(id))
                return i;
        
        return -1;
    }
    
    private void ReadFromFile() {
            Courses = (ArrayList<Course>) (Object) FM.read(CourseFileName);
    }

    public String displayAllCourses() {
        ReadFromFile();
        String S = "\nAll Courses Data:\n";
        for (Course x : Courses) {
            S = S + x.toString();
        }
        return S;
    }
    
    public String searchCourse(String id){
        ReadFromFile();
        int index = getCourseIndex(id);
        if(index != -1)
            return "\nFound ...!" + Courses.get(index).toString();
        else 
            return "\nNot Found ...!";
    }
    
    public void updateCourse(String oldID, Course x){
        ReadFromFile();
        int index = getCourseIndex(oldID);
        Courses.set(index, x);
        ChangeFile();
    } 
    
    public void deleteCourse(String id){
        ReadFromFile();
        int index = getCourseIndex(id);
        Courses.remove(index);
        ChangeFile();
    } 
  

   
    
}
