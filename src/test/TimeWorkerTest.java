package test;

import main.java.classes.my_classes.Time;
import main.java.classes.my_classes.TimeWorker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lemba on 20.08.2018.
 */
class TimeWorkerTest {
    @Test
    void creation(){
        Time startWork=new Time("08:00");
        Time finishWork=new Time("09:07");
        TimeWorker timeWorker=new TimeWorker("08:00 09:07");
        assertEquals(startWork,timeWorker.getStartWork());
        assertEquals(finishWork,timeWorker.getFinishWork());
    }

}