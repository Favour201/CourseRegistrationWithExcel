package cs232project1;

public class OnlineCourse extends Course{

    
    public OnlineCourse (String n, int crn, String cNum, int S, int cHours, String T, String I){
        super(n, crn, cNum, S, cHours, T, I);
    }


    @Override
    public String toString(){
        return Name + " " + crn + " " + courseNumber + " " + Section + " " + creditHours + " " + Type + " " +Instructor;
    }

    @Override
    public boolean conflictsWith(Course c){
        return true;
    }
}
