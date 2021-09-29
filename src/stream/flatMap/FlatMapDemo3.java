package stream.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
public class FlatMapDemo3 {
    public static void main(String[] args){
        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(new Student(101,"Muhammed",20));
        studentList1.add(new Student(102,"Nasser",20));
        studentList1.add(new Student(103,"Zika",20));

        List<Student> studentList2 = new ArrayList<Student>();
        studentList2.add(new Student(104,"Omar",20));
        studentList2.add(new Student(105,"Malek",20));
        studentList2.add(new Student(106,"Shika",20));

        List<List<Student>> finalStudentList = Arrays.asList(studentList1,studentList2);
        List<String> result = finalStudentList.stream().flatMap(students -> students.stream().map(n -> n.name)).collect(Collectors.toList());
        System.out.println(result);
    }

}
