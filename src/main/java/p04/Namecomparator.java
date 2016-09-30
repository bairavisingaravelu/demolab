package p04;

import java.util.Comparator;

/**
 * Created by BSIN on 9/30/2016.
 */
public class Namecomparator implements Comparator{

    public int compare(Object o1, Object o2) {
        Person person=(Person)o1;
        Person person1=(Person)o2;

        return person.getName().compareTo(person1.getName());
    }
}
