package com.company.enity;

import java.util.Random;

public class Aunts {
    Random r = new Random();
    double norm = r.nextGaussian();
    private double FightingCapacity;
    private int option;
    private int demand;

    public   Aunts(){
        this.setFightingCapacity(80+10*norm);//大妈的战斗力满足均值为80，标准差为10的正态分布
        this.chooseOption();
        this.chooseAmount();

    }

    public void setFightingCapacity(double fightingCapacity) {
        this.FightingCapacity = fightingCapacity;
    }


    public double getFightingCapacity() {
        return FightingCapacity;
    }

    public int chooseOption(){
        float f =r.nextFloat();
        if(f>0.25){
            if(f>0.5){
                if(f>0.75){
                    option=3;
                    return option;
                }
                option=2;
                return option;
            }
            option=1;
            return option;
        }
        else{
            option= 0;
            return option;
        }
    }

    public int chooseAmount(){
        return r.nextInt(9)+1;

    }


}

