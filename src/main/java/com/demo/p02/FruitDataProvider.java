package com.demo.p02;

import java.util.*;


/**
 * Created by BSIN on 9/21/2016.
 */

public class FruitDataProvider {

    public void getFruit() {
        ArrayList<Fruits> Fruit = new ArrayList<Fruits>();
        Fruit.add(new Fruits(1, FruitType.Cherry, FruitColor.RED, 5));
        Fruit.add(new Fruits(2, FruitType.grape, FruitColor.GREEN, 3));
        Fruit.add(new Fruits(3, FruitType.Papaya, FruitColor.ORANGE, 10));
        Fruit.add(new Fruits(4, FruitType.pomogranate, FruitColor.RED, 6));
        Fruit.add(new Fruits(3, FruitType.orange, FruitColor.ORANGE, 8));
        Fruit.add(new Fruits(3, FruitType.apple, FruitColor.RED, 4));
        Collections.sort(Fruit,new FruitComparator());

        for (Fruits f:Fruit) {
            System.out.println(f.getType()+" "+f.getSize());

        }
    }

}
