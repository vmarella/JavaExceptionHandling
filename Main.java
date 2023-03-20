/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gessle
 */
public class Main {
    
    
    public static void main(String[] args) {

        Rocket r = new Starship();
        r.launch();
        ((Starship)r).land();



        Starship sh = new Starship();

        sh.addAstronaut(new Astronaut("Lee", 42));
        sh.addAstronaut(new Astronaut("Anna", 37));
        sh.addAstronaut(new Astronaut("Ernest", 48));
        sh.addAstronaut(new Astronaut("Daniela", 26));
        try {
            sh.addCargo("Satellite A");
            sh.addCargo("Satellite B");
            sh.addCargo("Nuke");
        } catch (IllegalCargoException ex) {
            System.out.println("Exception happened: " + ex.getMessage());
        }
        





        LongMarch9 lm = new LongMarch9();

        //lm.addCargo("Moon rover");


        SaturnV sv = new SaturnV();

        sv.addAstronaut(new Astronaut("Ernest", 48));
        sv.addAstronaut(new Astronaut("Daniela", 26));


        Starbase sb = new Starbase();

        sb.addRocket(new Starship());
        sb.addRocket(new Starship());
        sb.addRocket(new Starship());
        sb.addRocket(new Starship());
        sb.addRocket(lm);
        sb.addRocket(sv);

        sb.listRockets();

        Iss iss = Iss.getIss();

        iss.addRocket(sh);
        iss.listRockets();
        iss.addAstronaut(new Astronaut("Vanhala", 37));

        Iss iss2 = Iss.getIss();

        iss2.listRockets();

        System.out.println("Number of rockets in this program: " + Rocket.getNumberOfRockets());
        
    }
}
