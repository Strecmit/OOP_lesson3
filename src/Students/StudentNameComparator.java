package Students;
import java.util.Comparator;
public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return  o1.toString().compareTo(o2.toString()); //o1.name - o2.name;
    }
}
