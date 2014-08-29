package ua.artcode.day2.university_task;

/**
 * Created by admin on 29.08.2014.
 */
public class Subject {

    String name;
    int hours;
    int minDesiredHours;
    boolean isPassed;
    public static int count;

    public Subject() {
        count++;
    }

    public void addTime(int hours){
        this.hours += hours;
    }

    public void nonStaticMethod(){
        count++;
    }

   public void passExam(){
        if(hours >= minDesiredHours){
            isPassed = true;
            System.out.println("Exam was passed");
        } else {
            System.out.println("Failed exam, work harder");
        }
    }

    public static void test(){
        //name = " some";
    }

}
