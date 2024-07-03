package Students;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup;
    public StudentGroupIterator(StudentGroup group){

        this.studentGroup = group;
    }
    private int index = 0;

    private Student[] getStudents(){
        String[] names = studentGroup.students.toString().split(" ");

       // System.out.println("names: "+names);
        Student[] students = new Student[names.length];
       // System.out.println("students: "+ students);
        int id = 0;
        String room = null;

        for (String name:names){
            students[id] = new Student(id, name, room);
            id++;
        }
        return students;
    }

    @Override
    public boolean hasNext() {
        return index < getStudents().length;
    }

    @Override
    public Student next() {
        Student[] students = getStudents();
        return students[index++];
    }
}
