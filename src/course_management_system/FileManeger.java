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
import java.io.*;
import java.io.IOException;
public class FileManeger {
    
    public boolean Write(String Query,String filepath,boolean appand){
        PrintWriter writer=null;
        try{
           writer=new PrintWriter(new FileWriter(new File(filepath),appand));
           writer.println(Query);
           return true;
        
        }
        catch( IOException e){
           System.out.println(e);
        
        }
        finally {
          writer.close();
        }
      return false;
    }
}
