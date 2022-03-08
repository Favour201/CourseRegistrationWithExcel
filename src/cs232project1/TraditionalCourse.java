package cs232project1;
import java.time.LocalTime;

public class TraditionalCourse extends Course{
    public String meetDays;
    public String Location;

    public TraditionalCourse(String N, int crn, String cNum, int S, int cHours, LocalTime sTime, LocalTime eTime, String mDays, String L, String T, String I) {
    super(N, crn, cNum, S, cHours, T, I);
    this.sTime = sTime;
    this.eTime = eTime;
    this.meetDays = mDays;
    this.Location = L;
    }

    /**
     *
     * @return
     */
    @Override
    public String getMeetDays(){
        return meetDays;
    }
   public void setDays(String day){
       this.meetDays = day;
   }
   public void setRoom(String room){
       this.Location = room;
   }
   public String getRoom(){
       return Location;
   }

    @Override
    public String toString() {
        return Name + " " + crn + " " + courseNumber + " " + Section + " " + creditHours + " " + sTime + " " + eTime + " " + meetDays + " " + Location + " " + Type + " " + Instructor;
    }

    @Override
    public boolean conflictsWith(Course c){
        boolean conflicts = false;
        boolean shareDays = false;

    if (this.getMeetDays().equals(c.getMeetDays())){
        shareDays = true;
    }

    if ( shareDays ){

        if(
        //starts before and end during or after
        (this.eTime.isBefore(c.sTime)) &&
        (this.eTime.isAfter(c.sTime)) ||
        //starts during and ends after
        (this.sTime.isBefore(c.eTime)) &&
        (this.eTime.isAfter(c.eTime)) ||
        //starts during and stops during
        (this.sTime.isAfter(c.sTime)) &&
        (this.eTime.isBefore(c.eTime)) ||
        //starts or stops at the same time
        (this.sTime.equals(c.sTime)) ||
        (this.eTime.equals(c.eTime))

    )
    {
        conflicts = true;
    }
    }
        return conflicts;
    }
    
}
