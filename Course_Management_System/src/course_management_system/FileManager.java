/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_management_system ;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;
/**
 *
 * @author hp
 */
public class FileManager implements Serializable{
     

    public boolean write(String Query, String FilePath, boolean appendType) {

        PrintWriter writter = null;
        try {
            System.out.print("\nwritting in ! " + FilePath);

            writter = new PrintWriter(new FileWriter(new File(FilePath), appendType));
            writter.println(Query);

            System.out.println(" ... Done ! ");
            return true;
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            writter.close();
        }
        return false;
    }

    public ArrayList<Object> read(String FilePath) {
       // Scanner input = new Scanner(System.in);
        
        Scanner Reader = null;
        try {
            System.out.println("Reading ! From " + FilePath);

            Reader = new Scanner(new File(FilePath));

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        if (FilePath.equals("Students.txt"))                         /////////////////////////////////////////////////////////////////
        {

            ArrayList<Student> Students = new ArrayList<Student>();
            Student x;

            while (Reader.hasNext()) {

                x = new Student();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("$");

                //201801001@esraa@Tamer@address@esraatamer022GAMIL.com@phone number@username@password@
                x.setID(Integer.parseInt(seprated[0]));
                x.setFname(seprated[1]);
                x.setLname(seprated[2]);
                x.setAddress(seprated[3]);
                x.setE_mail(seprated[4]);
                x.setPnum(Integer.parseInt(seprated[5]));
                
                
                //we done some opratin here if needed

               x.setUname(seprated[6]);
               x.setPss(Integer.parseInt(seprated[7]));

                Students.add(x);
            }

            return (ArrayList<Object>) (Object) Students;

        } else if (FilePath.equals("Instructor.txt")) {

            ArrayList<Instructor> instructors = new ArrayList<Instructor>();
            Instructor i;

            while (Reader.hasNext()) {

                i = new Instructor();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("$");

                //1@Ayman@Ezzat@address@email@phonenumber@coursename@worktimes2pm to 4pm@username@password@
                i.setID(Integer.parseInt(seprated[0]));
                i.setFname(seprated[1]);
                i.setLname(seprated[2]);
                i.setAddress(seprated[3]);
                i.setE_mail(seprated[4]);
                i.setPnum(Integer.parseInt(seprated[5]));
               // i.setC_Name(seprated[6]);
              //  i.setWork_time(Integer.parseInt(seprated[7]));

                i.setUname(seprated[8]);
                i.setPss(Integer.parseInt(seprated[9]));

                instructors.add(i);
            }

            return (ArrayList<Object>) (Object) instructors;

        } else if (FilePath.equals("Course.txt")) {

              ArrayList<Course> courses = new ArrayList<Course>();
              Course cour;

            while (Reader.hasNext()) {

                cour = new Course();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("$");

       //id-course $ pl2 $c_Hour $ parentcourse $ maxnumofstudent $ price $ room of course $ branch
            
                
                cour.setCID((seprated[0]));
                cour.setCname(seprated[1]);
                cour.setC_Hour(Float.parseFloat(seprated[2]));
                cour.setMaxstudent(Integer.parseInt(seprated[3]));
                cour.setPrice(Float.parseFloat(seprated[4]));
                cour.setRoom_Num(Integer.parseInt(seprated[5]));
               // cour.setBranch(seprated[6]);
                

                //we done some opratin here if needed
                courses.add(cour);
            }

            return (ArrayList<Object>) (Object) courses;

        

        } else {
            return null;
        }

    }}
