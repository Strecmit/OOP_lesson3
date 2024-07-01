import Students.Student;
import Students.StudentComparator;
import Students.StudentGroup;
import Students.StudentGroupIterator;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup();

        Student vlad = new Student("Влад", 3);
        Student nikolay = new Student("Николай", 2);
        Student andrey = new Student("Андрей", 1);
        Student lex = new Student("Алекс", 4);

        studentGroup.addStudents(vlad);
        studentGroup.addStudents(nikolay);
        studentGroup.addStudents(andrey);
        studentGroup.addStudents(lex);

        //Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

       // while (iterator.hasNext()) {
       //     System.out.println("Студент " + iterator.next());
       // }
        for(Student student: studentGroup){
            System.out.println("Студент " + student);
        }

        ArrayList<Student> arrayList = new ArrayList<>(List.of(vlad, nikolay, andrey, lex));
        System.out.println(arrayList);
        //Collections.sort(arrayList, new StudentComparator());
        Collections.sort(arrayList, (s1,s2) -> s1.id - s2.id);
        System.out.println(arrayList);
    }

}