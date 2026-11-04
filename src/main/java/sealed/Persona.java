package sealed;

import java.time.LocalDate;

public record Persona(String nome, String cognome, String luogoNascita, LocalDate dataNascita) {

    public String presentati(){
        return "ciao, sono "+nome+" "+cognome;
    }
}
