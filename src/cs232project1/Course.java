package cs232project1;
import java.time.LocalTime;

public abstract class Course {
    public String Name;
    public int crn;
    public String courseNumber;
    public int Section;
    public int creditHours;
    public String Type;
    public String Instructor;
    public LocalTime sTime;
    public LocalTime eTime;
    public String meetDays;
    
 public Course(String n, int crn, String cNum, int S, int cHours, String T, String I){
    this.Name = n;
    this.crn = crn;
    this.courseNumber = cNum;
    this.Section = S;
    this.creditHours = cHours;
    this.Type = T;
    this.Instructor = I;
}  
    public void setName(String name){
        this.Name = name;
    }
    public String getName(){
        return Name;
    }
    public void setCrn(int crn){
        this.crn = crn;
    }
    public int getCrn(){
        return crn;
      }
    public String getMeetDays(){
        return meetDays;
    }

    public void setNumber(String num){
        this.courseNumber = num;
    }
    public String getNumber(){
        return courseNumber;
    }
    public void setSection(int section){
        this.Section = section;
    }
    public int getSection(){
        return Section;
    }
    public void setCredits(int hours){
        this.creditHours = hours;
    }
    public int getCredits(){
        return creditHours;
    }
    public void setType(String type){
        this.Type = type;
    }
    public String getType(){
        return Type;
    }
    public void setInstructor(String inst){
        this.Instructor = inst;
    }
    public String getInstructor(){
        return Instructor;
    }
     public void setStart(LocalTime start){
        this.sTime = start;
    }
    public LocalTime getStart(){
        return sTime;
    }
    public void setStop(LocalTime stop){
        this.eTime = stop;
    }
    public LocalTime getStop(){
        return eTime;
    }

    
    public abstract boolean conflictsWith(Course c);
    
} 


