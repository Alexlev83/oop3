import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

   private List<StudentGroup> StudentGroup = new ArrayList<>();

    public void addGroup(StudentGroup group) {
        StudentGroup.add(group);
      
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return StudentGroup.iterator();
      
    }
}