package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank                 //Anotação BeanValidation (checa se o nome não esta nulo ou vazio)
        String nome,
        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")       //Anotação de Validação para dizer que o campo crm possui um numero padrão de 4 a 6 digitos
        String crm,
        @NotNull                            //Não é NotBlank pois não é uma String
        Especialidade especialidade,
        @NotNull
        @Valid                              //Pede para o BeanValidation validar tambem os campos da DTO DadosEndereco
        DadosEndereco endereco) {
}
