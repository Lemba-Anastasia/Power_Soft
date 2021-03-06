package main.java.classes.my_classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyUtils {

    public List<TimeWorker> readFile(String file) throws FileNotFoundException {
        List<TimeWorker> workerList = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(file).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    TimeWorker worker = new TimeWorker(s);
                    workerList.add(worker);
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return workerList;
    }


    public int giveAnswer(List<TimeWorker> wB) {
        int answer = 0;
        for (int i=0;i<wB.size();i++) {
            int count = 0;
            for (int j=i;j<wB.size();j++) {
                if (comprasionTime(wB.get(i), wB.get(j))) {
                    count++;
                }

            }
            if (answer <= count) answer = count;
        }
        return answer;
    }

    private boolean comprasionTime(TimeWorker tW1, TimeWorker tW2) {
        if (tW1.getStartWork().getHour() < tW2.getStartWork().getHour()) {
            if (tW1.getFinishWork().getHour() > tW2.getStartWork().getHour()) return true;
            if (tW1.getFinishWork().getHour() == tW2.getStartWork().getHour()) {
                if (tW1.getFinishWork().getMinute() > tW2.getStartWork().getMinute()) return true;
            } else return false;
        }
        if (tW1.getStartWork().getHour() == tW2.getStartWork().getHour()) {
            if (tW1.getStartWork().getMinute() < tW2.getStartWork().getMinute()) {
                if (tW1.getFinishWork().getHour() > tW2.getStartWork().getHour()) return true;
                if (tW1.getFinishWork().getHour() == tW2.getStartWork().getHour()) {
                    if (tW1.getFinishWork().getMinute() > tW2.getStartWork().getMinute()) return true;
                } else return false;
            }
            if (tW1.getStartWork().getMinute() == tW2.getStartWork().getMinute()) {
                if (tW1.getFinishWork().getHour() > tW2.getStartWork().getHour()) return true;
                if (tW1.getFinishWork().getHour() == tW2.getStartWork().getHour()) {
                    if (tW1.getFinishWork().getMinute() > tW2.getStartWork().getMinute()) return true;
                } else return false;
            } else return false;
        } else return false;

        return false;
    }

}
