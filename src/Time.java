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
                //System.out.println("Часы:"+s.substring(0,i));
                this.minute=Integer.parseInt(s.substring(i+1));
                //System.out.println("Минуты:"+s.substring(i));
            }
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
