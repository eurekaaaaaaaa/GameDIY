package com.company.enity;

import java.util.Random;

class Food {
    public int number;
    public void setNumber(){
        Random r = new Random();
        float f= r.nextFloat();
        float fnumber = (3 + (5 * f));
        number = (int) fnumber;
    }
    public void consume(){
        number-=1;
    }
    public boolean stillExist(){
        return number>0;
    }


}
