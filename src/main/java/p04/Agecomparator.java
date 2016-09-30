package p04;

import java.util.Comparator;

/**
 * Created by BSIN on 9/29/2016.
 */
public class Agecomparator implements Comparator {
    public int compare(Object o1,Object o2){
        Person p1=(Person)o1;
        Person p2=(Person)o2;
        if(p1.getAge()==p2.getAge())
            return p1.getName().compareTo(p2.getName());
        else if(p1.getAge()>p2.getAge())
            return 1;
        else
        return -1;
    }
}
