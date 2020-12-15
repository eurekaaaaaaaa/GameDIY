package com.company.enity;

import java.util.Random;
import com.company.utils.P;



public class Uncles {
    Random r = new Random();
    double norm = r.nextGaussian();
    private double FightingCapacity;//大妈的战斗力满足均值为60，标准差为20的正态分布
    private double demand;
    private int option;

    public   Uncles(){

        this.setDemand(5);
        this.setFightingCapacity(70+30*norm);
    }

    public void setDemand(double demand) {
        this.demand = demand;
    }

    public void setFightingCapacity(double fightingCapacity) {
        this.FightingCapacity = fightingCapacity;
    }

    public double getDemand() {
        return demand;
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
