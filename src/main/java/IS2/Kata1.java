package IS2;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {
    
    public static void main (String[] args){
        LocalDate birthdate = LocalDate.of(1980, Month.JANUARY, 1);
        Person person = new Person("Antonio", birthdate);
        System.out.println("Te llamas " + person.getName() + " y tienes " + person.getAge() + " años.");
        System.out.println("Hola mundo!");
    }
    
}
