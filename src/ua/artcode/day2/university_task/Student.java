package ua.artcode.day2.university_task;

/**
 * Created by admin on 26.08.2014.
 */
//Template = class, form
public class Student {

    private String name = "Unknown"; // null
    private int age;
    private int groupNum;
    private Subject subject;

    /*
    * constructor name = class name
    * no return statement
    * can has args
    * constructor without args called default
    * */
    public Student(){

    }

    public Student(String name){
        this.name = name;
    }

    public Student(int age){
        this.age = age;
    }

    public Student(String name, int age, int groupNum, Subject subject){
        this.name = name;
        this.age = age;
        this.groupNum = groupNum;
        this.subject = subject;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 && age > 65){
            System.out.println("Too young or old");
            return; // exit from method
        }
        this.age = age;
    }

    public int getGroupNum() {
        return groupNum; // exit with value
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void study(int hours){
        System.out.println("Im studying");
        subject.addTime(hours);
        //null.addTime(hours); NullPointerException
    }

    public void study(){
        System.out.println("Study without args");
    }

    public void sayHello() {
        System.out.println("Hi, my name is " + name + " age " + age + " groupNum " + groupNum);
    }

    public String getInfo(){
        return "Student =  name = " + name + "; age = " + age + "; group = " + groupNum;
    }

}
