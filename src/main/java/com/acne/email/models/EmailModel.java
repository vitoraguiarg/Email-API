package com.acne.email.models;

import com.acne.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data // Essa anotação do LOMBOK Combina todas as funcionalidades de @Getter, @Setter, métodos construtores.
@Entity // Define a classe como uma ENTIDADE do banco de dados.
@Table(name = "TB_EMAIL") // Define a classe como uma TABELA e também define o NOME da TABELA.
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L; // Configuração de Serialização da classe.

    @Id // Define que o atributo emailId será o ID do produto.
    @GeneratedValue(strategy = GenerationType.AUTO) // Define que a geração do produto será automática
    private long emailId;
    private String ownerRef; // Referência o proprietário que está enviando a mensagem (Afim de depois passar o ID do usuário pra quem vai ser enviado o email.
    private String emailFrom; // Referência de quem está enviando o email.
    private String emailTo; // Referência de quem irá receber o email.
    private String subject; // Campo de título do email.
    @Column(columnDefinition = "TEXT") // Esse "columnDefinition" é para que não tenha limite de caracteres.
    private String text; // Campo de corpo onde o email será escrito.
    private LocalDateTime sendDateEmail; // Data em que será enviado o email.
    private StatusEmail statusEmail; // Enum para saber se o status do email foi enviado corretamente ou houve erro.
}