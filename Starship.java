/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author gessle
 */
public class Starship extends Rocket implements HandleAstronaut {
    private ArrayList<Astronaut> astronauts = new ArrayList<>();
    
    public Starship() {
        super("Starship", 150000, 100);
    }
    
    public void land() {
        System.out.println(name + " has landed successfully!");
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
