package Students;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    public StringBuilder students1 = new StringBuilder();

    public void addStudents(Student student){
        students1.append(student).append(' ');
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
