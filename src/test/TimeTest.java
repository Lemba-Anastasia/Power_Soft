package test;

import main.java.classes.my_classes.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


/**
 * Created by Lemba on 14.08.2018.
 */
class TimeTest {

    @Test
    void getHour() {
        Time time=new Time("09:07");
        assertEquals(9,time.getHour());
        assertNotEquals(10,time.getHour());
    }

    @Test
    void getMinute() {
        Time time=new Time("09:07");
        assertEquals(7,time.getMinute());
    }

}