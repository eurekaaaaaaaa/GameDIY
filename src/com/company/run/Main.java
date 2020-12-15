package com.company.run;

import java.util.Random;
import java.util.Scanner;
import com.company.enity.*;

import static java.lang.Math.min;


public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] abundantList={10,10,10,10}; //食物初始数量数组
        String[] foodName={"鸡蛋","肉饼","豆浆","油条"};
        String[] quantifier={"枚","块","杯","条"};
        Scanner sc = new Scanner(System.in);


//        Egg egg= new Egg();
//        MeatPie meatPie = new MeatPie();
//        SoybeanMilk soybeanMilk = new SoybeanMilk();
//        DeepFriedDougSticks deepFriedDougSticks = new DeepFriedDougSticks();

        Student student = new Student();
        Uncles uncles =new Uncles();
        Aunts aunts = new Aunts();

        System.out.println("干饭人，干饭魂，干饭都是人上人");
        System.out.println("北风呼啸，又是一个干饭人辛苦干饭的早上__*( ￣皿￣)/#");
        System.out.println("抵达食堂！");
        int cousumeSum=0;

        while(cousumeSum<40){ //只要还有饭就循环
            System.out.println("----------------菜单------------------");
            System.out.println("0..鸡蛋|1..肉饼|2..豆浆|3..油条|4..不用了");
            System.out.println("干饭人!ψ(｀∇´)ψψ(｀∇´)ψ，请问你要抢的饭是：");
            int op =sc.nextInt();
            if(op>3) break; //设置出口
            System.out.println("抢多少：");
            int q =sc.nextInt();
            float luck=r.nextFloat();
            int consume;


            if(luck<0.2) {
                System.out.println(foodName[op] + "剩余：" + abundantList[op]);
                System.out.println("你选择的份量是：" + q);
                if (q <= abundantList[op]) {
                    System.out.println("恭喜你成功干饭！");
                    int temp=abundantList[op];
                    abundantList[op]-=q;
                    consume=q;
                    cousumeSum+=q;

                } else if (abundantList[op] > 0) {
                    System.out.println("还有一点ㄟ(≧◇≦)");
//                    snapshot=abundantList[op];
                    consume=abundantList[op];
                    abundantList[op]=0;
                    cousumeSum+=abundantList[op];

                } else {
                    System.out.println("干饭失败(っ °Д °;)っ");
                    consume=0;
                }


                int min = min(abundantList[op], q); //确定通用的干饭量
                for (int i = 0; i < consume; i++) {

                    switch (op) {
                        case 0:
                            student.addnutrition(150);
                            student.addEnergy(70);
                            break;
                        case 1:
                            student.addnutrition(200);
                            student.addEnergy(300);
                            break;
                        case 2:
                            student.addnutrition(100);
                            student.addEnergy(40);
                            break;
                        case 3:
                            student.addnutrition(10);
                            student.addEnergy(500);
                            break;
                    }
                }
            }
            else if(luck<0.7) {
                int op2 = aunts.chooseOption();
                int q2 = aunts.chooseAmount();
                System.out.println("大妈选手首先冲向打饭窗口！");
                System.out.println("她选择了" + foodName[op2]);
                System.out.println(foodName[op2] + "还剩余" + abundantList[op2] + quantifier[op2]);
                System.out.println("她选择的份量是：" + q2);
                if (q2 <= abundantList[op2]) {
                    abundantList[op2] -= q2;
                    System.out.println(q2 + quantifier[op2] + foodName[op2] + "已被拿走");
                    cousumeSum+=q2;
                } else if (abundantList[op2] > 0) {
                    abundantList[op2] = 0;
                    System.out.println(foodName[op2] + "已被大妈抢光");
                    cousumeSum+=abundantList[op2];
                } else {
                    System.out.println("大妈失手(ノへ￣、)");
                }
            }

            else{
                int op3 = uncles.chooseOption();
                int q3 = uncles.chooseAmount();
                System.out.println("老大爷进入战场！");
                System.out.println("他选择了" + foodName[op3]);
                System.out.println(foodName[op3] + "还剩余" + abundantList[op3] + quantifier[op3]);
                System.out.println("他选择的份量是：" + q3);
                if (q3 <= abundantList[op3]) {
                    abundantList[op3] -= q3;
                    System.out.println(q3+ quantifier[op3] + foodName[op3] + "已被拿走");
                    cousumeSum+=q3;
                } else if (abundantList[op3] > 0) {
                    abundantList[op3] = 0;
                    System.out.println(foodName[op3] + "已被大爷抢光");
                    cousumeSum+=abundantList[op3];

                } else {
                    System.out.println("大爷失手(￣ ‘i ￣;");
                }

            }




        }

//            if(aunts.getFightingCapacity()> student.getFightingCapacity()){
//                if(student.getFightingCapacity()<uncles.getFightingCapacity()){
//
//                }
//                else if (aunts.getFightingCapacity()<uncles.getFightingCapacity()){
//
//                }
//            }
//            else{
//                if(student.getFightingCapacity()<uncles.getFightingCapacity()){
//
//                }
//                else{
//
//                }
//
        int nu=student.getNutrition();
        int en=student.getEnergy();
        if(cousumeSum==40){
            System.out.println("食物已被抢完");
            if(nu==0){
                System.out.println("干饭失败〒▽〒");
            }
        }

        System.out.println("---------今早干饭结束---------");

        System.out.println("获取的能量值："+en);
        if(en<300){
            System.out.println("这么点能量可不行哦");
        }
        else if (en<=700){
            System.out.println("恰得饱饱\\(￣︶￣*\\))");
        }
        else{
            System.out.println("不能吃太多，会被杀掉的！！(〃＞目＜)");
        }


        System.out.println("吸收到的营养值："+nu);
        if(en<110){
            System.out.println("小孩子家家，长身体多吃一点ಠ_ಠ");
        }
        else if (en<200){
            System.out.println("营养勉强达标￣へ￣￣");
        }
        else if (en<400){
            System.out.println("针不戳👍");
        }
        else {
            System.out.println("今天也是好好长身体的一天(●ˇ∀ˇ●)");
        }




        }



}



