package gsg;

public class GSG {

    public static void main(String[] args) {
        
        SystemClock sysClock1 = SystemClock.getInstance();
        System.out.println("The current time is: " + sysClock1.getCurrTime());
        
        SystemClock sysClock2 = SystemClock.getInstance();
        System.out.println(sysClock1.equals(sysClock2)+" we have only one object ");
        
    }
    
}
