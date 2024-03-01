package com.claseufpso.poo;

import characters.Character;

public class Poo {

    public static void main(String[] args) {
        
        Character  homero = new Character( "homero", "inspector nuclear", 33, "Doooo");
        homero.greeting ();
        System.out.println("tengo " + homero.getAge());
        
        Character Bart = new Character ();
        Bart.setPhrase("ay caramba");
        Bart.greeting ();
        
    }
}
