/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author gessle
 */
public abstract class Rocket {
    final String name;
    protected ArrayList<String> cargo = new ArrayList<>();
    final int maxSizeOfCargo;
    final int maxNumberOfAstronauts;
    
    private static int rocketCounter = 0;
    
    public Rocket(String name, int maxSizeOfCargo, int maxNumberOfAstronauts) {
        this.name = name;
        this.maxSizeOfCargo = 100;
        this.maxNumberOfAstronauts = maxNumberOfAstronauts;
        rocketCounter++;
    }
    
    public static int getNumberOfRockets() {
        return rocketCounter;
    }
    
    public void printInformation() {
        System.out.println(name + " has the following astronauts:");
        System.out.println("And the following cargo:");
        for(String s: cargo) {
            System.out.println("* " + s);
        }
    }
    
   
    
    public void addCargo(String cargo) throws IllegalCargoException {
        if (cargo.toLowerCase().contains("nuclear") || cargo.toLowerCase().contains("nuke")) {
            throw new IllegalCargoException("No nukes allowed!");
        }
        
       
        if (this.cargo.size() < this.maxSizeOfCargo) {
            this.cargo.add(cargo);
        }
    }
    
    public void addCargo(ArrayList<String> lostsOfCargo) {
        if (this.cargo.size() + lostsOfCargo.size() < this.maxSizeOfCargo) {
            this.cargo.addAll(lostsOfCargo);
        }
    }
    
    public String getCargo() {
        if (cargo.size() > 0) {
            return cargo.remove(0);
        }
        else {
            return "Error";
        }
    }
    
    public int getAmountOfCargo() {
        return cargo.size();
    }
    
    
    public void launch() {
    
        System.out.println(name + " has been *test* launched succesfully!");
    }
    
    public void launch(boolean realDeal) {
        if (realDeal) {
            if (!cargo.isEmpty()) {
                System.out.println(name + " has been launched succesfully!");
            }
            else {
                System.out.println("Cannot launch empty rocket!");
            }
        }
        else {
            this.launch();
        }
    }
    
}
