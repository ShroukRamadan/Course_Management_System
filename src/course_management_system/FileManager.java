/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FileManager{


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

        if (FilePath.equals("Students.txt")) {

            ArrayList<Student> Students = new ArrayList<Student>();
            Student x;

            while (Reader.hasNext()) {

                x = new Student();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                //201801001@esraa@Tamer@address@esraatamer022GAMIL.com@phone number@username@password@
                x.setID(Integer.parseInt(seprated[0]));
                x.setfname(seprated[1]);
                x.setLname(seprated[2]);
                x.setAddress(seprated[3]);
                x.setE_mail(seprated[4]);
                x.setPnum(Integer.parseInt(seprated[5]));
                
                
                //we done some opratin here if needed

               x.setUsername(seprated[6]);
               x.setPassword(seprated[7]);

                Students.add(x);
            }

            return (ArrayList<Object>) (Object) Students;

        } else if (FilePath.equals("Instructor.txt")) {

            ArrayList<Instructor> instructors = new ArrayList<Instructor>();
            Instructor i;

            while (Reader.hasNext()) {

                i = new Instructor();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                //1@Ayman@Ezzat@address@email@phonenumber@coursename@worktimes2pm to 4pm@username@password@
                i.setID(Integer.parseInt(seprated[0]));
                i.setfname(seprated[1]);
                i.setLname(seprated[2]);
                i.setAddress(seprated[3]);
                i.setE_mail(seprated[4]);
                i.setPnum(Integer.parseInt(seprated[5]));
                i.setCoursename(seprated[6]);
                i.setWork_time(Integer.parseInt(seprated[7]));

                i.setUsername(seprated[8]);
                i.setPassword(seprated[9]);

                instructors.add(i);
            }

            return (ArrayList<Object>) (Object) instructors;

        } else if (FilePath.equals("Course.txt")) {

            ArrayList<Coursen> courses = new ArrayList<Coursen>();
            Coursen c;

            while (Reader.hasNext()) {

                c = new Coursen();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

       //id-course@pl2@timesection->Sun 10am to 12pm@room of course@instructor of course@2max no. of student@price-->5000@start-time@e-time@
            
                
                c.setIdcourse(Integer.parseInt(seprated[0]));
                c.setCoursename(seprated[1]);
                c.setSectiontime(seprated[2]);
                c.setRoomnumber(Integer.parseInt(seprated[3]));
                c.setInstructorname(seprated[4]);
                c.setMaxno_StudentInCourse(Integer.parseInt(seprated[5]));
                c.setCoursePrice(Double.parseDouble(seprated[6]));
                c.setStart_time(seprated[7]);
                c.setEnd_time(seprated[8]);

                //we done some opratin here if needed
                courses.add(c);
            }

            return (ArrayList<Object>) (Object) courses;

        

        } else {
            return null;
        }

    }}
