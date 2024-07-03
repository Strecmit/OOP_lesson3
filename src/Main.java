import Students.Student;
import Students.StudentIdComparator;
import Students.StudentGroup;
import Students.StudentGroupIterator;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup();
        StudentGroup studentGroup2 = new StudentGroup();
        StudentGroup studentGroup3 = new StudentGroup();
        StudentGroup studentGroup4 = new StudentGroup();


        Student vlad = new Student(3, "Влад", "Biology");
        Student sergey = new Student(5, "Сергей", "Biology");
        Student nikolay = new Student(2, "Николай", "Engineer");
        Student mike = new Student(6, "Майк", "Engineer");
        Student andrey = new Student(1, "Андрей", "Medical");
        Student georgy = new Student(7, "Георгий", "Medical");
        Student den = new Student(8, "Денис", "Physics");
        Student lex = new Student(4, "Алекс", "Physics");

        studentGroup1.addStudents(vlad);
        studentGroup1.addStudents(sergey);
        studentGroup2.addStudents(nikolay);
        studentGroup2.addStudents(mike);
        studentGroup3.addStudents(andrey);
        studentGroup3.addStudents(georgy);
        studentGroup4.addStudents(den);
        studentGroup4.addStudents(lex);



        //Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

       // while (iterator.hasNext()) {
       //     System.out.println("Студент " + iterator.next());
       // }
        for(Student student: studentGroup1){
            System.out.println("Группа 1: " + student);
        }
        for(Student student: studentGroup2){
            System.out.println("Группа 2:" + student);
        }
        for(Student student: studentGroup3){
            System.out.println("Группа 3" + student);
        }
        for(Student student: studentGroup4){
            System.out.println("Группа 4" + student);
        }

        ArrayList<Student> arrayList1 = new ArrayList<>(List.of(vlad, sergey));
        System.out.println(arrayList1);
        //Collections.sort(arrayList, new StudentComparator());
        Collections.sort(arrayList1, (s1,s2) -> s1.id - s2.id);
        System.out.println(arrayList1);
    }

}