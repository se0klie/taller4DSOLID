/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.espol.taller4ds1;

/**
 *
 * @author hailiejimenez
 */
class Violinist implements Musician{
    @Override
    public String getInstrument() {
        return "Violin";
    }
}
class Guitarist implements Musician{

    @Override
    public String getInstrument() {
       return "Guitar";
    }
}
class Singer implements Musician{

    @Override
    public String getInstrument() {
        return "Singer";
    }
}

public class Musical{
    private Musician instrument;
    private String name;
    private String position;
    public Musical(String name, String position, Musician instrument){
        this.name = name;
        this.position = position;
        this.instrument = instrument;
    }
    public String getInstrument(){
        return instrument.getInstrument();
    }
}

