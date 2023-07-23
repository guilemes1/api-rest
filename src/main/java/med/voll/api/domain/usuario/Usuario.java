package med.voll.api.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter                        //Anotação Lombok para gerar os métodos getters
@NoArgsConstructor             //Anotação Lombok para gerar o construtor default sem argumentos
@AllArgsConstructor            //Anotação Lombok para gerar o construtor que recebe todos os campos
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;
}
