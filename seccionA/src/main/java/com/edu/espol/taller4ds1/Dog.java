/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.espol.taller4ds1;

/**
 *
 * @author hailiejimenez
 */
public abstract class Dog {
    public abstract void hability();
}

class RunnerDog extends Dog{

    @Override
    public void hability() {
        run();
    }
    public void run(){
        System.out.println("This is a runner dog! Really fast!");
    }
}

class cuteDog extends Dog{

    @Override
    public void hability() {
        beCute();
    }
    public void beCute(){
        System.out.println("This dog is just cute... can't run or protect you.");
    }
}

class goldenRetriever extends cuteDog{
    public void hability(){
        beCute();
    }
}

class dalmataDog extends RunnerDog{
    public void hability(){
        run();
    }
}