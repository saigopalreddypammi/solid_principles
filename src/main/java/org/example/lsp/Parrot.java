package org.example.lsp;

public class Parrot implements Walkingbird,Flyingbird {
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void walk() {
        System.out.println("Parrot is walking");
    }
}
