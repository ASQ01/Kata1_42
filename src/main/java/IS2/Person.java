package IS2;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthday;
    
    public Person(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        LocalDate now = LocalDate.now();
        return  Period.between(birthday, now).getYears();
    }
    
}
