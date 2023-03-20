/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author gessle
 */
public class SaturnV extends Rocket implements HandleAstronaut {
    private ArrayList<Astronaut> astronauts = new ArrayList<>();
    
    public SaturnV() {
        super("Saturn V", 130000, 3);
    }
    
    public void doTvInteview() {
        System.out.println("TV inteview starting...");
        
        for(Astronaut a: astronauts) {
            System.out.println(a.getName() + " says hello!");
        }
        
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
