package IS2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthday;
    private final long millisPerYear = (long)(365.25*24*60*60*1000L);
    
    public Person(String name, Calendar birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        Calendar now = GregorianCalendar.getInstance();
        return  (int)((now.getTimeInMillis() - birthday.getTimeInMillis()) / millisPerYear);
    }
    
}
