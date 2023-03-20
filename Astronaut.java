/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gessle
 */
public class Astronaut {
    private String name;
    private int age;
    
    public Astronaut(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Astronaut() {
        this.name = "";
        this.age = 0;
        System.out.println("Values are not ok.");
    }
    

    public String getName() {
        return name;
    }

    public Astronaut setName(String name) {
        if(name.isEmpty()) {
            System.out.println("Name is too short!");
            return this;
        }
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Astronaut setAge(int age) {
        if (age < 0 || age > 130) {
            System.out.println("Age is wrong!");
            return this;
        }
        this.age = age;
        return this;
    }  
  
  
    
    
    
    
    public void printInfo() {
        System.out.println("Hi, my name is " + getName() + " and I am " + getAge() + " years old.");
        doPrivateThings();
    }
    
    private void doPrivateThings() {
        System.out.println("Doing private things");
    }
    
    
}
