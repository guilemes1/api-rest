package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter                        //Anotação Lombok para gerar os métodos getters
@NoArgsConstructor             //Anotação Lombok para gerar o construtor default sem argumentos
@AllArgsConstructor            //Anotação Lombok para gerar o construtor que recebe todos os campos
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String uf;
}
