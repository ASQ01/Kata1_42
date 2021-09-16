package IS2;

import java.util.Date;

public class Kata1 {
    
    public static void main (String[] args){
        Person person = new Person("Antonio", new Date(80, 0, 1));
        System.out.println("Te llamas " + person.getName() + " y tienes " + person.getAge() + " años.");
        System.out.println("Hola mundo!");
    }
    
}
