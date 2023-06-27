package com.acne.email.enums;

public enum StatusEmail {

    SENT,
    ERROR;
}

// Enum em Java é um tipo de dado que permite definir um conjunto fixo de constantes nomeadas. Ele é usado para representar opções pré-definidas, como dias da semana ou tipos de animais. Os enums melhoram a legibilidade e a robustez do código, evitando o uso de valores literais e oferecendo uma forma clara de representar escolhas restritas. NESTE CASO O ENUM FOI CRIADO PARA DEFINIR STATUS DE EMAIL, SENDO UTILIZADO NA CLASSE EmailModel para poder constar SE O EMAIL FOI ENVIADO COM SUCESSO OU SE HOUVE ERRO.