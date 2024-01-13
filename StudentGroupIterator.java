import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    List<Student> studentList;

    int counter;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.studentList;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        // TODO Auto-generated method stub
        if(hasNext()){
        return studentList.get(counter++);
         }
        return null;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
       if(hasNext())
        studentList.remove(counter);
        Iterator.super.remove();
    }
    
}
