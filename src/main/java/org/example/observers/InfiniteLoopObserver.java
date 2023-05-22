package org.example.observers;

public class InfiniteLoopObserver implements ProgramObserver {
    @Override
    public void update(boolean programTerminated) {
        if (!programTerminated) {
            System.out.println("El programa ha entrado en un bucle infinito.");
        }
    }
}