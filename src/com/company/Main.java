package com.company;

public class Main {

    static int money = 3000000;
    static int inCase = 0;

    public static void main(String[] args) {

        Director director = new Director("Ivan");
        ITchel iTchel = new ITchel("Vasya");
        ITchel iTchel2 = new ITchel("Vasya");
        ITchel iTchel3 = new ITchel("Vasya");
        ITchel iTchel4 = new ITchel("Vasya");
        ITchel iTchel5 = new ITchel("Vasya");
        ITchel iTchel6 = new ITchel("Vasya");
        ITchel iTchel7 = new ITchel("Vasya");
        ITchel iTchel8 = new ITchel("Vasya");
        ITchel iTchel9 = new ITchel("Vasya");

        System.out.println(iTchel.receiveMoney(0));
        System.out.println(iTchel2.receiveMoney(0));
        System.out.println(iTchel3.receiveMoney(0));
        System.out.println(iTchel4.receiveMoney(0));
        System.out.println(iTchel5.receiveMoney(0));
        System.out.println(iTchel6.receiveMoney(0));
        System.out.println(iTchel7.receiveMoney(0));
        System.out.println(iTchel8.receiveMoney(0));
        System.out.println(iTchel9.receiveMoney(0));

    }
}
