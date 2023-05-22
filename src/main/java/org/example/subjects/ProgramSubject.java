package org.example.subjects;

import org.example.observers.ProgramObserver;
public class ProgramSubject {
    private boolean programTerminated;
    private ProgramObserver terminatedObserver;
    private ProgramObserver infiniteLoopObserver;

    public void setTerminatedObserver(ProgramObserver observer) {
        terminatedObserver = observer;
    }

    public void setInfiniteLoopObserver(ProgramObserver observer) {
        infiniteLoopObserver = observer;
    }

    public void runProgram(String program) {
        /* Ejecutar el programa
         Aquí, se produciría algún tipo de lógica para determinar si el programa termina o entra en un bucle infinito.
        En el contexto del problema de la parada de Turing, esto no se puede resolver en general.*/

        // Simplemente se establecerá un valor aleatorio para programTerminated
        programTerminated = Math.random() < 0.5;

        if (programTerminated && terminatedObserver != null) {
            terminatedObserver.update(programTerminated);
        } else if (!programTerminated && infiniteLoopObserver != null) {
            infiniteLoopObserver.update(programTerminated);
        }
    }
}