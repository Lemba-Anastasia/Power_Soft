import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lemba on 10.08.2018.
 */
public class WorkerBase {
    public ArrayList<TimeWorker> workersList = new ArrayList<>(30);
    public void add(TimeWorker worker) {
        workersList.add(worker);
    }
    public List<TimeWorker> getWorkers(){return workersList;}
}
