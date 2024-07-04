import Students.Student;
import Students.StudentGroup;

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Comparator<Student> compareByName = new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        };
        Comparator<Student> compareById = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.id - o2.id;
            }
        };

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




        //Ага, сдесь вообще новый список студентов, с новыми ID и нулевым room, т.к. распихал их по нескольким группам,
        /// что привело к полностью нефункциональному коду. Ну да ладно, зато разобрался с итерацией.
        for(Student student: studentGroup1){
            System.out.println("Группа 1: " + student.name + " id: "+ student.id );
        }
        for(Student student: studentGroup2){
            System.out.println("Группа 2: " + student.name + " id: "+ student.id );
        }
        for(Student student: studentGroup3){
            System.out.println("Группа 3: " + student.name + " id: "+ student.id );
        }
        for(Student student: studentGroup4){
            System.out.println("Группа 4: " + student.name + " id: "+ student.id );
        }
        System.out.println();
        ArrayList<Student> arrayList1 = new ArrayList<>(List.of(vlad, sergey,nikolay, mike, andrey,georgy, den, lex));
        System.out.println(arrayList1);

        //Collections.sort(arrayList, new StudentComparator());
        Collections.sort(arrayList1);// Длина имени???
        System.out.println(arrayList1);
        Collections.sort(arrayList1, compareById);// сортировка по id
        System.out.println("sort by ID: "+arrayList1);

        for (int i = 0; i < arrayList1.size(); i++){
            System.out.println("ID: " + i +", имя: " + arrayList1.get(i));
        }

        Collections.sort(arrayList1, compareByName);
        System.out.println("sort by name: " + arrayList1);


    }

}