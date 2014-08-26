package ua.artcode.day1;

/**
 * Created by admin on 26.08.2014.
 */
//Template
public class Student {

    String name = "Unknown"; // null
    int age;
    int groupNum;

    public void sayHello() {
        System.out.println("Hi, my name is " + name + " age " + age + " groupNum " + groupNum);
    }

    public String getInfo(){
        return "Student =  name = " + name + "; age = " + age + "; group = " + groupNum;
    }

}
