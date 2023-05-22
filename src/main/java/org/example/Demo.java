package org.example;

import org.example.observers.InfiniteLoopObserver;
import org.example.observers.ProgramObserver;
import org.example.observers.ProgramTerminatedObserver;
import org.example.subjects.ProgramSubject;

public class Demo {
    public void demo() {
        // Crear el sujeto del programa
        ProgramSubject programSubject = new ProgramSubject();

        // Crear los observadores
        ProgramObserver terminatedObserver = new ProgramTerminatedObserver();
        ProgramObserver infiniteLoopObserver = new InfiniteLoopObserver();

        // Configurar los observadores en el sujeto
        programSubject.setTerminatedObserver(terminatedObserver);
        programSubject.setInfiniteLoopObserver(infiniteLoopObserver);

        // Ejecutar el programa
        String program = "while(true) { }";  // Bucle infinito
        programSubject.runProgram(program);
    }
}



