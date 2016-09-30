package p04;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by BSIN on 9/30/2016.
 */
public class Dataprovider {
    public void getdata(){
        ArrayList<Person> persons=new ArrayList<Person>();
        persons.add(new Person("ravi",25));
        persons.add(new Person("ragav",27));
        persons.add(new Person("anand",25));
        persons.add(new Person("baby",17));

        Collections.sort(persons,new Agecomparator());
        for (Person person:persons) {
            System.out.println("Name: "+person.getName()+" Age: "+person.getAge());
        }
    }
}
