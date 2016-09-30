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
//        for(int i=0;i<persons.size();i++)
//        {
//            for(int j=1;j<i;j++)
//            {
//                if(persons.get(i).getAge()==persons.get(j).getAge())
//                {
//                   // Collections.sort(persons,new Namecomparator());
//                    return persons.get(i).getName().compareTo(persons.get(j).getName());
//                }
//            }
//        }

    }
}
