import java.io.*;

/**
 * Created by Lemba on 10.08.2018.
 */
public class myFileManipulation {
    private String filePath;
    public myFileManipulation() {

    }
    public WorkerBase readFile(String file) throws FileNotFoundException{
        WorkerBase workerBase=new WorkerBase();
        try{
            BufferedReader in = new BufferedReader(new FileReader(new File(file).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    TimeWorker worker=new TimeWorker(s);
                    workerBase.add(worker);
                    //sb.append(s);
                    //sb.append("\n");
                }
            } finally {
                in.close();
        }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return workerBase;
    }
    public int giveAnswer(WorkerBase wB){
        int answer=0;
        for(TimeWorker tW1 : wB.getWorkers()){
            int count=0;
            for(TimeWorker tW2 : wB.getWorkers()){
                if(comprasionTime(tW1,tW2)){
                    count++;
                }

            }
            if(answer<=count)answer=count;
        }
        return answer;
    }

    private boolean comprasionTime(TimeWorker tW1, TimeWorker tW2){
        if(tW1.getStartWork().getHour()<tW2.getStartWork().getHour()){
            if(tW1.getFinishWork().getHour()> tW2.getStartWork().getHour())return true;
            if(tW1.getFinishWork().getHour()==tW2.getStartWork().getHour()){
                if(tW1.getFinishWork().getMinute()> tW2.getStartWork().getMinute())return true;
            }
            else return false;
        }
        if(tW1.getStartWork().getHour()==tW2.getStartWork().getHour()){
            if(tW1.getStartWork().getMinute()<tW2.getStartWork().getMinute())
            {
                if(tW1.getFinishWork().getHour()> tW2.getStartWork().getHour())return true;
                if(tW1.getFinishWork().getHour()==tW2.getStartWork().getHour()){
                    if(tW1.getFinishWork().getMinute()> tW2.getStartWork().getMinute())return true;
                }
                else return false;
            }
            if(tW1.getStartWork().getMinute()==tW2.getStartWork().getMinute()){
                if(tW1.getFinishWork().getHour()> tW2.getStartWork().getHour())return true;
                if(tW1.getFinishWork().getHour()==tW2.getStartWork().getHour()){
                    if(tW1.getFinishWork().getMinute()> tW2.getStartWork().getMinute())return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;

        return false;
    }

}
