
package courses.management.system;
import java.util.ArrayList;


public class student {
    private    ArrayList<String> S_enrolled = new ArrayList<String>(); //list for student name 
     private    ArrayList<String> C_enrolled = new ArrayList<String>();//list for course name
     private    ArrayList<Integer> S_grade = new ArrayList<Integer>();//list for student grade 
     private    payment p; //composition relation between student and payment 
     private int Max_enrolled=C_enrolled.size(); //return number of course 
     
     public void Add_student(String  stud){// look to method name 
        S_enrolled.add(stud);
     }
     public void Delet_student(String  stud){// look to method name 
        S_enrolled.remove(stud);
     }
      public void Update_student(int no,String  stud){// look to method name 
          
        S_enrolled.set(no,stud);
     }
     
     public void C_Search(){// look to method name 
         System.out.println("DONE");
     }
      public void Show_student(){// look to method name 
         System.out.println(S_enrolled);
     }
     public void Show_course(){// look to method name 
         System.out.println(C_enrolled);
     }
     
    public void Show_grade(){// look to method name 
         System.out.println(S_grade);
     }
     
    
   
        
}
