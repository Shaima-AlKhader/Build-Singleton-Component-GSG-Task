package gsg;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemClock {
    private static SystemClock instance;
    
    private SystemClock(){   
    }
    
    public static SystemClock getInstance(){
        if(instance == null)
            instance = new SystemClock();
       return instance;
    }
    
    public String getCurrTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        return dtf.format(now);  
    }
}
