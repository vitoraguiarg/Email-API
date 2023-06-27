package com.acne.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class EmailDto {
    @NotBlank // @NotBlank exige que o campo não seja em branco pois será necessário saber quem é o remetente do email.
    private String ownerRef;
    @NotBlank
    @Email // @Email faz uma validação para saber se o Email possui um formato válido.
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;

}

// Ao aplicar a anotação @Email a um campo ou método getter de uma propriedade, o Spring irá verificar se o valor fornecido corresponde a um formato de e-mail válido, de acordo com as regras definidas pelo endereço de e-mail RFC (RFC 5322). Se o valor não for um e-mail válido, uma exceção de validação será lançada.



// Em Java, DTO (Data Transfer Object) é um padrão de projeto que representa um objeto simples que transporta dados entre camadas ou componentes de um sistema. Um DTO é uma classe com atributos e métodos de acesso que serve para encapsular dados e transferi-los de forma eficiente e organizada, evitando o envio desnecessário de objetos complexos ou entidades completas. Geralmente, os DTOs são usados em operações de leitura e gravação de dados em bancos de dados ou em comunicação entre sistemas distribuídos.


