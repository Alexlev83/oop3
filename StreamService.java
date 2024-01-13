import java.util.Collection;
import java.util.List;

public class StreamService {

    StudentGroup studentGroup;
    public StreamService(StudentGroup studentGroup) {
       this.studentGroup = studentGroup;
    }

    public void SortStream(List<stream> stream) {
        Collection.sort(stream, new StreamCamparator());
    }
    
}
