/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;
import java.util.*;
import java.*;
import java.io.*;


/**
 *
 * @author DELL
 */
public class FWrite {
    
public static void re(String filename, String word) {
    
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(new java.io.File(filename),true));
            writer.println(word);
            
        } 
        catch (IOException e) {
            System.out.println(e);
        } finally {
            writer.close();
        }
       }

    
}
