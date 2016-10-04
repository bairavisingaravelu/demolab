package com.demo.p02;

import java.util.Comparator;

/**
 * Created by BSIN on 9/26/2016.
 */
public class FruitComparator implements Comparator<Fruits> {

    public int compare(Fruits Fruit1,Fruits Fruit2){
        if(Fruit1.getSize()> Fruit2.getSize())
            return 1;
        else if(Fruit1.getSize()==Fruit2.getSize())
            return 0;
        else
            return -1;
    }

}
