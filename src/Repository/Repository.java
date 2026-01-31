import java.time.LocalDate;
import java.time.LocalTime;

public interface AgendamentoRepository
    extends JpaRepository <Agendamendamento, Long> {

    boolean existsByDataAndHora (LocalDate data, LocalTime hora);
}