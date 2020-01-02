import lombok.Getter;
import lombok.Setter;

public class Student{

    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println(name + " " + Integer.toString(age));
    }
}