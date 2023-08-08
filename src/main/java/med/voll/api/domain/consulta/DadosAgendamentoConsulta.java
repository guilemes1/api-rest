package med.voll.api.domain.consulta;

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
        LocalDateTime data,

        Especialidade especialidade )// Inserido para casos em que o médico não é informado, porem escolhe-se uma especialidade
                                     // Desse modo sera possivel trazer um médico aleatório com a especialidade informada
        {
}
