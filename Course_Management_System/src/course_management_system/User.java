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

enum Gender{male,female}
public class User {
    
    protected String Fname,Lname,Uname,E_mail,Address;
    protected int ID,Pnum,pss;
    Gender gender;

    public User() {
        
        
        
    }
    
 

    public User(String Uname, String E_mail, String Address, int ID, int Pnum, int pss) {
        this.Uname = Uname;
        this.E_mail = E_mail;
        this.Address = Address;
        this.ID = ID;
        this.Pnum = Pnum;
        this.pss = pss;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPnum(int Pnum) {
        this.Pnum = Pnum;
    }

    public void setPss(int pss) {
        this.pss = pss;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    
    public String getUname() {
        return Uname;
    }

    public String getE_mail() {
        return E_mail;
    }

    public String getAddress() {
        return Address;
    }

    public int getID() {
        return ID;
    }

    public int getPnum() {
        return Pnum;
    }

    public int getPss() {
        return pss;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public Gender getGender() {
        return gender;
    }
    
    
    public void Login(String Uname,int pass){                               /////////waiting/////////////////////
      
    System.out.println("LOGIN is Compelete");
    }
    
    public void SignUp(String Uname, String E_mail, String Address, int ID, int Pnum, int pss){   /////////////////////waiting///////////////
        System.out.println("  Done!!  "); 
    
    }
    
}
