package com.acne.email.repositories;

import com.acne.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
// Extender a classe JpaRepository nos permitirá utilizar de métodos prontos como FindAll, FindById, Save, Delete  etc.
// Uma interface Repository em um código separa a lógica de acesso a dados das outras partes do programa. Ela define um conjunto de operações (métodos) para manipular dados em um banco de dados. A interface Repository permite que diferentes implementações lidem com diferentes tecnologias de armazenamento, enquanto o restante do código não precisa se preocupar com esses detalhes. Isso facilita a testabilidade e a flexibilidade da aplicação.