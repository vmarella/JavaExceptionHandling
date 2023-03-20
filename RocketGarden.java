/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author gessle
 */
public class RocketGarden {
    protected ArrayList<Rocket> rockets = new ArrayList<>();
    
    public RocketGarden() {
    
    }
    
    public void addRocket(Rocket r) {
        rockets.add(r);
    }
    
    public Rocket getRocket() {
        if (!rockets.isEmpty()) {
            return rockets.remove(0);
        }
        return null;
    }
    
    public void listRockets() {
        System.out.println("There are the following rockets available:");
        for(Rocket r : rockets) {
            r.printInformation();
        }
    
    }
    
    
    
}
