package med.voll.api.domain.consulta;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.medico.Especialidade;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future //Validação para que só sejam inseridas datas do futuro
        //@JsonFormat(pattern = "dd/MM/yyyy HH:00:00")
        LocalDateTime data,

        Especialidade especialidade )// Inserido para casos em que o médico não é informado, porem escolhe-se uma especialidade
                                     // Desse modo sera possivel trazer um médico aleatório com a especialidade informada
        {
}
