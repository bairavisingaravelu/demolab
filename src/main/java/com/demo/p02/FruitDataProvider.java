package com.demo.p02;

import java.util.*;
/**
 * Created by BSIN on 9/21/2016.
 */

public class FruitDataProvider {

    public ArrayList<Fruits> getFruit() {


        ArrayList<Fruits> Fruit = new ArrayList<Fruits>();
        Fruit.add(new Fruits(1, FruitType.Cherry, FruitColor.RED, 5));
        Fruit.add(new Fruits(2, FruitType.grape, FruitColor.GREEN, 3));
        Fruit.add(new Fruits(3, FruitType.Papaya, FruitColor.ORANGE, 10));
        Fruit.add(new Fruits(4, FruitType.pomogranate, FruitColor.RED, 6));
        Fruit.add(new Fruits(3, FruitType.orange, FruitColor.ORANGE, 8));
        Fruit.add(new Fruits(3, FruitType.apple, FruitColor.RED, 4));

//        List list=new LinkedList();
//        for (int i = 0; i < Fruit.size(); i++) {
//            if (FruitColor.GREEN.equals(Fruit.get(i).getColor())) {
//                map.put(FruitColor.GREEN, list.add(Fruit.get(i)));
//            } else if (FruitColor.ORANGE.equals(Fruit.get(i).getColor())) {
//               list.add(i,map.put(FruitColor.ORANGE, Fruit.get(i)));
//            } else if (FruitColor.RED.equals(Fruit.get(i).getColor())) {
//                list.add(i,map.put(FruitColor.RED, Fruit.get(i)));
//            }
//
//        }
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));}
//        System.out.println(map.get(FruitColor.ORANGE).getType());
//        System.out.println(map.get(FruitColor.RED).getType());
        return Fruit;
    }

}
