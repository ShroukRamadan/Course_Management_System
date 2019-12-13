/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_management_system;

import static course_management_system.Course.Courses;
import java.util.ArrayList;

/**
 *
 * @author Shrouk
 */
public class CourseCreator implements Ilogin {
      
    ArrayList <Course> Courses = new ArrayList <Course>();
    
  
    @Override
     public boolean Login(String Email, String Password) {
        
        return Email.equals("Manager@yahoo.com") && Password.equals("12345678");

    }
    
    public void addNewCourse(String Cname, String CId, int CreditHours) {
        Course x = new Course();
        if (x.addCourse()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }

    public void displayCourses() {
        Course x = new Course();
        System.out.println(x.displayAllCourses());
    }

    public void searchForCourse(String id) {
        Course x = new Course();
        System.out.println(x.searchCourse(id));
    }

    public void updateCourse(String oldID, Course newCourseValues) {
        Course x = new Course();
        x.updateCourse(oldID, newCourseValues);
        System.out.println("Updated Successfully ... !");
    }

    public void deleteCourse(String Id) {
        Course x = new Course();
        x.deleteCourse(Id);
        System.out.println("deleted Successfully ... !");
    }

   
  
    
}
