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
public abstract class User {
    protected String fname,lname,E_mail,Address;
    protected int ID,Pnum;
     protected String password;
     protected String Username;
     
     FileManager filemanager = new FileManager();

    public User() {}
    
    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public User(String fname, String lname, String E_mail, String Address, int ID, int Pnum, String password, String Username) {
        this.fname = fname;
        this.lname = lname;
        this.E_mail = E_mail;
        this.Address = Address;
        this.ID = ID;
        this.Pnum = Pnum;
        this.password = password;
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return Username;
    }
     
     
 

    public User(String fname,String lname, String E_mail, String Address, int ID, int Pnum) {
        this.fname = fname;
        this.lname = lname;
        this.E_mail = E_mail;
        this.Address = Address;
        this.ID = ID;
        this.Pnum = Pnum;
        
    }
     public boolean login(String username, String Pass) {
        if (username.equals(this.getUsername()) && Pass.equals(this.getPassword())) {
            return true;
        }
        return false;
    }

    public void setfname(String fname) {
        this.fname = fname;
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
   

 

    public String getfname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
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
    
 
  

    
}

