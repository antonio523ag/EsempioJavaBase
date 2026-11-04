package sealed;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Persona p =new Persona("Antonio","Grillo","S Maria C. Vetere", LocalDate.of(1989,12,7));
        System.out.println(p.nome());
        String nome="Alberto";
        String stato="Accettata";
        String s= """
                Ciao \{nome}
                la tua richiesta di ferie è stata \{stato}
                """;
    }
}
