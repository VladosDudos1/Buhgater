package com.company;

public class ITchel extends Worker {

    private String job = "IT";

    public ITchel(String name) {
        super(name);

    }

    @Override
    int receiveMoney(int prem) {
        count++;
        if (Main.money > 0) {

            if (count > 7) {
                return 0;
            } else {
                prem = 125000;
                Main.money -= prem;
                int nalog = (prem / 5);
                prem -= nalog;
                Main.inCase += nalog;
                this.didHeGet = true;
                return prem;
            }
        } else return 0;
    }

    public String getJob() {
        return job;
    }

    @Override
    public boolean isDidHeGet() {
        return super.isDidHeGet();
    }
}
