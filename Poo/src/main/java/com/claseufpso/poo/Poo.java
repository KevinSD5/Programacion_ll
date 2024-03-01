package com.claseufpso.poo;

public class Poo {

    public static void main(String[] args) {
        
        Character  homero = new Character( "homero", "inspector nuclear", 33, "Doooo");
        homero.greeting ();
        
        Character Bart = new Character ("Bartolomeo", "Vago", 10, "Ay caramba");
        Bart.greeting ();
    }
   static class Character {
        String name;
        String occupation;
        int age;
        String phrase;

        public Character(String name, String occupation, int age, String phrase) {
            this.name = name;
            this.occupation = occupation;
            this.age = age;
            this.phrase = phrase;
        }
        
        
        void greeting (){
            System.out.println(this.phrase);
            System.out.println("soy " + this.name);
            System.out.println("y tengo " + this.age + " años");
            System.out.println("y valgo vrga en el trabajo de " + this.occupation);
            System.out.println(" ");
        }
    }
}
