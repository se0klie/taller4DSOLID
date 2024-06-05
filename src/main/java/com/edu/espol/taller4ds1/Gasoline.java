/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.espol.taller4ds1;

/**
 *
 * @author hailiejimenez
 */
public class Gasoline implements Flamable,Smellable{

    @Override
    public void burn() {
        System.out.println("Try not to put this on fire! it explodes!");
    }

    @Override
    public void odor() {
        System.out.println("This smells so bad!");
    }
    
}
class Asbesto implements Smellable{

    @Override
    public void odor() {
        System.out.println("Smells so bad!");
    }
}