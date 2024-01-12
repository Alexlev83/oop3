import java.util.Collection;
import java.util.List;

public class flowService {
    public void sortFlow(List<flow> flow) {
        Collection.sort(flow, new StreamCamparator());
    }
    
}
