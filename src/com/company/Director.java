package com.company;

public class Director extends Worker {

    private String job = "Директор";

    @Override
    int receiveMoney(int prem) {
        if (prem > 1500000){
            System.out.println("Директор не может получить больше, чем 3 миллиона");
            prem = 1500000;
            if (count < 1){
                return 0;
            } else {
                Main.money -= (prem*2);
                this.didHeGet = true;
                return (prem*2);
            }
        }
        if (count < 1){
            return 0;
        } else {
            Main.money -= (prem*2);
            this.didHeGet = true;
            return (prem*2);
        }
    }

    public Director(String name) {
        super(name);
    }

    public String getJob() {
        return job;
    }

    @Override
    public boolean isDidHeGet() {
        return super.isDidHeGet();
    }
}
