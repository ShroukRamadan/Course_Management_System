/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2.project;

/**
 *
 * @author lenovo
 */
public class Admin implements User {
    
    
    public Admin(String Uname,String Email,String Adress,int PNum, int ID, String Pass){
          Super(Uname,Email,Adress, PNum, ID,Pass);
        
          
    }// it's a constrain  to use the attributes in user class
             
    public boolean login (String Uname,String Pass){
       if (Pass.equals("123") && Uname.equals("Admen"))
           return true; 
       else return false;
    
    }     
    
    
    
    public void AddStudent (String Uname,String Email,String Adress,int PNum,int ID, String Pass ){
            System.out.println("the student is added");
    }//this method is used to add new Student


    public void UpdateStudent (int id ){
    
    }//this methos takes id number of the student and search for him to update his data 
    public void DeleteStudent(int id){
           
    }//this method takes id of the student and search for him to delete his data 
 
    public void SearchStudent(String Uname){ 
        
    }//this method is aready decleared in File class so i will call it directly        
    
    public void AddInstructor (String Uname,String Email,String Adress,int Pnum , String Pass){
            System.out.println("the instructor is added");        

    }//this method to add new instructor to our program
    public void UpdateInstructor(String uname){
    
    }//this method takes username of the instructor and search for his data to update it
    public void DeleteInstructor (String Uname){

    }//this method takes username of the instreuctor and search for him to delete his data
    
    public void SearchInstructor(String Uname){
   
    }//this method is aready decleared in File class so i will call it directly 




}
    
    
