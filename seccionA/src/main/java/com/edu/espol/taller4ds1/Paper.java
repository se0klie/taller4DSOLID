/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.espol.taller4ds1;

/**
 *
 * @author hailiejimenez
 */
public class Paper implements Writable{

    @Override
    public void isWritten() {
        System.out.println("I wrote on paper!");
    }

    @Override
    public void isErased() {
        System.out.println("I erased what i wrote on the paper...");
    }
    
}

class Computer implements Writable{

    @Override
    public void isWritten() {
        System.out.println("I typed from my keyboard!");
    }

    @Override
    public void isErased() {
        System.out.println("Ctrl z!");
    }
    
}