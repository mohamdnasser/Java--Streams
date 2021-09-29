package stream.parallelStreams;

import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
public class Demo {
    public static void main(String[] args){
        List<Student> studentList = Arrays.asList(  new Student("Muhammed" , 60),
                                                    new Student("John" , 65),
                                                    new Student("Mark" , 70),
                                                    new Student("Adel" , 75),
                                                    new Student("Nader" , 80),
                                                    new Student("Omar" , 85));

        // Using Streams
        studentList.stream().filter(student -> student.score > 70).limit(3).forEach(student -> System.out.println(student.getName()));

        System.out.println("==============================");

        // Using Parallel Streams
        studentList.parallelStream().filter(student -> student.score > 70).limit(3).forEach(student -> System.out.println(student.getName()));

        System.out.println("==============================");

        // Convert Streams to Parallel Streams
        studentList.stream().parallel().filter(student -> student.score > 70).limit(3).forEach(student -> System.out.println(student.getName()));

  }
}
