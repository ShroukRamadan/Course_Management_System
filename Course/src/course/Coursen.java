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
//To make array list from another class use
 import java.util.ArrayList;
 import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Coursen {
    private ArrayList<ArrayList<Enum>> Coursename = new ArrayList<ArrayList<Enum>>();  //methods of this list will use ;
    private double CoursePrice;    //will setinside class manager;
    private final int CourseHours = 30; 
    //no.of hours is constant for specific task
    private int Maxno_StudentInCourse;
    private float Grades;
    private ArrayList<Student> student = new ArrayList<Student>(); //using array list from class student???
    private Enum days;    
    public void Report(CourseTimer){       // class course HAS-A StratTime and End Time Composition RElationship
      CousreTimer start = new CourseTimer();
      CousreTimer End = new CourseTimer();
      System.out.println("Start time at :"+ start.getstartTime()+"");  //how to report about courses that near to start or end
       System.out.println("Start time at :"+ End.getendTime()+"");
    }
     
    public int getRoom(Room){
       
        Room Place = new Room();    //admin will overide this 
        Place.Roomnum;
    }
    public void show(){
        try{
        File Reader = new File("CourseData.txt");
        Scanner show = new Scanner(Reader);              
        while(show.hasNext()){                      /* i will determine a specific charater to seperated between 
                                                     *  student ,instructor and another
                                                     * course details and to check with it */
            String data = show.nextLine();
            System.out.println(data);
            show.close();}}
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        
    }

    public ArrayList<ArrayList<Enum>> getCoursename() {
        return Coursename;
    }

    public ArrayList<Student> getStudent() {
        return student;                          //Admin
    }

    public void setStudent(ArrayList<Student> student) {     //Admin
        this.student = student;   
    }

    public void setCoursename(ArrayList<ArrayList<Enum>> Coursename) {    //Admin
        this.Coursename = Coursename;
    }

    public void setCoursePrice(double CoursePrice) {    //Manger
        this.CoursePrice = CoursePrice;  
    }

    public void setMaxno_StudentInCourse(int Maxno_StudentInCourse) {
        this.Maxno_StudentInCourse = Maxno_StudentInCourse;             //Admin
    }

    public void setGrades(float Grades) {    //Instructor
        this.Grades = Grades;
    }

    public void setDays(Enum days) {     //Admin wiil override 
        this.days = days;
    }
    
    public double getCoursePrice() {    //will show to student..
        return CoursePrice;
    }

    public int getCourseHours() {        //fixed
        return CourseHours;
    }

    public int getMaxno_StudentInCourse() {     //admin will override this
        return Maxno_StudentInCourse;
     }

    public Enum getDays() {
        return days;              //Admin will overridethis
    }
    
    
}
