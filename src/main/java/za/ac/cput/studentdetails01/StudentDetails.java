<<<<<<< OURS
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.studentdetails01;

/**
 *
 * @author Zaakirah Fakier - 220461503 (Group Member)-contributed
 */
public class StudentDetails {
    private String studName,studSurname,course,studGroup;
    private long studNum;
    private int averageMark;

  
    public  StudentDetails (){ 
                studName = "Breyton" ;
                studSurname = "Ernstzen" ;
                studNum = 217203027; 
                course = "Applications Development" ;         
                averageMark = 50;
                studGroup = "1C";//220461503 CONTRIBUTED//
    }
    
    public StudentDetails(String name,String surname, long studentNumber,String course, int averageMark, String studentGroup ){
         this.studName = name;
         this.studSurname = surname; 
         this.studNum = studentNumber; 
         this.course = course;
         this.averageMark = averageMark;  
         this.studGroup = studentGroup;//220461503 CONTRIBUTED//
    }
    public void setName(String name){
        this.studName = name;
    }
    public String getName(){
        return studName;
    }
    public void setSurname(String surname){
        this.studSurname = surname;
    }
    public String getSurname(){
        return studSurname;
    }
    
       public String getStudGroup() {      //220461503 CONTRIBUTED// 
        return studGroup;
    }

    public void setStudGroup(String studentGroup) {//220461503 CONTRIBUTED//
        this.studGroup = studentGroup;
    }
    
    
    public void setStudentNumber(long studentNumber){
        this.studNum = studentNumber;
    }
    public long getStudentNumber(){
        return studNum;
    }
   
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }
    public void setAverageMark(int averageMark){
        this.averageMark = averageMark;
    }
    public int getAverageMark(){
        return averageMark;
    }
   
}


=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.studentdetails01;

/**
 *
 * @author Breyton Ernstzen - 217203027 (Group Lead)
 */
public class StudentDetails {
    
}
>>>>>>> THEIRS
        
