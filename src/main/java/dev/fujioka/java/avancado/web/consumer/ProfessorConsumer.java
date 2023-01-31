package dev.fujioka.java.avancado.web.consumer;

import dev.fujioka.java.avancado.web.model.Professor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ProfessorConsumer {

    @JmsListener(destination = "nome_professor_queue")
    public void receiveMessage(Professor professor){
        System.out.println(professor.getNome());
    }

}
