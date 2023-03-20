/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author gessle
 */
public class Iss extends RocketGarden implements HandleAstronaut {
    private ArrayList<Astronaut> astronauts = new ArrayList<>();
    private int maxNumberOfAstronauts;
    
    private static Iss iss = null;
    
    private Iss() {
        maxNumberOfAstronauts = 10;
    }
    
    public static Iss getIss() {
        if (iss == null) {
            iss = new Iss();
        }
        return iss;
    }
    
    
    public void addAstronaut(Astronaut astronaut) {
        if (astronauts.size() < this.maxNumberOfAstronauts) {
            astronauts.add(astronaut);
        }
    }
    
    public Astronaut getAstronaut() {
        if (astronauts.size() > 0) {
            return astronauts.remove(0);
        }
        else {
            return null;
        }
    }
    
}
