import java.util.ArrayList;
import java.util.Iterator;

public class flow implements Iterable <studyGroup> {

    List<studyGroup>groupList = new ArrayList<>();

    public void addGroup (groupList) {
        groupList.add(groupList);
    }

    @Override
    public Iterator<studyGroup> iterator() {
        // TODO Auto-generated method stub
       return studyGroup.iterator();
    }
}
