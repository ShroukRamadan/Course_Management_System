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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author hp
 */
public class FileManager {
    public boolean Write(String query,String Filepath,boolean appendtype){
         PrintWriter writer = null;
         try{
             System.out.println("writing in File "+Filepath);
             writer = new PrintWriter(new FileWriter(Filepath),appendtype);
             writer.print(query);
             System.out.println("done");
             return true;
         }catch(IOException e){
             System.out.println(e);
         }finally{
             writer.close();
         }
         return false;
    }
    
}
public ArrayList<object> read (String filepath){
       Scanner reader = null;
       try{
           System.out.println("REading from file"+filepath);
           reader = new Scanner(new File(filepath));
          
}catch(FileNotFoundException e){
      System.out.println(e);
}
if (filpath.equals("Student.txt")){
    ArrayList<Student> students = new ArrayList<Student>;
    Student x;
    while(reader.hasNext()){
     x=new Student();
     String line = reader.nextLine();
     String[]data = line.Split("#");
