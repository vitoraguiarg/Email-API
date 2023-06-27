package com.acne.email.services;

import com.acne.email.enums.StatusEmail;
import com.acne.email.models.EmailModel;
import com.acne.email.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service // @Service define a classe como um Bean do Spring do tipo service.
public class EmailService {

    // Ponto de injeção do EmailRepository para conseguir criar os métodos para fazer a persistência com o banco de dados.
    @Autowired
    EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSender;

    public void sendEmail(EmailModel emailModel) {
        emailModel.setSendDateEmail(LocalDateTime.now());
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(emailModel.getEmailFrom());
            message.setTo(emailModel.getEmailTo());
            message.setSubject(emailModel.getSubject());
            message.setText(emailModel.getText());
            emailSender.send(message);

            emailModel.setStatusEmail(StatusEmail.SENT);
        } catch (MailException e) {
            emailModel.setStatusEmail(StatusEmail.ERROR);
        } finally {
            emailRepository.save(emailModel);
            return;
        }
    }
}

// A camada de serviço em um código é responsável por conter a lógica de negócio da aplicação. Ela realiza operações complexas, coordena as interações entre as diferentes partes do sistema e fornece serviços abstratos para as camadas superiores. A camada de serviço ajuda a separar a lógica de negócio das camadas de apresentação e acesso a dados, promovendo uma melhor organização e manutenção do código.


