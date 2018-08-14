package main.java.classes.my_classes;

/**
 * Created by Lemba on 10.08.2018.
 */
public class TimeWorker {
    private Time startWork;
    private Time finishWork;
    public TimeWorker(String s){
        readTime(s);
    }
    private void readTime(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                startWork=new Time(s.substring(0,i));
                finishWork=new Time(s.substring(i+1));
            }
        }
    }

    public Time getFinishWork() {
        return finishWork;
    }

    public Time getStartWork() {
        return startWork;
    }
}
