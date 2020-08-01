package com.company;

public class Personal extends Worker {

    private String job = "Personal";

    @Override
    int receiveMoney(int prem) {
        count++;
        if (Main.money > 0) {

            if (this.didHeGet) {
                System.out.println("Все уже получили премии");
                return 0;
            } else {
                prem = Main.money / count;
                this.didHeGet = true;

                return prem;
            }
        } else return 0;
    }

    public Personal(String name) {
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
