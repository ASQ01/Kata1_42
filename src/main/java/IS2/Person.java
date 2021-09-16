package IS2;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
    
    public Person(String name, Date birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return  (int)((new Date().getTime() - birthday.getTime()) / 31536000000L);
    }
    
}
