package com.company;

public abstract class Worker {

    String name;
    int count;
    boolean didHeGet;

    abstract int receiveMoney(int prem);

    public Worker(String name){
        this.name = name;
        this.didHeGet = false;
        count++;
    }

    public boolean isDidHeGet() {
        return didHeGet;
    }
}
