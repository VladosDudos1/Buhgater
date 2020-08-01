package com.company;

public class Clerk extends Worker {

    private String job = "Clerk";

    @Override
    int receiveMoney(int prem) {
        count++;
        if (Main.money > 0) {

            if (count > 14) {
                return 0;
            } else {
                prem = 325 * 8 * 18;
                Main.money -= prem;
                this.didHeGet = true;
                return prem;
            }
        } else return 0;
    }

    public Clerk(String name) {
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
