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
enum ParentCourse{IS,IT,DB,DS,CS};
enum Branch{Giza,Maadi,October};
public class Coursem {
    private String Cname,CID;
  private float C_Hour;
  private float price;
  private Branch branch;
  private int maxstudent;
  private int Room_Num; 
  ParentCourse PCour;
  private String instructorname,start_time,end_time; 
  
//  CourseTimer CT=new CourseTimer();
  
  
  FileManager FM=new FileManager();
  private final String CourseFileName = "Courses.txt";
  Course C=new Course();
  public static ArrayList<Coursem> Courses = new ArrayList<Coursem>();
   private Instructor instructor = new Instructor();
   
   
  public Coursem()                                                           ////////defult constructor////////////////
  {
  
  }

  public Coursem(String Cname, String CID, float C_Hour, float price, Branch branch, int maxstudent,int room_num, ParentCourse PCour) {
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
        return Cname +"@" + CID +"@" + PCour +"@" +start_time+"@"+end_time+"@"+C_Hour + "max_num_students" + maxstudent + 
               "@"+ price + "@" + Room_Num + "Branch" + branch+"@"+instructor.getfname()+"@"+instructor.getLname()+"@" ; 
    }

    public void ChangesFile() 
    {
         FM.write(Courses.get(0).toString(),CourseFileName, false); //object number 0 in array will hava data from function then write it into file
       for(int i =1 ;i<Courses.size();i++){
           FM.write(Courses.get(i).toString(),CourseFileName, true);
       }
    }

    
    private void  ReadFromFile()
    {
         Courses = (ArrayList<Coursem>)(Object) FM.read(CourseFileName);
    }

    private int getCourseIndex(String id) {
        for (int i = 0; i < Courses.size(); i++) {
            if (Courses.get(i).getCID().equals(id)) {
                return i;
            }
        }

        return -1;
    }

    public String searchCourse(String id){
        ReadFromFile();
        int index = getCourseIndex(id);
        if(index != -1)
            return "\nFound ...!" + Courses.get(index).toString();
        else 
            return "\nNot Found ...!";
    }
     public String displayAllCourses() {
        ReadFromFile();
        String S = "\nAll Courses Data:\n";
        for (Coursem x : Courses) {
            S = S + x.toString();
        }
        return S;
    }

    public void UpddateStudent(String C_Old_ID , Coursem c){
        ReadFromFile();
        int index =getCourseIndex(C_Old_ID);
        Courses.set(index, c);
        ChangesFile();
    }

      public void AddCourse()
      {
        ReadFromFile();
        Courses.add(this);
        ChangesFile();
      }
      
    public void DeleteCourse(String id) {
        ReadFromFile();
        int index = getCourseIndex(id);

        if (index != -1) {
            Courses.remove(index);
            ChangesFile();
        }
        
    }

   
    

    
}
