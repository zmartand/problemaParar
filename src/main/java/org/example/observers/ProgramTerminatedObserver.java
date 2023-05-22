package org.example.observers;

public class ProgramTerminatedObserver implements ProgramObserver {
    @Override
    public void update(boolean programTerminated) {
        if (programTerminated) {
            System.out.println("El programa ha terminado su ejecución.");
        }
    }
}