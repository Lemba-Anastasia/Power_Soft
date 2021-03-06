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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeWorker worker = (TimeWorker) o;

        if (!startWork.equals(worker.startWork)) return false;
        return finishWork.equals(worker.finishWork);
    }

    @Override
    public int hashCode() {
        int result = startWork.hashCode();
        result = 31 * result + finishWork.hashCode();
        return result;
    }

    public Time getFinishWork() {
        return finishWork;
    }

    public Time getStartWork() {
        return startWork;
    }
}
