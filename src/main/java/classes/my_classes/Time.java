package main.java.classes.my_classes;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created by Lemba on 10.08.2018.
 */
public class Time {
    private int hour;
    private int minute;
    public Time(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==':'){
                this.hour=Integer.parseInt(s.substring(0,i));
                this.minute=Integer.parseInt(s.substring(i+1));
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Time time = (Time) o;

        if (hour != time.hour) return false;
        return minute == time.minute;
    }

    @Override
    public int hashCode() {
        int result = hour;
        result = 31 * result + minute;
        return result;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
