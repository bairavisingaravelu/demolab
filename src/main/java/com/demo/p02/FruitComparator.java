package com.demo.p02;

import java.util.Comparator;

/**
 * Created by BSIN on 9/26/2016.
 */
public class FruitComparator implements Comparator<Fruits> {

    public int compare(Fruits Fruit1,Fruits Fruit2){
        int result=0;
        if(Fruit1.getSize()< Fruit2.getSize())
                result= -1;
        else if(Fruit1.getSize()>Fruit2.getSize())
                result=  1;
        return result;
    }

}
