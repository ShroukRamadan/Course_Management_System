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

enum Branch{};
public class Course {
    
  private String Cname,CID;
  private float C_Hour;
  private float price;
  private Branch branch;
  private int maxstudent;
  public static ArrayList<Course> Courses = new ArrayList<Course>();
  Room room;
  ParentCourse PCour;
  
  
   
    public Course() {
    }

    public Course(String Cname, String CID, float C_Hour, float price, Branch branch, int maxstudent,Room room, ParentCourse PCour) {
        this.Cname = Cname;
        this.CID = CID;
        this.C_Hour = C_Hour;
        this.price = price;
        this.branch = branch;
        this.maxstudent=maxstudent;
        this.room = room;
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
    
   
    
}
