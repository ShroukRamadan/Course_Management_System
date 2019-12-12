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
public class CourseTimer {
    
    private int start_time;
    private int endt_time;
    
    public void set_start_time(int start_time )
    {
     this.start_time=start_time;
    }
    
    public int get_start_time()
    {
     return start_time;
    }
    
    public void set_endt_time(int endt_time )
    {
      this.endt_time=endt_time;
    }
    
    public int get_endt_time()
    {
     return endt_time;
    }
    
}
