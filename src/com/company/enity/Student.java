package com.company.enity;

import java.util.Random;

public class Student {
//    private double FightingCapacity;
    private double demand;
    private  int nutrition;
    private int energy;

    public   Student(){
        Random r = new Random();
        double norm = r.nextGaussian();
        this.setDemand(5);
        //this.setFightingCapacity(60+20*norm);//学生的战斗力满足均值为60，标准差为20的正态分布
        this.setNutrition(0);
        this.setEnergy(0);

    }

    public void setDemand(double demand) {
        this.demand = demand;
    }

    public void setNutrition(int nutrition) {
        this.nutrition = nutrition;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    //    public void setFightingCapacity(double fightingCapacity) {
//        this.FightingCapacity = fightingCapacity;
//    }

    public double getDemand() {
        return demand;
    }

    public int getNutrition() {
        return nutrition;
    }

    public int getEnergy() {
        return energy;
    }
    public void addEnergy(int e) {
        this.energy+=e;
        System.out.println("能量+"+e);
    }
    public void addnutrition(int n) {
        nutrition+=n;
        System.out.println("营养+"+n);
    }

    //    public double getFightingCapacity() {
//        return FightingCapacity;
//    }
}
