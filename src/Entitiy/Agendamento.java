package Entitiy;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nomeCliente;
    private String email;
    private String telefone;

    private LocalDate data;
    private LocalTime hora;

}
