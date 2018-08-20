package test;

import main.java.classes.my_classes.MyUtils;
import main.java.classes.my_classes.TimeWorker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lemba on 14.08.2018.
 */
class MyUtilsTest {
    List<TimeWorker> workerBase;
    MyUtils fileManipulation=new MyUtils();
    @BeforeEach
    void init(){
        workerBase = new ArrayList<>();
        TimeWorker worker1 =new TimeWorker("08:00 09:07");
        workerBase.add(worker1);
        TimeWorker worker2 =new TimeWorker("09:05 15:00");
        workerBase.add(worker2);
        TimeWorker worker3 =new TimeWorker("15:10 21:00");
        workerBase.add(worker3);
    }
    @AfterEach
    void clear(){
        workerBase.clear();
    }
    @Test
    void readFile() {
        try {
            assertEquals(workerBase,fileManipulation.readFile("E:\\Power_Soft\\input2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    void giveAnswer() {
        assertEquals(2,fileManipulation.giveAnswer(workerBase));
    }

}