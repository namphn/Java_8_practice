import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    /**
     * toán tử :: dùng để tham chiếu đến method
     * Nó cũng giống như biểu thức lambda, hay dùng trong duyệt Collection
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student("nam", 20);
        Student student1 = new Student("nam2",20);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);

        Stream<String> list = Stream.of("hello", "world");
        students.forEach(Student::print);
        list.forEach(System.out::println);
    }
}
