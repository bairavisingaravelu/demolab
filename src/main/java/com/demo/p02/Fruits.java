package com.demo.p02;

/**
 * Created by BSIN on 9/21/2016.
 */
public class Fruits {
    private int id;
    private  FruitType type;
    private  FruitColor color;
    private int size;

    public Fruits(int id, FruitType type) {
        this.id = id;
        this.type = type;
    }

    public Fruits(int id, FruitType type, FruitColor color, int size) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public FruitColor getColor() {
        return color;
    }

    public void setColor(FruitColor color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
